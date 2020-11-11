import java.util.Scanner;
/**
 *   Clase de utilidades
 *   Incluye métodos estáticos
 *   
 *   @author Alex Calderón 
 */
public class Utilidades
{

    /**
     * Dado un número n (asumimos positivo)
     * devueve true si está en octal false en otro caso
     * Un nº está en octal si cada una de sus cifras
     * es un valor entre 0 y 7
     * 
     * (usa bucles while)
     */
    public static boolean estaEnOctal(int n) {
        int cifras = contarCifras(n);
        int numero = n;
        while(cifras > 0 || (((numero - 8) % 10) == 0 || ((numero - 9) % 10) == 0)){
            n %= 10;
            numero /= 10;
            --cifras;
            if(((numero - 8) % 10) == 0 || ((numero - 9) % 10) == 0 || ((n - 8) % 10) == 0 || ((n - 9) % 10) == 0){
                return false;
            }  
        }
        return true;
    }

    /**
     * Dado un número n (asumimos positivo)
     * devuelve la cantidad de cifras que tiene
     * 
     * (usa bucles while)
     */
    public static int contarCifras(int n) {
        int cifras = 0;
        while(n > 0){
            n /= 10;
            ++cifras;
        }
        return cifras;
    }
}
