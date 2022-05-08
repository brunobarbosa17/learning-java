package devdojo.studybruno.controller;

import devdojo.studybruno.domain.Anime;
import devdojo.studybruno.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@Log4j2
@RequiredArgsConstructor
public class AnimeController {

  private final DateUtil dateUtil;

  @GetMapping("/anime/list")
  public List<Anime> list() {
    log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
    return List.of(new Anime("Naruto"), new Anime("DBZ"), new Anime("Death Note"));
  }
}
