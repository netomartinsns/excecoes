package Tratamento;

public class Princiipal {
    public static void main(String args[]) throws ErroValidacao {
        OperacaoArray calc = new OperacaoArray ();
        char[] op1 = null;
        char[] op2 = null;
        try {
            op1 = new char[Short.MAX_VALUE];
            op2 = new char[Short.MAX_VALUE];
        }catch (OutOfMemoryError e){
            Runtime runtime = Runtime.getRuntime();
            System.out.println("Memoria insuficiente para criar os vetores");
            System.out.println("A memoria  total da MVJ é "+runtime.totalMemory()+"e o maximo é "+runtime.maxMemory());
            System.out.println("Reconfigure a MVJ usando o parametro -Xmx<size>.Voce precisa de "+16*Short.MAX_VALUE+"soh para os vetores.");
            System.exit(-1);
        }

            calc.concatenarArray (op1, op2);
        
    }

}

