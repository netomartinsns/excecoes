package Tratamento;

import java.util.ArrayList;
import java.util.List;

public class ExemploEncadeamentoExcecoes {
    public static void main(String[] args){
        try {
            List<String> lstNomes = new ArrayList<>();
            addNome(lstNomes, null);

        } catch (nomeInvalidoExcecao e){
            System.out.println("Um erro ocorreu:"+e.getMessage());
            System.out.println("Causa raiz:"+e.getCause().getMessage());
        }
    }
    public static void addNome(List<String> nomes, String nome)
            throws nomeInvalidoExcecao {
                try {
                    if (nome == null || nome.isBlank()){
                        throw new IllegalArgumentException("Nome não pode ser nulo ou vazio ");
                    }
                    nomes.add(nome);
                }catch (IllegalArgumentException e){
                    throw new nomeInvalidoExcecao("Foi detectado um nome invalido ", e);
                }
            }
}
class nomeInvalidoExcecao extends Exception {
    public nomeInvalidoExcecao(String message, Throwable causa) {
        super(message, causa);
    }
}
