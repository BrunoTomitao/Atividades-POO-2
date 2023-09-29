package faculdade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        System.out.println("Cadastro de Técnicos");

        List<Tecnico> tecnicos = new ArrayList<>();

        // Cadastre os primeiros 4 técnicos
        for (int i = 0; i < 4; i++) {
            Tecnico novoTecnico = Tecnico.criarNovoTecnicoViaConsole();
            tecnicos.add(novoTecnico);
        }

        // Imprima os dados de todos os técnicos
        for (Tecnico tecnico : tecnicos) {
            tecnico.imprimirDados();
        }

        // Permita cadastrar mais técnicos conforme a demanda
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Deseja cadastrar mais um técnico? (s/n)");
            String resposta = scanner.nextLine().toLowerCase();
            if (resposta.equals("s")) {
                Tecnico novoTecnico = Tecnico.criarNovoTecnicoViaConsole();
                tecnicos.add(novoTecnico);
                novoTecnico.imprimirDados();
            } else if (resposta.equals("n")) {
                break;
            }
        }
    }
}
