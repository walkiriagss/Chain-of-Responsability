public class ProcessoMudanca implements Processo{

    private static ProcessoMudanca processoMudanca = new ProcessoMudanca();

    private ProcessoMudanca() {};

    public static ProcessoMudanca getProcessoMudanca() {
        return processoMudanca;
    }
}
