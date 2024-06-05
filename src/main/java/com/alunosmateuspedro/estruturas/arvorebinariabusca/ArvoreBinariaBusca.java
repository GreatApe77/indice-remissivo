package com.alunosmateuspedro.estruturas.arvorebinariabusca;



public class ArvoreBinariaBusca<T extends Comparable<T>> {
    private TreeNode<T> raiz;

    private int tamanho;


    public ArvoreBinariaBusca(){
        this.raiz = null;
        this.tamanho = 0;
    }

    public int tamanho(){
        return this.tamanho;
    }

    public boolean estaVazia(){
        return this.raiz==null;
    }


}
