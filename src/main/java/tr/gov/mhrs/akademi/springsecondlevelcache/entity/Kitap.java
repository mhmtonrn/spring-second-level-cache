package tr.gov.mhrs.akademi.springsecondlevelcache.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.cache.annotation.Cacheable;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "kitap", schema = "operation")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Kitap")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Kitap implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String adi;


  @UpdateTimestamp
  private LocalDateTime tarih;


  @ManyToOne
  @JoinColumn(name = "yazar_id")
  @Fetch(FetchMode.SELECT)
  private Yazar yazar;




}
