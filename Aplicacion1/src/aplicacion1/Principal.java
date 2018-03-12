package aplicacion1;



public class Principal {

    public static void main(String[] args) {

        Rectangulo miRectangulo = new Rectangulo();
        Triangulo miTriangulo = new Triangulo();
        Cuadrado miCuadrado = new Cuadrado();
 
        
        
        
 
        System.out.println(miRectangulo.calculararea());
        
        
        System.out.println(miTriangulo.calculararea());
        System.out.println(miCuadrado.calculararea());

    }

}
