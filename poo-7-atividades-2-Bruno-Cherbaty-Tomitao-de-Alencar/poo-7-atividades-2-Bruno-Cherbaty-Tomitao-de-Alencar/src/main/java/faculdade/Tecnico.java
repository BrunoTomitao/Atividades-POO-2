package faculdade;

import java.util.Scanner;

public class Tecnico {

    private String nome;
    private String departamento;
    private String especialidade;

    public Tecnico(String nome, String departamento, String especialidade) {
        this.nome = nome;
        this.departamento = departamento;
        this.especialidade = especialidade;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Departamento: " + departamento);
        System.out.println("Especialidade: " + especialidade);
    }

    public static Tecnico criarNovoTecnicoViaConsole() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do técnico:");
        String nome = scanner.nextLine();

        System.out.println("Digite o departamento do técnico:");
        String departamento = scanner.nextLine();

        System.out.println("Digite a especialidade do técnico:");
        String especialidade = scanner.nextLine();

        return new Tecnico(nome, departamento, especialidade);
    }
}
