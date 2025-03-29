package Tratamento;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExemploTratamentoExcecao {
    public static void main(String[] args){
        BufferedReader leitor = null;
        try {
            leitor = new BufferedReader (new FileReader("entrda.txt"));
            String linha;
            while((linha = leitor.readLine()) !=null){
                System.out.println(linha);
            }
        }catch (IOException e) {
            System.out.println("Ocorreu um erro durante a leitura do arquivo:"+e.getMessage());
        }finally {

            try {
                if (leitor != null) {
                    leitor.close();
                }
            }catch (IOException e) {
                System.out.println("Ocorreu um erro durante o fechamento do arquivo:"+e.getMessage());
            }
        }
    }

}
