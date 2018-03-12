package aplicacion1;
import java.util.Scanner;

public class Triangulo extends Figurageometrica {
    
    Scanner miEscanner= new Scanner(System.in);

    @Override
    int calculararea() {
        
        System.out.println("Calculando Area de un triángulo.");
        int n,m,x;
        System.out.println("Ingrese base");
        n= miEscanner.nextInt();
        
        System.out.println("Ingrese Altura");
        m= miEscanner.nextInt();
        
        x=n*m/2;
        return x;
      
    }

    @Override
    void calcularperimetro() {
    }

}
