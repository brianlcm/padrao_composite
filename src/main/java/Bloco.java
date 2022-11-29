import java.util.ArrayList;
import java.util.List;

public class Bloco extends Informacao {

    private List<Informacao> apartamentos;

    public Bloco(String descricao) {
        super(descricao);
        this.apartamentos = new ArrayList<Informacao>();
    }

    public void addApartamento(Informacao apartamento) {
        this.apartamentos.add(apartamento);
    }

    public String getInformacao() {
        String saida = "";
        saida = "Bloco: " + this.getInfo() + "\n";
        for (Informacao apartamento : apartamentos) {
            saida += apartamento.getInformacao();
        }
        return saida;
    }

}
