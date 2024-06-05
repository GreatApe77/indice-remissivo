package com.alunosmateuspedro;

import com.alunosmateuspedro.estruturas.arvorebinariabusca.ArvoreBinariaBusca;
import com.alunosmateuspedro.estruturas.hashtable.TabelaHash;

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
    public void buscaNoIndice(String argumentosDeBusca){
        String[] argumentosDeBuscaEspacados = argumentosDeBusca.split(" ");
        for (int i = 0; i < argumentosDeBuscaEspacados.length; i++) {
            String palavraTeste = argumentosDeBuscaEspacados[i];
            
        }
        /* for (int i = (int) 'a'; i < (int) 'z'; i++) {
            ArvoreBinariaBusca<Ocorrencia> arvore = tabela.busca(i).getValor();
            if(arvore!=null){
                
            }
            
        } */
    }
    private void construirIndiceRemissivo(String texto){
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
                        buscada.adicionarNumeroDaLinha(nLinha);
                    }

                    // if(arvoreDaInicial.busca(ocorrencia)==null){
                    //    arvoreDaInicial
                    
                   
                    
                }
            }
        }
    }
}
