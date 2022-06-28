//package br.com.alura.forum;
//
//import br.com.alura.forum.modelo.Curso;
//import br.com.alura.forum.repository.CursoRepository;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.junit4.SpringRunner;
//
//@DataJpaTest
//@RunWith(SpringRunner.class)
//
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE) // Anotacao para nao substituir
//// o banco para H2
//@ActiveProfiles("test")
//public class CursoRepositoryTest {
//
//    @Autowired
//    private CursoRepository repository;
//
//    @Autowired
//    private TestEntityManager entityManager;
//
//    @Test
//    public void returnCursoAfterSearchByName() {
//        Curso html5 = new Curso();
//        html5.setNome("HTML 5");
//        html5.setCategoria("Programacao");
//        Curso curso = repository.findByNome("HTML 5");
//        Assert.assertNotNull(curso);
//        Assert.assertEquals("HTML 5", curso.getNome());
//    }
//
//    @Test
//    public void notReturnCursoIfNameNotEquals() {
//        Curso curso = repository.findByNome("JPA");
//        Assert.assertNull(curso);
//    }
//}
