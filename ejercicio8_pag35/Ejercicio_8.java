/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8_pag35;

/**
 *
 * @author carlo
 */
public class Ejercicio_8 {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            char uno = (char) (Math.random()*26 + 65);
            if (uno == 'A' || uno == 'E' || uno == 'I' || uno == 'O' || uno == 'U'){
                System.out.printf("%c es una vocal.\n", uno);
            }else{
                System.out.printf("%c es una consonante.\n", uno);
            }
        }
    }
}
