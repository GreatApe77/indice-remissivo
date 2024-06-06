package com.alunosmateuspedro;

import java.io.FileWriter;
import java.io.IOException;


public class GeradorDeOutput {
    public static void gerarOutput(String indiceRemissivo) throws IOException{
        FileWriter fileWriter = new FileWriter("indice-remissivo.txt");
        fileWriter.write(indiceRemissivo);
        fileWriter.close();
    }
}
