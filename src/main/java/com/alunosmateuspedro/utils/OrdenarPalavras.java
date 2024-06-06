package com.alunosmateuspedro.utils;

import java.util.Arrays;

public class OrdenarPalavras {
     public static void ordenarPalavras(String[] palavras) {

          int comeco = 0;
          int fim = palavras.length - 1;
          _ordenarPalavras(palavras, comeco, fim);
     }

     private static void _ordenarPalavras(String[] palavras, int comeco, int fim) {
          if (fim <= comeco) {
               return;
          }
          int pivot = _partition(palavras, comeco, fim);
          _ordenarPalavras(palavras, pivot + 1, fim);
          _ordenarPalavras(palavras, comeco, pivot - 1);

     }

     private static int _partition(String[] palavras, int comeco, int fim) {
          String pivot = palavras[fim];
          int i = comeco - 1;
          for (int j = comeco; j <= fim - 1; j++) {
               if (palavras[j].compareTo(pivot) < 0) {
                    i++;
                    String auxiliar = palavras[j];
                    palavras[j] = palavras[i];
                    palavras[i] = auxiliar;
               }
          }
          i++;
          String aux = palavras[i];
          palavras[i] = palavras[fim];
          palavras[fim] = aux;
          return i;
     }

     
}
