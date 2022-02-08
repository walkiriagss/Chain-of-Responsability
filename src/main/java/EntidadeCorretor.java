public class EntidadeCorretor extends  Entidade{

    public EntidadeCorretor(Entidade superior) {
        listaFases.add(ProcessoEncontrarImovel.getProcessoEncontrarImovel());
        setEntidadeSuperior(superior);
    }

    public String getDescricaoEntidade() {
        return "Corretor";
    }
}
