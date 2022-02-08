import java.util.ArrayList;

public abstract class Entidade {

    protected ArrayList listaFases = new ArrayList();
    private Entidade entidadeSuperior;

    public Entidade getEntidadeSuperior() {
        return entidadeSuperior;
    }

    public void setEntidadeSuperior(Entidade entidadeSuperior) {
        this.entidadeSuperior = entidadeSuperior;
    }

    public abstract String getDescricaoEntidade();

    public String realizarProcesso(Fase fase) {
        if (listaFases.contains(fase.getProcesso())) {
            return getDescricaoEntidade();
        }
        else {
            if (entidadeSuperior != null) {
                return entidadeSuperior.realizarProcesso(fase);
            }
            else
            {
                return "Sem procedimentos burocráticos";
            }
        }
    }
}
