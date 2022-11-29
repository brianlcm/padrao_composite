import java.util.ArrayList;
import java.util.List;

public class Apartamento extends Informacao {

    public Apartamento(String descricao) {
        super(descricao);
    }

    @Override
    public String getInformacao() {
        return "Apartamento " + this.getInfo() + "\n";
    }
}
