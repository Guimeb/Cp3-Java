package models;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa uma instituição de caridade que recebe doações e possui voluntários.
 */
public class InstituicaoCaridade {
    private String nome;
    private String cnpj;
    private String endereco;
    private String contato;
    private String areaAtuacao;
    private List<Voluntario> voluntarios;
    private List<Doacao> historicoDoacoes;

    /**
     * Constrói uma nova instância de InstituicaoCaridade.
     * 
     * @param nome O nome da instituição de caridade.
     * @param cnpj O CNPJ da instituição de caridade.
     * @param endereco O endereço da instituição de caridade.
     * @param contato O contato da instituição de caridade.
     * @param areaAtuacao A área de atuação da instituição de caridade.
     */
    public InstituicaoCaridade(String nome, String cnpj, String endereco, String contato, String areaAtuacao) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.contato = contato;
        this.areaAtuacao = areaAtuacao;
        this.voluntarios = new ArrayList<>();
        this.historicoDoacoes = new ArrayList<>();
    }

    /**
     * Adiciona um voluntário à lista de voluntários da instituição.
     * 
     * @param voluntario O voluntário a ser adicionado.
     */
    public void adicionarVoluntario(Voluntario voluntario) {
        this.voluntarios.add(voluntario);
    }

    /**
     * Adiciona uma doação ao histórico de doações da instituição.
     * 
     * @param doacao A doação a ser adicionada.
     */
    public void adicionarDoacao(Doacao doacao) {
        this.historicoDoacoes.add(doacao);
    }

    /**
     * Método placeholder. (A ser implementado ou removido se não necessário).
     */
    public void getInstituicao() {
        // Método não implementado.
    }

    /**
     * Retorna o nome da instituição de caridade.
     * 
     * @return O nome da instituição de caridade.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da instituição de caridade.
     * 
     * @param nome O nome a ser definido.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o CNPJ da instituição de caridade.
     * 
     * @return O CNPJ da instituição de caridade.
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Define o CNPJ da instituição de caridade.
     * 
     * @param cnpj O CNPJ a ser definido.
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * Retorna o endereço da instituição de caridade.
     * 
     * @return O endereço da instituição de caridade.
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o endereço da instituição de caridade.
     * 
     * @param endereco O endereço a ser definido.
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Retorna o contato da instituição de caridade.
     * 
     * @return O contato da instituição de caridade.
     */
    public String getContato() {
        return contato;
    }

    /**
     * Define o contato da instituição de caridade.
     * 
     * @param contato O contato a ser definido.
     */
    public void setContato(String contato) {
        this.contato = contato;
    }

    /**
     * Retorna a área de atuação da instituição de caridade.
     * 
     * @return A área de atuação da instituição de caridade.
     */
    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    /**
     * Define a área de atuação da instituição de caridade.
     * 
     * @param areaAtuacao A área de atuação a ser definida.
     */
    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    /**
     * Retorna a lista de voluntários da instituição de caridade.
     * 
     * @return A lista de voluntários.
     */
    public List<Voluntario> getVoluntarios() {
        return voluntarios;
    }

    /**
     * Retorna o histórico de doações da instituição de caridade.
     * 
     * @return A lista de doações feitas à instituição.
     */
    public List<Doacao> getHistoricoDoacoes() {
        return historicoDoacoes;
    }
}
