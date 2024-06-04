package com.alunosmateuspedro.estruturas.hashtable;
import java.lang.reflect.Array;

interface Dicionario<K, V> {
    void insere(K chave, V valor);

    Entrada<K, V> busca(K chave);

    Entrada<K, V> remove(K chave);

    int tamanho();

    boolean estaVazia();
}

 
public class TabelaHash<K extends Comparable<K>, V> implements Dicionario<K, V> {

    private int tamanho;
    private ListaDuplamenteEncadeada<Entrada<K, V>>[] tabela;

    @SuppressWarnings("unchecked")
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
        int indice = hash(chave);
        if(tabela[indice]==null){
            return null;
        }
        
        Nodo<Entrada<K,V>> atual = tabela[indice].primeiro;
        while (atual!=null) {
            if(atual.getElemento().getChave().compareTo(chave)==0){
                //as chaves foram iguais
                return atual.getElemento();
            }
            atual = atual.getProximo();
        }
        return null;
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
