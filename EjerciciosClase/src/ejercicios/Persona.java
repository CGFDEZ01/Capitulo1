/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) throws DNIException {
        if (!esDNIValido(DNI)) {
            throw new DNIException("El DNI introducido no es válido.");
        }
        
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }   
    
    public class IMCException extends Exception {
        public IMCException(String message) {
            super(message);
        }
    }
    
    // Métodos
    public int calcularIMC() throws IMCException {
        if (!esIMCvalido(this.peso, this.altura)){
            throw new IMCException("El peso, la altura o ambos no son válidos para calcular el IMC");
        }
        double imc = peso / Math.pow(altura, 2);
        
        if (imc < 20) {
            return -1; // Persona por debajo de su peso ideal
        } else if (imc >= 20 && imc <= 25) {
            return 0; // Persona en su peso ideal
        } else {
            return 1; // Persona con sobrepeso
        }
    
    }
    public boolean esIMCvalido(double peso, double altura){
        boolean esValido = false;
        if (peso >= 5 && peso <= 634){
            if (altura >= 0.5 && altura <= 2.5){
                esValido = true;
            }
        }
        return esValido;
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
     try {
         return "Nombre = "+ nombre +
                 "\nEdad = " + edad +
                 "\nDNI = " + DNI +
                 "\nSexo = " + sexo +
                 "\nPeso = " + peso +
                 "\nAltura = " + altura +
                 "\nIMC = " + (calcularIMC() == 0 ? calcularIMC() + " la persona tiene un peso normal" : calcularIMC() == 1 ? calcularIMC() + " la persona tiene sobrepeso": calcularIMC() + " la persona tiene un peso nefasto");
     } catch (IMCException ex) { 
         Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
     }
     return "Nombre = "+ nombre +
                 "\nEdad = " + edad +
                 "\nDNI = " + DNI +
                 "\nSexo = " + sexo +
                 "\nPeso = " + peso +
                 "\nAltura = " + altura;
    }
    
    public class DNIException extends Exception {
        public DNIException(String message) {
            super(message);
        }
    }
    
    private void generaDNI() {
        int numDNI = (int) (Math.random() * 100000000);
        String juegoCaracteres = "HUEKOFPVTNBXZYRQWMLCIUA";
        int posicion = numDNI % 23;
        char letraDNI = juegoCaracteres.charAt(posicion);
        
        String dniCompleto = String.format("%08d", numDNI) + letraDNI;
        
        this.DNI = dniCompleto;
    }
    
    // Comprueba si un DNI es válido
    private boolean esDNIValido(String dni) {
        final int LONGITUD_DNI = 9; // 8 números y una letra
        boolean esValido = false;

        // Comprobamos si el DNI tiene la longitud correcta
        if (dni.length() == LONGITUD_DNI) {
            // Comprobamos si los 8 primeros caracteres son números
            String numeros = dni.substring(0, 8);
            if (numeros.matches("[0-9]+")) {
                // Comprobamos si el último caracter es una letra
                String letra = dni.substring(8);
                if (letra.matches("[A-Za-z]")) {
                    esValido = true;
                }
            }
        }
        return esValido;
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
    
    public static void main(String[] args){
        try {
        Persona p1 = new Persona("Carlos", 21, "54222645F", 'H', 67, 3);
        System.out.println(p1.toString());
        System.out.println(p1.calcularIMC());
    
        }catch(DNIException e){
            System.err.println(e.getMessage()); 
        }catch(IMCException e){
            System.err.println(e.getMessage());
        }
    }
}
