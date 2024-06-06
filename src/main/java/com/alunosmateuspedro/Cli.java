package com.alunosmateuspedro;

public class Cli {
    public static void imprimirTitulo(){
        System.out.println("====================================");
        System.out.println("========= ÍNDICE REMISSIVO =========");
        System.out.println("====================================");
    }
    public static void imprimeMenu(){
        System.out.println();
        System.out.println("Escolha:");
        System.out.println();

        System.out.println("1. Ler argumentos de busca em um arquivo ( argumentos-busca.txt ) e gerar indice remissivo. DIGITE: 1");
        System.out.println("2. Digitar argumentos manualmente. DIGITE: 2");
        System.out.println("0. SAIR. DIGITE: 0");
        System.out.println();
    }
    
}
