/**
 *  Clase que dibuja una figura 
 * 
 * @author Alex Calderón 
 *  
 */
public class PintorFiguras
{
    private static final int ANCHO_BLOQUE = 4;
    private static final char ESPACIO = ' ';
    private static final char CAR1 = 'B';
    private static final char CAR2 = '=';


    /**
     * Dibuja una figura (ver enunciado) de altura
     * indicada (se asume la altura un valor correcto)
     * 
     * (usa bucles for)
     */
    public void dibujarFigura(int altura) {
        for(int alt=0;alt<altura;alt++){
            for(int k=0;k<1;k++){
                for(int j=0;j<(altura)-alt-1;j++){
                    escribirEspacios(' ', 2);
                }
            }
            for(int pos=0;pos<alt+1;pos++){
                for(int j=0;j<ANCHO_BLOQUE;j++){
                    if(pos % 2 == 0){
                        System.out.print(CAR1);
                    }
                    else{
                        System.out.print(CAR2);
                    }
                }
            }
            System.out.println();
        }
    }
        


    /**
     * Método privado de ayuda que escribe n espacios en la misma línea
     */
    private static void escribirEspacios(char caracter, int n) {
        for(int i=0;i<n;i++){
            System.out.print(caracter);
        }
    }
}