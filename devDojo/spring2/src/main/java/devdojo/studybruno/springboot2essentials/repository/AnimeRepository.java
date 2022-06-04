package devdojo.studybruno.springboot2essentials.repository;

import devdojo.studybruno.springboot2essentials.domain.Anime;

import java.util.List;

public class AnimeRepository {

  //

  public List<Anime> listAll() {
    return List.of(new Anime("Naruto", 123L), new Anime("DBZ", 12L), new Anime("Death Note", 456L));
  }
}
