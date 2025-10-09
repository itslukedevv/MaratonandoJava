package MaratonandoJava.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica"), ;

    public int VALOR;
    private String nomeRelatorio;
    TipoCliente(int VALOR, String nomeRelatorio) {
        this.VALOR = VALOR;
        this.nomeRelatorio = nomeRelatorio;
    }


    public static TipoCliente tipoClientePorRelatorio(String nomeRelatorio) {
        for (TipoCliente tipoClient : values()) {
            if (tipoClient.nomeRelatorio.equals(nomeRelatorio)) {
                return tipoClient;
            }
        }
        return null;
    }

    public int getVALOR() {
        return VALOR;
    }

    public void setVALOR(int VALOR) {
        this.VALOR = VALOR;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public void setNomeRelatorio(String nomeRelatorio) {
        this.nomeRelatorio = nomeRelatorio;
    }
}
