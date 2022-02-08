public class ProcessoGerarDocumentos implements Processo{

    private static ProcessoGerarDocumentos processoGerarDocumentos = new ProcessoGerarDocumentos();

    private ProcessoGerarDocumentos() {};

    public static ProcessoGerarDocumentos getProcessoGerarDocumentos() {
        return processoGerarDocumentos;
    }
}
