package roteiro;
import java.util.Scanner;

public class Principal {
    private static Fibonacci fib;
    private static Scanner entrada;

    public static void main(String args[ ]) {
        double num = 0;
        entrada = new Scanner (System.in);
        fib = new Fibonacci();
        do {
            System.out.println( "Entre com um numero não negativo ou \"-1\" para sair: ");
            num = entrada.nextDouble();
            if ( num == -1 )
                System.exit(0);
            System.out.println( "0"+num+"-esimo termo de Fibonacci é:"+fib.CalcularFibonacci( num ));
            
            
        } while ( num >= 0 );
        
    }

}
