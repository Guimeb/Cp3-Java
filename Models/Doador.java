package models;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa um doador que pode fazer doações a instituições de caridade.
 */
public class Doador {
    private String nome;
    private String cpf;
    private String endereco;
    private String contato;
    private List<Doacao> historicoDoacoes;

    /**
     * Constrói uma nova instância de Doador.
     * 
     * @param nome O nome do doador.
     * @param cpf O CPF do doador.
     * @param endereco O endereço do doador.
     * @param contato O contato do doador.
     */
    public Doador(String nome, String cpf, String endereco, String contato) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contato = contato;
        this.historicoDoacoes = new ArrayList<>();
    }

    /**
     * Adiciona uma doação ao histórico de doações do doador.
     * 
     * @param doacao A doação a ser adicionada.
     */
    public void adicionarDoacao(Doacao doacao) {
        this.historicoDoacoes.add(doacao);
    }

    /**
     * Retorna o nome do doador.
     * 
     * @return O nome do doador.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do doador.
     * 
     * @param nome O nome a ser definido.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o CPF do doador.
     * 
     * @return O CPF do doador.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o CPF do doador.
     * 
     * @param cpf O CPF a ser definido.
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Retorna o endereço do doador.
     * 
     * @return O endereço do doador.
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o endereço do doador.
     * 
     * @param endereco O endereço a ser definido.
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Retorna o contato do doador.
     * 
     * @return O contato do doador.
     */
    public String getContato() {
        return contato;
    }

    /**
     * Define o contato do doador.
     * 
     * @param contato O contato a ser definido.
     */
    public void setContato(String contato) {
        this.contato = contato;
    }

    /**
     * Retorna o histórico de doações do doador.
     * 
     * @return A lista de doações feitas pelo doador.
     */
    public List<Doacao> getHistoricoDoacoes() {
        return historicoDoacoes;
    }
}
