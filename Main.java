import Models.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criando doadores
        Doador doador1 = new Doador("João Silva", "123.456.789-00", "Rua A, 123", "555-1234");
        Doador doador2 = new Doador("Maria Oliveira", "987.654.321-00", "Rua B, 456", "555-5678");
        Doador doador3 = new Doador("Pedro Santos", "456.789.123-00", "Rua C, 789", "555-9012");

        // Criando instituições de caridade
        InstituicaoCaridade instituicao1 = new InstituicaoCaridade("Caridade Exemplo 1", "12.345.678/0001-99", "Rua D, 101", "555-3456", "Saúde");
        InstituicaoCaridade instituicao2 = new InstituicaoCaridade("Caridade Exemplo 2", "98.765.432/0001-11", "Rua E, 202", "555-7890", "Educação");
        InstituicaoCaridade instituicao3 = new InstituicaoCaridade("Caridade Exemplo 3", "54.321.876/0001-22", "Rua F, 303", "555-1122", "Assistência Social");

        // Criando voluntários
        Voluntario voluntario1 = new Voluntario("Ana Costa", "111.222.333-44", "Rua G, 404", "555-3344", "Manhãs", "Enfermagem");
        Voluntario voluntario2 = new Voluntario("Bruno Lima", "555.666.777-88", "Rua H, 505", "555-5566", "Tardes", "Educação");
        Voluntario voluntario3 = new Voluntario("Carla Rocha", "999.000.111-22", "Rua I, 606", "555-7788", "Noites", "Assistência Social");

        // Adicionando voluntários às instituições
        instituicao1.adicionarVoluntario(voluntario1);
        instituicao2.adicionarVoluntario(voluntario2);
        instituicao3.adicionarVoluntario(voluntario3);

        // Criando doações
        Doacao doacao1 = new Doacao(doador1, instituicao1, "Roupas", new Date());
        Doacao doacao2 = new Doacao(doador2, instituicao2, "Alimentos", new Date());
        Doacao doacao3 = new Doacao(doador3, instituicao3, "Dinheiro", new Date());

        // Adicionando doações ao histórico dos doadores e das instituições
        doador1.adicionarDoacao(doacao1);
        instituicao1.adicionarDoacao(doacao1);

        doador2.adicionarDoacao(doacao2);
        instituicao2.adicionarDoacao(doacao2);

        doador3.adicionarDoacao(doacao3);
        instituicao3.adicionarDoacao(doacao3);

        // Exibindo informações
        System.out.println("=== Doadores ===");
        exibirDoador(doador1);
        exibirDoador(doador2);
        exibirDoador(doador3);

        System.out.println("\n=== Doações ===");
        exibirDoacao(doacao1);
        exibirDoacao(doacao2);
        exibirDoacao(doacao3);

        System.out.println("\n=== Instituições ===");
        exibirInstituicao(instituicao1);
        exibirInstituicao(instituicao2);
        exibirInstituicao(instituicao3);

        System.out.println("\n=== Voluntários ===");
        exibirVoluntario(voluntario1, instituicao1);
        exibirVoluntario(voluntario2, instituicao2);
        exibirVoluntario(voluntario3, instituicao3);
    }

    private static void exibirDoador(Doador doador) {
        System.out.println("Nome: " + doador.getNome());
        System.out.println("CPF: " + doador.getCpf());
        System.out.println("Endereço: " + doador.getEndereco());
        System.out.println("Contato: " + doador.getContato());
        System.out.println("Histórico de Doações:");
        for (Doacao d : doador.getHistoricoDoacoes()) {
            System.out.println("- " + d.getTipoDoacao() + " para " + d.getInstituicaoBeneficiada().getNome() + " em " + d.getDataDoacao());
        }
        System.out.println();
    }

    private static void exibirDoacao(Doacao doacao) {
        System.out.println("Tipo de Doação: " + doacao.getTipoDoacao());
        System.out.println("Data da Doação: " + doacao.getDataDoacao());
        System.out.println("Doador: " + doacao.getDoador().getNome());
        System.out.println("Instituição Beneficiada: " + doacao.getInstituicaoBeneficiada().getNome());
        System.out.println();
    }

    private static void exibirInstituicao(InstituicaoCaridade instituicao) {
        System.out.println("Nome: " + instituicao.getNome());
        System.out.println("CNPJ: " + instituicao.getCnpj());
        System.out.println("Endereço: " + instituicao.getEndereco());
        System.out.println("Contato: " + instituicao.getContato());
        System.out.println("Área de Atuação: " + instituicao.getAreaAtuacao());
        System.out.println("Voluntários:");
        for (Voluntario v : instituicao.getVoluntarios()) {
            System.out.println("- " + v.getNome());
        }
        System.out.println("Histórico de Doações Recebidas:");
        for (Doacao d : instituicao.getHistoricoDoacoes()) {
            System.out.println("- " + d.getTipoDoacao() + " de " + d.getDoador().getNome() + " em " + d.getDataDoacao());
        }
        System.out.println();
    }

    private static void exibirVoluntario(Voluntario voluntario, InstituicaoCaridade instituicao) {
        System.out.println("Nome: " + voluntario.getNome());
        System.out.println("CPF: " + voluntario.getCpf());
        System.out.println("Endereço: " + voluntario.getEndereco());
        System.out.println("Contato: " + voluntario.getContato());
        System.out.println("Disponibilidade de Horário: " + voluntario.getDisponibilidadeHorario());
        System.out.println("Habilidades ou Áreas de Interesse: " + voluntario.getHabilidadesInteresses());
        System.out.println("Instituição onde atua: " + instituicao.getNome());
        System.out.println();
    }
}
