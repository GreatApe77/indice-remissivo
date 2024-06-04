package com.alunosmateuspedro.estruturas;
import com.alunosmateuspedro.estruturas.ListaDuplamenteEncadeada;

interface Dicionario<K,V> {
    void insere(K chave, V valor);
    Entrada<K,V> busca(K chave);
    Entrada<K,V> remove(K chave);
    int tamanho();
    boolean estaVazia();
}
class Entrada<K,V>{
    private K chave;
    private V valor;
    public Entrada(K chave,V valor){
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
}
public class TabelaHash<K,V> implements Dicionario<K,V> {
    
    private int tamanho;
    private ListaDuplamenteEncadeada<Entrada<K,V>>[] tabela;
    @Override
    public void insere(K chave, V valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insere'");
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
       return this.tabela.length==0;
    }

    public int hash(K chave){
        return 0;
    }



    private boolean bucketValido(int bucket){
        return 0<bucket && bucket<this.tabela.length;

    }
}
