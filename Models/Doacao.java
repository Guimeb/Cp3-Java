package Models;
import java.util.Date;

public class Doacao {
    private Doador doador;
    private InstituicaoCaridade instituicaoBeneficiada;
    private String tipoDoacao;
    private Date dataDoacao;

    public Doacao(Doador doador, InstituicaoCaridade instituicaoBeneficiada, String tipoDoacao, Date dataDoacao) {
        this.doador = doador;
        this.instituicaoBeneficiada = instituicaoBeneficiada;
        this.tipoDoacao = tipoDoacao;
        this.dataDoacao = dataDoacao;
    }

    // Getters e Setters
    public Doador getDoador() {
        return doador;
    }

    public void setDoador(Doador doador) {
        this.doador = doador;
    }

    public InstituicaoCaridade getInstituicaoBeneficiada() {
        return instituicaoBeneficiada;
    }

    public void setInstituicaoBeneficiada(InstituicaoCaridade instituicaoBeneficiada) {
        this.instituicaoBeneficiada = instituicaoBeneficiada;
    }

    public String getTipoDoacao() {
        return tipoDoacao;
    }

    public void setTipoDoacao(String tipoDoacao) {
        this.tipoDoacao = tipoDoacao;
    }

    public Date getDataDoacao() {
        return dataDoacao;
    }

    public void setDataDoacao(Date dataDoacao) {
        this.dataDoacao = dataDoacao;
    }
}
