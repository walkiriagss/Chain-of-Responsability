
public class ProcessoContratoFinanciamento implements Processo{

    private static ProcessoContratoFinanciamento processoContratoFinanciamento = new ProcessoContratoFinanciamento();

    private ProcessoContratoFinanciamento() {};

    public static ProcessoContratoFinanciamento getProcessoContratoFinanciamento() {
        return processoContratoFinanciamento;
    }
}
