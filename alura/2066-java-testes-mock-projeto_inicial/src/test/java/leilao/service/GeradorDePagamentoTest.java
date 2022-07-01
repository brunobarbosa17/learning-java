package leilao.service;

import br.com.alura.leilao.dao.LeilaoDao;
import br.com.alura.leilao.dao.PagamentoDao;
import br.com.alura.leilao.model.Lance;
import br.com.alura.leilao.model.Leilao;
import br.com.alura.leilao.model.Pagamento;
import br.com.alura.leilao.model.Usuario;
import br.com.alura.leilao.service.EnviadorDeEmails;
import br.com.alura.leilao.service.FinalizarLeilaoService;
import br.com.alura.leilao.service.GeradorDePagamento;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GeradorDePagamentoTest {

  private GeradorDePagamento gerador;
  @Mock
  private PagamentoDao pagamentoDao;

  @Captor
  private ArgumentCaptor<Pagamento> captor;

  @BeforeEach
  public void beforeEach() {
    MockitoAnnotations.initMocks(this);
    this.gerador = new GeradorDePagamento(pagamentoDao);
  }

  @Test
  void deveriaCriarPagamentoParaVencedorDoLeilao() {
    Leilao leilao = leiloes();
    Lance lanceVencedor = leilao.getLanceVencedor();
    gerador.gerarPagamento(lanceVencedor);

    Mockito.verify(pagamentoDao).salvar(captor.capture());

    Pagamento pagamento = captor.getValue();
    Assertions.assertEquals(LocalDate.now().plusDays(1),
            pagamento.getVencimento());
    Assertions.assertEquals(lanceVencedor.getValor(), pagamento.getValor());
    Assertions.assertFalse(pagamento.getPago());
    Assertions.assertEquals(lanceVencedor.getUsuario(), pagamento.getUsuario());
    Assertions.assertEquals(leilao, pagamento.getLeilao());
  }



  private Leilao leiloes() {
    Leilao leilao = new Leilao("Celular",
            new BigDecimal("500"),
            new Usuario("Fulano"));

    Lance segundo = new Lance(new Usuario("Ciclano"),
            new BigDecimal("900"));

    leilao.propoe(segundo);
    leilao.setLanceVencedor(segundo);
    return leilao;

  }
}
