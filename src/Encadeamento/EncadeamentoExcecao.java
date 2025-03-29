package Encadeamento;

import java.io.IOException;

public class EncadeamentoExcecao {
public static void main(String[] args) {
    try {
        abrirArquivo();
    }catch (AbrirArquivoExcecao e) {
        System.out.println("Um erro ocorreu na tentativa de abrir o arquivo:"+e.getMessage());
        System.out.println("Causa raiz:"+e.getCause().getMessage());
    }
}

public static void abrirArquivo() throws AbrirArquivoExcecao {
    try {
        throw new IOException("Incapaz de abrir o arquivo");
    } catch (IOException e) {
        throw new AbrirArquivoExcecao("Ocorreu um erro ao abrir o arquivo", e);
    }
}
}
class AbrirArquivoExcecao extends Exception {
    public AbrirArquivoExcecao(String mensagem, Throwable causa){
        super(mensagem, causa);
    }

}