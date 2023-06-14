package tr.gov.mhrs.akademi.springsecondlevelcache.repository;

import tr.gov.mhrs.akademi.springsecondlevelcache.entity.Kitap;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KitapRepository extends JpaRepository<Kitap,Long> {


}
