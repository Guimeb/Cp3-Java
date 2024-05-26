package models;

/**
 * Representa um voluntário que oferece seu tempo e habilidades para uma instituição de caridade.
 */
public class Voluntario {
    private String nome;
    private String cpf;
    private String endereco;
    private String contato;
    private String disponibilidadeHorario;
    private String habilidadesInteresses;

    /**
     * Constrói uma nova instância de Voluntario.
     * 
     * @param nome O nome do voluntário.
     * @param cpf O CPF do voluntário.
     * @param endereco O endereço do voluntário.
     * @param contato O contato do voluntário.
     * @param disponibilidadeHorario A disponibilidade de horário do voluntário.
     * @param habilidadesInteresses As habilidades e interesses do voluntário.
     */
    public Voluntario(String nome, String cpf, String endereco, String contato, String disponibilidadeHorario, String habilidadesInteresses) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contato = contato;
        this.disponibilidadeHorario = disponibilidadeHorario;
        this.habilidadesInteresses = habilidadesInteresses;
    }

    /**
     * Retorna o nome do voluntário.
     * 
     * @return O nome do voluntário.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do voluntário.
     * 
     * @param nome O nome a ser definido.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o CPF do voluntário.
     * 
     * @return O CPF do voluntário.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o CPF do voluntário.
     * 
     * @param cpf O CPF a ser definido.
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Retorna o endereço do voluntário.
     * 
     * @return O endereço do voluntário.
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o endereço do voluntário.
     * 
     * @param endereco O endereço a ser definido.
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Retorna o contato do voluntário.
     * 
     * @return O contato do voluntário.
     */
    public String getContato() {
        return contato;
    }

    /**
     * Define o contato do voluntário.
     * 
     * @param contato O contato a ser definido.
     */
    public void setContato(String contato) {
        this.contato = contato;
    }

    /**
     * Retorna a disponibilidade de horário do voluntário.
     * 
     * @return A disponibilidade de horário do voluntário.
     */
    public String getDisponibilidadeHorario() {
        return disponibilidadeHorario;
    }

    /**
     * Define a disponibilidade de horário do voluntário.
     * 
     * @param disponibilidadeHorario A disponibilidade de horário a ser definida.
     */
    public void setDisponibilidadeHorario(String disponibilidadeHorario) {
        this.disponibilidadeHorario = disponibilidadeHorario;
    }

    /**
     * Retorna as habilidades e interesses do voluntário.
     * 
     * @return As habilidades e interesses do voluntário.
     */
    public String getHabilidadesInteresses() {
        return habilidadesInteresses;
    }

    /**
     * Define as habilidades e interesses do voluntário.
     * 
     * @param habilidadesInteresses As habilidades e interesses a serem definidos.
     */
    public void setHabilidadesInteresses(String habilidadesInteresses) {
        this.habilidadesInteresses = habilidadesInteresses;
    }
}
