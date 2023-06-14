package tr.gov.mhrs.akademi.springsecondlevelcache.repository;

import tr.gov.mhrs.akademi.springsecondlevelcache.entity.Yazar;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YazarRepository extends JpaRepository<Yazar,Long> {


}
