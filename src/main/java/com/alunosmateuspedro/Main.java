package com.alunosmateuspedro;

import java.io.IOException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // String textoTeste = "Uma estrutura de dados (ED), em ciência da computação, é
        // uma coleção tanto de valores (e seus relacionamentos) quanto de operações
        // (sobre os valores e estruturas decorrentes). É uma implementação concreta de
        // um tipo abstrato de dado (TAD) ou um tipo de dado (TD) básico ou primitivo.
        // Assim, o termo ED pode ser considerado sinônimo de TD, se considerado TAD um
        // hipônimo de TD, isto é, se um TAD for um TD.\nCritérios para escolha e estudo
        // de uma estrutura de dados incluem eficiência para buscas e padrões
        // específicos de acesso, necessidades especiais para manejo de grandes volumes
        // (veja big data), ou a simplicidade de implementação e uso. Ou seja, EDs
        // eficientes são cruciais para a elaboração de algoritmos, diversas linguagens
        // possuem ênfase nas EDs, como evidenciado pela POO, e aplicações distintas
        // usufruem de ou requerem EDs específicas (e.g. um compilador usa uma tabela de
        // dispersão para identificadores e namespaces, enquanto uma Árvore B ou Árvore
        // AA [en] é apropriada para acessos randômicos).\nEm termos de EDs, os TDs e
        // TADs são definidos indiretamente pelas operações e usos, e propriedades
        // destas operações e usos: e.g. o custo computacional e o espaço que pode
        // representar e ocupa na memória.";
        // String textoTeste = "Bom dia amigos da rede globo \n hoje vou dormir na rede
        // e jogar muito futebol \n a terra eh redonda \n amigos \n amigos \n bola";
        // String textoTeste = "oi \n oi \n oi \n oi";
        // IndiceRemissivo indiceRemissivo = new
        // IndiceRemissivo(LeitorDeArquivos.lerTexto());

        // indiceRemissivo.imprimirFormatado();
        // String indiceRemissivoOutput =
        // indiceRemissivo.buscaNoIndice(LeitorDeArquivos.lerArgumentos());
        // System.out.println(LeitorDeArquivos.lerTexto());
        // System.out.println(indiceRemissivoOutput);
        // GeradorDeOutput.gerarOutput(indiceRemissivoOutput);
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
