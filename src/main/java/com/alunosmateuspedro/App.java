package com.alunosmateuspedro;

import com.alunosmateuspedro.estruturas.hashtable.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        TabelaHash<Integer, Integer> tab = new TabelaHash<>(37);
        tab.insere(238576, 20);
        tab.insere(237, 88);
        // System.out.println(tab);
        System.out.println(tab.busca(238576).getChave());
        System.out.println(tab.remove(238576));
        System.out.println(tab.busca(238576));
    }
}
