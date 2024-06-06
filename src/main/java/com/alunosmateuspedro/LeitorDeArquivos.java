package com.alunosmateuspedro;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LeitorDeArquivos {
    

    public static String lerTexto() throws IOException{
        return new String(Files.readAllBytes(Paths.get("texto.txt")));

    }
    public static String lerArgumentos() throws IOException{
        return new String(Files.readAllBytes(Paths.get("argumentos-busca.txt")));
    }
}
