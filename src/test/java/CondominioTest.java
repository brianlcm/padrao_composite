import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CondominioTest {

    @Test
    void deveRetornarEnderecoCondominio() {
        Bloco bloco1 = new Bloco("Bloco A");
        Apartamento aparamento11 = new Apartamento("AP 105");
        bloco1.addApartamento(aparamento11);

        Bloco bloco2 = new Bloco("Bloco B");
        Apartamento aparamento21 = new Apartamento("AP 201");
        Apartamento aparamento22 = new Apartamento("AP 301");
        bloco2.addApartamento(aparamento21);
        bloco2.addApartamento(aparamento22);

        Bloco blocos = new Bloco("Blocos");
        blocos.addApartamento(bloco1);
        blocos.addApartamento(bloco2);

        Condominio condominio = new Condominio();
        condominio.setCondominio(blocos);

        assertEquals("Bloco: Blocos\n" +
                "Bloco: Bloco A\n" +
                "Apartamento AP 105\n" +
                "Bloco: Bloco B\n" +
                "Apartamento AP 201\n" +
                "Apartamento AP 301\n",condominio.getInfo());
    }

    @Test
    void deveRetornarExecacaoCondominioSemBloco() {
        try {
            Condominio condominio = new Condominio();
            condominio.getInfo();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Condomínio sem informação", e.getMessage());
        }
    }

}
