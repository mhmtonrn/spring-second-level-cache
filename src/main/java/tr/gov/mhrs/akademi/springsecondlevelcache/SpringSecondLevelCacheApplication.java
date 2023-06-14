package tr.gov.mhrs.akademi.springsecondlevelcache;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import tr.gov.mhrs.akademi.springsecondlevelcache.entity.Kitap;
import tr.gov.mhrs.akademi.springsecondlevelcache.repository.KitapRepository;
import tr.gov.mhrs.akademi.springsecondlevelcache.repository.YazarRepository;

import java.util.Optional;

import org.redisson.PubSubMessageListener;
import org.redisson.api.RTopic;
import org.redisson.api.RedissonClient;
import org.redisson.api.listener.MessageListener;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
@RequiredArgsConstructor
@Slf4j
@EnableScheduling
public class SpringSecondLevelCacheApplication  {

  private final KitapRepository kitapRepository;


  public static void main(String[] args) {
    SpringApplication.run(SpringSecondLevelCacheApplication.class, args);
  }




  @Scheduled(fixedRate = 2000)
  public void pub(){
    Optional<Kitap> kit = kitapRepository.findById(1l);
    kit.get().setAdi("dvbfsd");
    kit.get().setTarih(null);
    kitapRepository.save(kit.get());
  }
}
