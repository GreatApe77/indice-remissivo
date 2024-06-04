package com.alunosmateuspedro;
import org.junit.Assert;
import org.junit.Test;

import com.alunosmateuspedro.estruturas.TabelaHash;
public class TestTabelaHash {
    


    @Test
    public void deveInserir(){
        TabelaHash<Integer,Integer> tabela = new TabelaHash<Integer,Integer>(37);
        tabela.insere(7625, 20);
        Assert.assertTrue(tabela.tamanho()==1);
    }
}
