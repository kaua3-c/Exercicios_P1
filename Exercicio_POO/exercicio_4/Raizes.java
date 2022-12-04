   import java.util.Scanner;
import java.text.DecimalFormat;
import static java.lang.Math.sqrt;

 
public class Raizes{
    public static void main(String[] args)   {
 
		Scanner input = new Scanner(System.in);
    	DecimalFormat df = new DecimalFormat();
		double A, B, C, Raiz1, Raiz2;
        System.out.println("digite o primeiro valor");
		A = input.nextDouble();
        System.out.println("digite o segundo valor");
		B = input.nextDouble();
        System.out.println("digite o terceiro valor");
		C = input.nextDouble();

		if ((A == 0) | (B*B - 4*A*C < 0)) {
			System.out.println("Impossivel calcular");
		}
		else {
			Raiz1 = (-B + Math.sqrt(B*B - 4*A*C))/(2*A);
			Raiz2 = (-B - Math.sqrt(B*B - 4*A*C))/(2*A);
			System.out.println("R1 = " + df.format(Raiz1));
			System.out.println("R2 = " + df.format(Raiz2));
		}
    }
}

