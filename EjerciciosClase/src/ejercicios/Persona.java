/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author carlos
 */
public class Persona {
 private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;
    
    private static final char SEXODEF = 'H';
    
    // Constructores
    public Persona() {
        this("", 0, SEXODEF);
    }
    
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = null;
        this.sexo = sexo    ;
        this.peso = 0;
        this.altura = 0;
    }
    
    public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }   
    
    // Métodos
    public int calcularIMC() {
        double imc = peso / Math.pow(altura, 2);
        if (imc < 20) {
            return -1; // Persona por debajo de su peso ideal
        } else if (imc >= 20 && imc <= 25) {
            return 0; // Persona en su peso ideal
        } else {
            return 1; // Persona con sobrepeso
        }
    
    }
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    private char comprobarSexo(char sexo) {
        if (sexo == 'H' || sexo == 'M') {
            return sexo;
        } else {
            return 'H'; 
        }
    }
    
    public String toString() {
        return "Nombre = "+ nombre +
                "\nEdad = " + edad +
                "\nDNI = " + DNI + 
                "\nSexo = " + sexo +
                "\nPeso = " + peso +
                "\nAltura = " + altura;
    }
    
    private void generaDNI() {
        int numDNI = (int) (Math.random() * 100000000);
        String juegoCaracteres = "HUEKOFPVTNBXZYRQWMLCIUA";
        int posicion = numDNI % 23;
        char letraDNI = juegoCaracteres.charAt(posicion);
        
        String dniCompleto = String.format("%08d", numDNI) + letraDNI;
        
        this.DNI = dniCompleto;
    }

    
    //Métodos set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
