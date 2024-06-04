package com.alunosmateuspedro;

import com.alunosmateuspedro.estruturas.TabelaHash;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        TabelaHash<Integer, Integer> tab = new TabelaHash<>(37);
        tab.insere(238576, 20);
         tab.insere(237,88);
        System.out.println(tab);
    }
}
