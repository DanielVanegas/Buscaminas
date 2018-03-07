package buscaminas;

import java.util.Random;

public class Sembrador {

    void sembrarCorazones(Celda lasCeldas[][], int cantidad) {

        Random aleatorio = new Random();
        int coraAleatorio, sumatoria = 0;
        //For each en Java

        for (Celda[] laFila : lasCeldas) {

            for (Celda laCelda : laFila) {

                coraAleatorio = aleatorio.nextInt(10);
                if (coraAleatorio > 5 && sumatoria < cantidad) {
                    Corazon unCorazon = new Corazon();
                    laCelda.setMiCorazon(unCorazon);

                }
            }
        }

    }

    void mostrarCora(Celda lasCeldas[][]) {

        int contador = 0;
        int x;

        for (x = -1; x < 2; x++) {

            int y;
            for (y = -1; y < 2; y++) {

                if (lasCeldas[fila+x][columna+y]){
                    getmiCorazon() != null;
                    contador++;
                }
                
            }

                
            }
        }

    }

}
}

/*contador=0;

  for(x=-1;x<2;x++){
    
    for(y=-1;y<2;y++9){

        if(celdas[fila+x][columna+y]{

                getcorazon()!=null;
                contador++;

        } 
      }      
    }    

*/
