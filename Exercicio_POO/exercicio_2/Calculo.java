import java.util.Scanner;

public class Calculo {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        
        int valor1 ;
        int valor2;
        int X;
    System.out.println("digita primeiro numero");
    valor1 = S.nextInt();
    System.out.println("digita segundo numero");
    valor2 = S.nextInt();
    X = valor1 + valor2;
    System.out.println("Resultado X é  "+ X);
    }
}
