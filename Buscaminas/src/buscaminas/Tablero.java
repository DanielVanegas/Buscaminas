package buscaminas;

public class Tablero {
    
    private Celda misCeldas[][];
    private Cronometro miCronometro;
    private Contador miCounter;
    private Emoji miEmoji;

    public Tablero(int ancho, int largo) {
        
        misCeldas=new Celda [ancho][largo];
        
        int fila=0;
        int columna;
        
        for(fila=0;fila<largo;fila++){
            for(columna=0;columna<ancho;columna++){
                misCeldas[fila][columna]=new Celda();
            }
            
        }
        
        Sembrador miTrabajador=new Sembrador();
        miTrabajador.sembrarCorazones(misCeldas, 50);
    }
    
    

}
