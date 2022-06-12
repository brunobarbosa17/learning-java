package br.com.alura.springdata;

import br.com.alura.springdata.orm.Cargo;
import br.com.alura.springdata.repository.CargoRepository;
import br.com.alura.springdata.service.CrudCargoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SpringJpaApplication implements CommandLineRunner {

    private Boolean system = true;

    private final CrudCargoService cargoService;

    public SpringJpaApplication(CrudCargoService cargoService){
        this.cargoService = cargoService;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (system) {
            System.out.println("Qual ação deseja executar?");
            System.out.println("0 - Sair");
            System.out.println("1 - Cargo");


            int acao = scanner.nextInt();
            if (acao == 1) {
               cargoService.inicial(scanner);
            } else {
                system = false;
            }
        }
    }


}
