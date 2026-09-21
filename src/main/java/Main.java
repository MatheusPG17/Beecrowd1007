
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //variaveis
        int A, B, C, D, DIFERENCA;
        
        //entrada de dados
        A = leia.nextInt();
        B = leia.nextInt();
        C = leia.nextInt();
        D = leia.nextInt();
        
        //processamento 
        DIFERENCA = (A * B - C * D);
        
        //saida de dados
        System.out.println("DIFERENCA = " + DIFERENCA);
        
    }
}
