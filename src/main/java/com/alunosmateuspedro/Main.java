package com.alunosmateuspedro;

import com.alunosmateuspedro.estruturas.arvorebinariabusca.ArvoreBinariaBusca;
import com.alunosmateuspedro.estruturas.hashtable.*;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main(String[] args) {

        //String textoTeste = "Bom dia amigos da rede globo \n hoje vou dormir na rede e jogar muito futebol \n a terra eh redonda \n amigos \n amigos \n bola";
        String textoTeste = "oi \n oi \n oi \n oi";
        IndiceRemissivo indiceRemissivo = new IndiceRemissivo(textoTeste);

        indiceRemissivo.imprimirFormatado();
        
    }
}
