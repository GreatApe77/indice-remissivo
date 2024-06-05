package com.alunosmateuspedro;

import com.alunosmateuspedro.estruturas.hashtable.ListaDuplamenteEncadeada;

public class Ocorrencia implements Comparable<Ocorrencia> {
    private String palavra;
    private ListaDuplamenteEncadeada<Integer> linhas;

    public Ocorrencia(String palavra){
        this.palavra = palavra;
        this.linhas = new ListaDuplamenteEncadeada<Integer>();
    }
    public void adicionarNumeroDaLinha(Integer numeroDaLinha){
        this.linhas.adicionarFinal(numeroDaLinha);
    }    
    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }
    public String getPalavra() {
        return palavra;
    }
    public ListaDuplamenteEncadeada<Integer> getLinhas() {
        return linhas;
    }
    @Override
    public int compareTo(Ocorrencia ocorrencia) {
        return this.getPalavra().compareTo(ocorrencia.getPalavra());
    }
    @Override
    public String toString() {
        return "Palavra: "+getPalavra()+linhas.toString();
    }

}
