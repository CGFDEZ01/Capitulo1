package ejercicios_libro;

/**
 *
 * @author carlo
 */
import java.util.Scanner;

public class Ejercicio_12_p36 {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.print("Introduce la cantidad de dinero en euros: ");
    int dinero = leer.nextInt();
    int[] billetes = {500, 200, 100, 50, 20, 10, 5};
    System.out.println(dinero + " euros son:");
    for (int billete : billetes) {
      int cantidad = dinero / billete;
      if (cantidad > 0) {
        System.out.println(cantidad + " billetes de " + billete);
        dinero = dinero % billete;
      }
    }
    System.out.println("Sobran " + dinero + " euros");
  }
}