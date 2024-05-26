package models;

import java.time.LocalDate;

/**
 * Representa uma doação feita por um doador a uma instituição de caridade.
 */
public class Doacao {
    private Doador doador;
    private InstituicaoCaridade instituicaoBeneficiada;
    private String tipoDoacao;
    private LocalDate dataDoacao;

    /**
     * Constrói uma nova instância de Doacao.
     * 
     * @param doador O doador que fez a doação.
     * @param instituicaoBeneficiada A instituição de caridade que recebeu a doação.
     * @param tipoDoacao O tipo de doação (ex: alimentos, roupas, dinheiro).
     * @param dataDoacao A data em que a doação foi feita.
     */
    public Doacao(Doador doador, InstituicaoCaridade instituicaoBeneficiada, String tipoDoacao, LocalDate dataDoacao) {
        this.doador = doador;
        this.instituicaoBeneficiada = instituicaoBeneficiada;
        this.tipoDoacao = tipoDoacao;
        this.dataDoacao = dataDoacao;
    }

    /**
     * Retorna o doador que fez a doação.
     * 
     * @return O doador.
     */
    public Doador getDoador() {
        return doador;
    }

    /**
     * Define o doador que fez a doação.
     * 
     * @param doador O doador a ser definido.
     */
    public void setDoador(Doador doador) {
        this.doador = doador;
    }

    /**
     * Retorna a instituição de caridade que recebeu a doação.
     * 
     * @return A instituição de caridade.
     */
    public InstituicaoCaridade getInstituicaoBeneficiada() {
        return instituicaoBeneficiada;
    }

    /**
     * Define a instituição de caridade que recebeu a doação.
     * 
     * @param instituicaoBeneficiada A instituição de caridade a ser definida.
     */
    public void setInstituicaoBeneficiada(InstituicaoCaridade instituicaoBeneficiada) {
        this.instituicaoBeneficiada = instituicaoBeneficiada;
    }

    /**
     * Retorna o tipo de doação.
     * 
     * @return O tipo de doação.
     */
    public String getTipoDoacao() {
        return tipoDoacao;
    }

    /**
     * Define o tipo de doação.
     * 
     * @param tipoDoacao O tipo de doação a ser definido.
     */
    public void setTipoDoacao(String tipoDoacao) {
        this.tipoDoacao = tipoDoacao;
    }

    /**
     * Retorna a data em que a doação foi feita.
     * 
     * @return A data da doação.
     */
    public LocalDate getDataDoacao() {
        return dataDoacao;
    }

    /**
     * Define a data em que a doação foi feita.
     * 
     * @param dataDoacao A data da doação a ser definida.
     */
    public void setDataDoacao(LocalDate dataDoacao) {
        this.dataDoacao = dataDoacao;
    }
}
