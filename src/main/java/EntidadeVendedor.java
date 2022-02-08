public class EntidadeVendedor extends  Entidade{

    public EntidadeVendedor(Entidade superior) {
        listaFases.add(ProcessoContratoCompraEVenda.getProcessoContratoCompraEVenda());
        setEntidadeSuperior(superior);
    }

    public String getDescricaoEntidade() {
        return "Vendedor";
    }
}
