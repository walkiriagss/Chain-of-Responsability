import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class FaseTest {

    EntidadeCartorio cartorio;
    EntidadeBanco banco;
    EntidadeVendedor vendedor;
    EntidadeCorretor corretor;

    @BeforeEach
    void setUp() {
        cartorio = new EntidadeCartorio(null);
        banco = new EntidadeBanco(cartorio);
        vendedor = new EntidadeVendedor(banco);
        corretor = new EntidadeCorretor(vendedor);
    }

    @Test
    void deveRetornarCorretorEncontraImovel() {
        assertEquals("Corretor", corretor.realizarProcesso(new Fase(ProcessoEncontrarImovel.getProcessoEncontrarImovel())));
    }

    @Test
    void deveRetornarCoordenadorParaAssinaturaMatricula() {
        assertEquals("Vendedor", corretor.realizarProcesso(new Fase(ProcessoContratoCompraEVenda.getProcessoContratoCompraEVenda())));
    }

    @Test
    void deveRetornarDiretorParaAssinaturaCertificado() {
        assertEquals("Banco", corretor.realizarProcesso(new Fase(ProcessoContratoFinanciamento.getProcessoContratoFinanciamento())));
    }

    @Test
    void deveRetornarReitorParaAssinaturaDiploma() {
        assertEquals("Cartório", corretor.realizarProcesso(new Fase(ProcessoGerarDocumentos.getProcessoGerarDocumentos())));
    }

    @Test
    void deveRetornarSemAssinaturaParaAssinaturaBoleto() {
        assertEquals("Sem procedimentos burocráticos", corretor.realizarProcesso(new Fase(ProcessoMudanca.getProcessoMudanca())));
    }
}