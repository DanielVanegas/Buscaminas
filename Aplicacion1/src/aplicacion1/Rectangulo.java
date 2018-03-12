package aplicacion1;
import java.util.Scanner;

public class Rectangulo extends Figurageometrica {
    
    Scanner miEscanner= new Scanner(System.in);

    @Override
    int calculararea() {
        
        System.out.println("Calculando Area de un rectángulo.");
        int n,m,x;
        System.out.println("Ingrese base");
        n= miEscanner.nextInt();
        
        System.out.println("Ingrese Altura");
        m= miEscanner.nextInt();
        
        x=n*m;
        return x;
    }

    @Override
    void calcularperimetro() {
    }

}
