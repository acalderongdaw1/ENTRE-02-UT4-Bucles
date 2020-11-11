/**
 *  Representa a una calcualdora que hace sumas octales
 * 
 * @author Alex Calderón 
 * 
 */
public class CalculadoraOctal
{

    /**
     * sumar dos nºs supuestos en base 8 y con el mismo
     * nº de cifras
     * Asumimos positivos
     */
        
    public int sumarEnOctal(int n1, int n2) {
        int suma = 0;
        int digito = 0;
        int llevada = 0;
        int posnum = 1;

        while (n1 > 0 || n1 > 0 || llevada > 0)
        {
            //Suma el primer digito de n1, de n2 y si nos llevamos algo tambien lo suma 
            digito = (n1 % 10) + (n2 % 10) + llevada;
            /* Comprueba que el número de la suma de más  o menos que 8.
             * Si da 8 se llevara uno para sumarlo despues al siguiente dígito
             * y hace modulo del dígito para poner 0 o 1 dependiendo
             * de si es 8 o 9. Si no seguira sin llevarse nada */
            if (digito > 7){
                llevada = 1;
                digito %= 8;
            }
            else{
                llevada = 0;
            }
            /* Hace la suma del digito para ponerlo en su posición.
             * Posnum es una variable que se inicializa a 1 para que lo ponga en la primera posición
             * y se va multiplicando por 10 para ir poniendo los siguientes dígitos en posición*/
            suma += digito * posnum;
            posnum *= 10;
            //Divide los números entre 10 para pasar al siguiente dígito.
            n1 /= 10;
            n2 /= 10;
        }
        return suma;
    }
}
