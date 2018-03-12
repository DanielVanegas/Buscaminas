package aplicacion1;
import java.util.Scanner;

public class Cuadrado extends Figurageometrica {
    
    Scanner miEscanner= new Scanner(System.in);

    @Override
    int calculararea() {
        
        System.out.println("Calculando Area de un cuadrado.");
        int n,x;
        System.out.println("Ingrese 1 lado");
        n= miEscanner.nextInt();

        x=n*n;
        return x;
    }

    @Override
    void calcularperimetro() {
    }

}
