package tr.gov.mhrs.akademi.springsecondlevelcache.api;

import lombok.RequiredArgsConstructor;
import tr.gov.mhrs.akademi.springsecondlevelcache.entity.Kitap;
import tr.gov.mhrs.akademi.springsecondlevelcache.entity.Yazar;
import tr.gov.mhrs.akademi.springsecondlevelcache.repository.KitapRepository;
import tr.gov.mhrs.akademi.springsecondlevelcache.repository.YazarRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kitap")
@RequiredArgsConstructor
public class KitapController {
  private final KitapRepository kitapRepository;

  @GetMapping("/{kitapId}")
  public Kitap findYazarById(@PathVariable("kitapId") Long kitapId){
    return kitapRepository.findById(kitapId).get();
  }

  @PostMapping
  public Kitap save(@RequestBody Kitap yazar){
    return kitapRepository.save(yazar);
  }

}
