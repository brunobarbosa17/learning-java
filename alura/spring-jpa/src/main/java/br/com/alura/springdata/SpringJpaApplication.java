package br.com.alura.springdata;

import br.com.alura.springdata.orm.Cargo;
import br.com.alura.springdata.repository.CargoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaApplication implements CommandLineRunner {

    private final CargoRepository repository;

    public SpringJpaApplication(CargoRepository repository){
        this.repository = repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Cargo cargo = new Cargo();
        cargo.setDescricao("Desenvolvedor de Software");
        repository.save(cargo);
    }
}
