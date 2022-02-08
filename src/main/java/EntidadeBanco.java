
public class EntidadeBanco extends  Entidade{

    public EntidadeBanco(Entidade superior) {
        listaFases.add(ProcessoContratoFinanciamento.getProcessoContratoFinanciamento());
        setEntidadeSuperior(superior);
    }

    public String getDescricaoEntidade() {
        return "Banco";
    }
}
