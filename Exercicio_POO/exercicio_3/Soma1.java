import java.util.Scanner;
public class Soma1{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        
        int valor1 ;
        int valor2;
        int soma;
    System.out.println("digita primeiro");
    valor1 = n.nextInt();
    System.out.println("digita segundo");
    valor2 = n.nextInt();
    soma = valor1 + valor2;
    System.out.println("SOMA é  "+ soma);
    }
}
 
