package com.alunosmateuspedro;

import com.alunosmateuspedro.estruturas.arvorebinariabusca.ArvoreBinariaBusca;
import com.alunosmateuspedro.estruturas.hashtable.TabelaHash;
import com.alunosmateuspedro.utils.OrdenarPalavras;

public class IndiceRemissivo {
    private String textoOriginal;
    TabelaHash<Integer,ArvoreBinariaBusca<Ocorrencia>> tabela;
    
    public IndiceRemissivo(String texto){
        this.textoOriginal = texto;
    
        tabela = new TabelaHash<>();
        for (int i = (int) 'a'; i < (int) 'z'; i++) {
            //System.out.println(i);
            tabela.insere(i,new ArvoreBinariaBusca<Ocorrencia>());
        }
        construirIndiceRemissivo(texto);
    }

    public String getTextoOriginal() {
        return textoOriginal;
    }
    public static String[] sanitizarTexto(String texto){
        return texto.toLowerCase().strip().split(" ");
    }
    public void imprimirFormatado(){
        for (int i = (int) 'a'; i < (int) 'z'; i++) {
            ArvoreBinariaBusca<Ocorrencia> arvore = tabela.busca(i).getValor();
            if(arvore!=null){
                arvore.imprimirEmOrdem();
            }
            
        }
    }
    public String buscaNoIndice(String argumentosDeBusca){
        StringBuilder s = new StringBuilder();
        String[] argumentosDeBuscaEspacados = argumentosDeBusca.strip().toLowerCase().split(" ");
        OrdenarPalavras.ordenarPalavras(argumentosDeBuscaEspacados);
        for (String argumento : argumentosDeBuscaEspacados) {
            int codigoDoCaractere = argumento.charAt(0);
            ArvoreBinariaBusca<Ocorrencia> arvoreDoCaractere = tabela.busca(codigoDoCaractere).getValor();
            Ocorrencia ocorrenciaTeste = new Ocorrencia(argumento);
            Ocorrencia buscado = arvoreDoCaractere.busca(ocorrenciaTeste);
            if(buscado!=null){
                s.append(buscado.toString()+"\n");
            }
        }

        String conteudo = s.toString();
        if(conteudo.length()==0){
            return "NENHUM ARGUMENTO ENCONTRADO! ☹️";
        }else{
            return conteudo;
        }
        /* for (int i = (int) 'a'; i < (int) 'z'; i++) {
            ArvoreBinariaBusca<Ocorrencia> arvore = tabela.busca(i).getValor();
            if(arvore!=null){
                
            }
            
        } */
    }
    private void construirIndiceRemissivo(String texto){
        if (texto.length()==0) {
            throw new IllegalArgumentException();
        }
        String[] textoSeparadoPorLinhas = texto.split("\n");
        for (int i = 0; i < textoSeparadoPorLinhas.length; i++) {
            String[] linhaEmPalavras = sanitizarTexto(textoSeparadoPorLinhas[i]);
            for (String palavra : linhaEmPalavras) {
                //pegar inicial de cada palavra
                Character inicial = palavra.toLowerCase().charAt(0);
                int codigoDoCaractere = (int) inicial;
                if(tabela.busca(codigoDoCaractere)!=null){
                    ArvoreBinariaBusca<Ocorrencia> arvoreDaInicial = tabela.busca(codigoDoCaractere).getValor();
                    Ocorrencia novaOcorrencia = new Ocorrencia(palavra);
                    Ocorrencia buscada = arvoreDaInicial.busca(novaOcorrencia);
                    int nLinha = i+1;
                    if(buscada==null){
                        novaOcorrencia.adicionarNumeroDaLinha(nLinha);
                        arvoreDaInicial.insere(novaOcorrencia);
                    }else{
                        if(buscada.getLinhas().ultimo.getElemento()!=nLinha){
                            buscada.adicionarNumeroDaLinha(nLinha);
                        }
                        
                    }

                    // if(arvoreDaInicial.busca(ocorrencia)==null){
                    //    arvoreDaInicial
                    
                   
                    
                }
            }
        }
    }
}
