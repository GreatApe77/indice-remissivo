package com.alunosmateuspedro;

import com.alunosmateuspedro.estruturas.arvorebinariabusca.ArvoreBinariaBusca;
import com.alunosmateuspedro.estruturas.hashtable.*;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main(String[] args) {
        /*
         * TabelaHash<Integer, Integer> tab = new TabelaHash<>(37);
         * tab.insere(238576, 20);
         * tab.insere(237, 88);
         * // System.out.println(tab);
         * System.out.println(tab.busca(238576).getChave());
         * System.out.println(tab.remove(238576));
         * System.out.println(tab.busca(238576));
         */
        int[] myArr = { 442, 532, 2, 35, 6, 2, 3, 665, 4, 6, 458, 6, 54, 7, 8, 4, 35, 346, 90, 4, 457457, 45, 745,
                48, };
        ArvoreBinariaBusca<Integer> bTree = new ArvoreBinariaBusca<Integer>();
        for (int i = 0; i < myArr.length; i++) {
            bTree.insere(myArr[i]);
        }
        Integer elemento = bTree.busca(6);
        System.out.println(elemento);
    }
}
