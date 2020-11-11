import java.util.Scanner;
/**
 * Modela el interfaz para interactuar con el usuario
 * @author Alex Calderón 
 */
public class IUTexto
{
    private Scanner teclado;
    private CalculadoraOctal calculadora;
    private PintorFiguras pintor;

    /**
     * Constructor  
     */
    public IUTexto(CalculadoraOctal calculadora, PintorFiguras pintor)
    {
        this.teclado = new Scanner(System.in);
        this.calculadora = calculadora;
        this.pintor = pintor;
    }

    /**
     * Controla la lógica de la aplicación
     */
    public void iniciar()
    {
        hacerSumasOctales();
        dibujarFiguras();

    }

    /**
     *  - borrar la pantalla
     *  - pedir al usuario un par de números
     *  - si los números no están en octal mostrar un mensaje
     *  - si los números no tienen el mismo número de cifras mostrar un mensaje
     *  - si son correctos calcular su suma octal y mostrar el resultado en pantalla
     *  - los pasos anteriores se repiten mientras el usuario quiera (pulsa 'S' o 's')
     *  
     */
    private void hacerSumasOctales()
    {
        char opcion;
        do{
            Pantalla.borrarPantalla();
            //Introducir los valores
            System.out.print("Introduzca número1: ");
            int numero1 = teclado.nextInt();
            System.out.print("Introduzca número2: ");
            int numero2 = teclado.nextInt();
            //Comprobar los números
            if(!Utilidades.estaEnOctal(numero1) || !Utilidades.estaEnOctal(numero2)){
                System.out.println("Algun número que has introducido no esta en octal");
            }
            else{
                if(Utilidades.contarCifras(numero1) != Utilidades.contarCifras(numero2)){
                    System.out.println("Los números no tienen el mismo número de cifras.");    
                }
                else{
                    System.out.println("-----------------------------------------");
                    System.out.printf("%38d", numero1);
                    System.out.printf("\n%38d", numero2);
                    System.out.printf("\n\t%s", "Suma octal: ");
                    System.out.printf("%18d", calculadora.sumarEnOctal(numero1, numero2));
                    System.out.println();    
                }
            }
            System.out.println();  
            System.out.println();
            //Opción para ver si se continua o no
            System.out.println("Quiere hacer otra suma en octal? (S / s) ");
            opcion = teclado.next().charAt(0);
            System.out.print(opcion);
        }
        while(opcion == 'S' || opcion == 's');
    }        

    /**
     *  Pide al usuario un valor de altura, 
     *  valida que sea correcto (un valor entre 1 y 10)
     *  y muestra la figura en pantalla
     */

    private void dibujarFiguras()
    {
        Pantalla.borrarPantalla();
        //Preguntar datos e imprimir la figura si se da la cantidad correcta
        System.out.println("Ahora dibujará una figura");
        System.out.println();
        System.out.println();
        System.out.println("Altura de la figura? (1-10) ");
        int altura = teclado.nextInt();
        while(altura > 10 || altura < 0 || altura == 0){
            System.out.println("Error. Altura de la figura? ");
            altura = teclado.nextInt();
        }
        pintor.dibujarFigura(altura);
    }
}
