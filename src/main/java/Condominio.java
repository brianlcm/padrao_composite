public class Condominio {

    private Informacao info;

    public void setCondominio(Informacao info) {
        this.info = info;
    }

    public String getInfo() {
        if (this.info == null) {
            throw new NullPointerException("Condomínio sem informação");
        }
        return this.info.getInformacao();
    }
}
