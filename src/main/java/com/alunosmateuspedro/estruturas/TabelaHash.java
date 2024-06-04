package com.alunosmateuspedro.estruturas;

import java.lang.reflect.Array;

import com.alunosmateuspedro.estruturas.ListaDuplamenteEncadeada;

interface Dicionario<K, V> {
    void insere(K chave, V valor);

    Entrada<K, V> busca(K chave);

    Entrada<K, V> remove(K chave);

    int tamanho();

    boolean estaVazia();
}

class Entrada<K, V> {
    private K chave;
    private V valor;

    public Entrada(K chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }

    public void setChave(K chave) {
        this.chave = chave;
    }

    public K getChave() {
        return chave;
    }

    public V getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Entrada [chave=" + chave + ", valor=" + valor + "]";
    }

}

public class TabelaHash<K extends Comparable<K>, V> implements Dicionario<K, V> {

    private int tamanho;
    private ListaDuplamenteEncadeada<Entrada<K, V>>[] tabela;

    public TabelaHash(int capacidade) {

        this.tabela = (ListaDuplamenteEncadeada<Entrada<K, V>>[]) Array.newInstance(ListaDuplamenteEncadeada.class,
                capacidade);
        this.tamanho = 0;
    }

    public TabelaHash() {
        this(37);
    }

    @Override
    public void insere(K chave, V valor) {
        int indice = hash(chave);
        Entrada<K, V> entrada = new Entrada<K, V>(chave, valor);
        if (tabela[indice] == null) {
            ListaDuplamenteEncadeada<Entrada<K, V>> listaAuxiliar = new ListaDuplamenteEncadeada<Entrada<K, V>>();
            listaAuxiliar.adicionarFinal(entrada);
            tabela[indice] = listaAuxiliar;
        } else {
            tabela[indice].adicionarFinal(entrada);
        }
        this.tamanho++;
    }

    @Override
    public Entrada<K, V> busca(K chave) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'busca'");
    }

    @Override
    public Entrada<K, V> remove(K chave) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public boolean estaVazia() {
        return this.tabela.length == 0;
    }

    public int hash(K chave) {
        if (chave instanceof Integer) {
            return (Integer) chave % this.tabela.length;
        }
        throw new IllegalArgumentException("Chave Invalida");
    }

    @Override
    public String toString() {
        int cap = 2 + tamanho() + (2 * (tamanho() - 1));

        StringBuilder s = new StringBuilder(cap);
        s.append("[");
        for (int i = 0; i < tabela.length; i++) {
            if (tabela[i] != null) {

                if (i == tamanho() - 1) {
                    s.append(tabela[i].toString());
                } else {
                    s.append(tabela[i].toString());
                    s.append(tabela[i].toString());
                    s.append(", ");
                }
            }
        }
        s.append("]");
        return s.toString();
    }

}
