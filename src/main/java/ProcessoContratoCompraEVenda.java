public class ProcessoContratoCompraEVenda implements Processo{

    private static ProcessoContratoCompraEVenda processoContratoCompraEVenda = new ProcessoContratoCompraEVenda();

    private ProcessoContratoCompraEVenda() {};

    public static ProcessoContratoCompraEVenda getProcessoContratoCompraEVenda() {
        return processoContratoCompraEVenda;
    }
}
