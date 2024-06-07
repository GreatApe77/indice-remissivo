package com.alunosmateuspedro;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author Mateus Arruda Navarro Albuquerque
 * @author Pedro Augusto Brito Maltez
 */
public class Main {
    public static void main(String[] args) throws IOException {
        

        
        Scanner scanner = new Scanner(System.in);

        int opcao = -1;
        IndiceRemissivo indiceRemissivo = new IndiceRemissivo(LeitorDeArquivos.lerTexto());
        Cli.imprimirTitulo();
        Cli.imprimeMenu();
        System.out.println();
        System.out.println("Digite sua opção :");
        opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                String argumentosBusca = LeitorDeArquivos.lerArgumentos();
                String output1 = indiceRemissivo.buscaNoIndice(argumentosBusca);
                System.out.println("<><><><><><><><><><><><><><><>");
                System.out.println(output1);
                System.out.println("<><><><><><><><><><><><><><><>");
                GeradorDeOutput.gerarOutput(output1);
                main(args);
                
                break;
            case 2:
                System.out.println("Digite os argumentos abaixo (SEPARADOS POR ESPAÇO!):");
                scanner.nextLine();
                String argumentosBuscaDigitados = scanner.nextLine();
                String output2 = indiceRemissivo.buscaNoIndice(argumentosBuscaDigitados);
                GeradorDeOutput.gerarOutput(output2);
                System.out.println("<><><><><><><><><><><><><><><>");
                System.out.println(output2);
                System.out.println("<><><><><><><><><><><><><><><>");
                main(args);
                break;
            case 0:
                System.out.println("SAINDO...");
                break;

            default:
                System.out.println("OPÇÃO INVÁLIDA!");
                main(args);
                break;
        }
        scanner.close();
    }
}
