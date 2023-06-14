package tr.gov.mhrs.akademi.springsecondlevelcache;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching

public class Conf {

  @Bean
  public RedissonClient redissonClient() {
    Config config = new Config();
    config.setThreads(128).setNettyThreads(128).useSingleServer().setAddress("redis://localhost:6379");
    return Redisson.create(config);
  }


}
