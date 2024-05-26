package Models;

public class Voluntario {
    private String nome;
    private String cpf;
    private String endereco;
    private String contato;
    private String disponibilidadeHorario;
    private String habilidadesInteresses;

    public Voluntario(String nome, String cpf, String endereco, String contato, String disponibilidadeHorario, String habilidadesInteresses) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contato = contato;
        this.disponibilidadeHorario = disponibilidadeHorario;
        this.habilidadesInteresses = habilidadesInteresses;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getDisponibilidadeHorario() {
        return disponibilidadeHorario;
    }

    public void setDisponibilidadeHorario(String disponibilidadeHorario) {
        this.disponibilidadeHorario = disponibilidadeHorario;
    }

    public String getHabilidadesInteresses() {
        return habilidadesInteresses;
    }

    public void setHabilidadesInteresses(String habilidadesInteresses) {
        this.habilidadesInteresses = habilidadesInteresses;
    }
}
