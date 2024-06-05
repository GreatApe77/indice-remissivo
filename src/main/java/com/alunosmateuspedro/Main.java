package com.alunosmateuspedro;

import com.alunosmateuspedro.estruturas.arvorebinariabusca.ArvoreBinariaBusca;
import com.alunosmateuspedro.estruturas.hashtable.*;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main(String[] args) {

        String textoTeste = "Bom dia amigos da rede globo \n hoje vou dormir na rede e jogar muito futebol \n a terra eh redonda \n amigos \n amigos \n bola";
        IndiceRemissivo indiceRemissivo = new IndiceRemissivo(textoTeste);

        indiceRemissivo.imprimirFormatado();
        Ocorrencia ocorrencia = new Ocorrencia("textoTeste");
        ocorrencia.adicionarNumeroDaLinha(5);
        ocorrencia.adicionarNumeroDaLinha(33);
        ocorrencia.adicionarNumeroDaLinha(3454);
        System.out.println(ocorrencia);
    }
}
