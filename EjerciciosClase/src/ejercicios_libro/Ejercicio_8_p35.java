/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_libro;

/**
 *
 * @author carlo
 */
public class Ejercicio_8_p35 {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            char letra = (char) (Math.random()*26 + 65);
            if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'){
                System.out.printf("%d. %c es una vocal.\n", i, letra);
            }else{
                System.out.printf("%d. %c es una consonante.\n", i, letra);
            }
        }
    }
}
