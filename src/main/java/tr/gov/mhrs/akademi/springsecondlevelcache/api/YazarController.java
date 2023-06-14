package tr.gov.mhrs.akademi.springsecondlevelcache.api;

import lombok.RequiredArgsConstructor;
import tr.gov.mhrs.akademi.springsecondlevelcache.entity.Yazar;
import tr.gov.mhrs.akademi.springsecondlevelcache.repository.YazarRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/yazar")
@RequiredArgsConstructor
public class YazarController {
  private final YazarRepository yazarRepository;

  @GetMapping("/{yazarId}")
  public Yazar findYazarById(@PathVariable("yazarId") Long yazarId){
    return yazarRepository.findById(yazarId).get();
  }

  @PostMapping
  public Yazar save(@RequestBody Yazar yazar){
    return yazarRepository.save(yazar);
  }

}
