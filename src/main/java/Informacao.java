public abstract class Informacao {
    private String info;

    public Informacao(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public abstract String getInformacao();
}
