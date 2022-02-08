public class EntidadeCartorio extends  Entidade{

    public EntidadeCartorio(Entidade superior) {
        listaFases.add(ProcessoGerarDocumentos.getProcessoGerarDocumentos());
        setEntidadeSuperior(superior);
    }

    public String getDescricaoEntidade() {
        return "Cartório";
    }
}
