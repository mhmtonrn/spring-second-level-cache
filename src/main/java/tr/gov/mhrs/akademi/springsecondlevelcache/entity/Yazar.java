package tr.gov.mhrs.akademi.springsecondlevelcache.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.cache.annotation.Cacheable;

@Entity
@Table(name = "yazar", schema = "operation")
@Cacheable(cacheNames = "Yazar")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Yazar")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Yazar implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String adi;

  private String soyadi;

}
