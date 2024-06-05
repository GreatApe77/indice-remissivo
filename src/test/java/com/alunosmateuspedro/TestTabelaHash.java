package com.alunosmateuspedro;
import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

import com.alunosmateuspedro.estruturas.hashtable.*;;
public class TestTabelaHash {
    


    @Test
    public void deveInserir(){
        TabelaHash<Integer,Integer> tabela = new TabelaHash<Integer,Integer>(37);
        tabela.insere(7625, 20);
        Assert.assertTrue(tabela.tamanho()==1);
    }
    @Test
    public void deveBuscar(){
        TabelaHash<Integer,Integer> tabela = new TabelaHash<Integer,Integer>(37);
        tabela.insere(23875, 999);
        Integer valor = tabela.busca(23875).getValor();
        Assert.assertTrue(valor==999);
    }
    @Test
    public void deveInserirEBuscarEmMassa(){
        TabelaHash<Integer,Integer> tabela = new TabelaHash<Integer,Integer>(37);
        Integer[] chaves = new Integer[100];
        Integer[] valores = new Integer[100];
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            chaves[i] = Math.abs(random.nextInt());
            valores[i] = random.nextInt();
            tabela.insere(chaves[i],valores[i]);
        }
        for (int i = 0; i < tabela.tamanho(); i++) {
            Entrada<Integer,Integer> entrada = tabela.busca(chaves[i]);
            Assert.assertTrue(entrada.getValor()==valores[i]);
        }
    }

    @Test
    public void deveDeletar(){
        TabelaHash<Integer,Integer> tabela = new TabelaHash<Integer,Integer>(37);
        Integer[] chaves = new Integer[100];
        Integer[] valores = new Integer[100];
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            chaves[i] = Math.abs(random.nextInt());
            valores[i] = random.nextInt();
            tabela.insere(chaves[i],valores[i]);
        }
        for (int i = 0; i < tabela.tamanho(); i++) {
            Entrada<Integer,Integer> entrada = tabela.busca(chaves[i]);
            Assert.assertTrue(entrada.getValor()==valores[i]);
        }
        for (int i = 0; i < valores.length; i++) {
            tabela.remove(chaves[i]);
            Assert.assertTrue(tabela.busca(chaves[i])==null);

        }
    }
}
