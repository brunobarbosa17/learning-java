package devdojo.studybruno.springboot2essentials.controller;

import devdojo.studybruno.springboot2essentials.domain.Anime;
import devdojo.studybruno.springboot2essentials.service.AnimeService;
import devdojo.studybruno.springboot2essentials.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@Log4j2
@RequiredArgsConstructor // Utilizando o construtor para injeção de dependencias, evitando o uso do @AutoWired
public class AnimeController {

  private final DateUtil dateUtil;
  private final AnimeService animeService;

  @GetMapping("/animes/list")
  public ResponseEntity<List<Anime>> list() {
    log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
    return ResponseEntity.ok(animeService.listAll());
  }

  @GetMapping(path = "/animes/{id}")
  public ResponseEntity<Anime> findById(@PathVariable long id) {
    return ResponseEntity.ok(animeService.findById(id));
  }

  @PostMapping("/animes/cadastrar")
  public ResponseEntity<Anime> save(@RequestBody Anime anime) {
    return new ResponseEntity<>(animeService.save(anime), HttpStatus.CREATED);
  }

  @DeleteMapping("/animes/delete/{id}")
  public ResponseEntity<?> delete(@PathVariable long id) {
    animeService.delete(id);
    return ResponseEntity.noContent().build();
  }

}
