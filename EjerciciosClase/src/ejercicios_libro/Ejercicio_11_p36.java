package ejercicios_libro;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Ejercicio_11_p36 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int t, horas, minutos, segundos;
        System.out.print("Introduce el numero de segundos: ");
        t = leer.nextInt();
        
        horas = t / 3600;
        minutos = (t % 3600) / 60;
        segundos = (t % 3600) % 60;
        
        System.out.printf("%d segundos son %d horas, %d minutos y %d segundos.", t, horas, minutos, segundos);
    }
}
