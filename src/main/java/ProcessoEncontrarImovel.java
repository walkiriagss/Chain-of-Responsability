public class ProcessoEncontrarImovel implements Processo{

    private static ProcessoEncontrarImovel processoEncontrarImovel = new ProcessoEncontrarImovel();

    private ProcessoEncontrarImovel() {};

    public static ProcessoEncontrarImovel getProcessoEncontrarImovel() {
        return processoEncontrarImovel;
    }
}
