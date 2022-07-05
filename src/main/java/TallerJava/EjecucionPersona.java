package TallerJava;

import java.util.Scanner;

public class EjecucionPersona {
    public static void main(String[] args) {
    String nombre;
    char sexo;
    int edad;
    float peso,altura;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre:");
        nombre = scanner.nextLine();
        System.out.println("Ingrese la edad:");
        edad = scanner.nextInt();
        System.out.println("Ingrese su sexo:");
        sexo = scanner.nextLine().charAt(0);
        System.out.println("Ingrese su peso:");
        peso = scanner.nextFloat();
        System.out.println("Ingrese su altura");
        altura = scanner.nextFloat();
        //Objeto al que le llame persona1
        Persona persona1 = new Persona(nombre,edad,sexo,peso,altura);

        if (persona1.calcularIMC() == -1){
            System.out.println("Está en su peso ideal");
        } else if (persona1.calcularIMC()==0) {
            System.out.println("Está por debajo de su peso ideal");
        }else{
            System.out.println("Está con sobrepeso");
        }
        System.out.println("Es mayor de edad:"+persona1.esMayorDeEdad());
        System.out.println(persona1.toString());

        //Objeto al que le llame persona2

        Persona persona2 = new Persona(nombre,edad,sexo);
        if (persona2.calcularIMC() == -1){
            System.out.println("Está en su peso ideal");
        } else if (persona2.calcularIMC()==0) {
            System.out.println("Está por debajo su peso ideal");
        }else{
            System.out.println("Está con sobrepeso");
        }
        System.out.println("Es mayor de edad:"+persona2.esMayorDeEdad());
        System.out.println(persona2.toString());



        //Objeto al que le llame persona2
        Persona persona3 = new Persona();
        persona3.setNombre(nombre);
        persona3.setEdad(edad);
        persona3.setSexo(sexo);
        persona3.setPeso(peso);
        persona3.setAltura(altura);
        if (persona3.calcularIMC() == -1){
            System.out.println("Está en su peso ideal");
        } else if (persona3.calcularIMC()==0) {
            System.out.println("Está por debajo su peso ideal");
        }else{
            System.out.println("Está con sobrepeso");
        }
        System.out.println("Es mayor de edad:"+persona3.esMayorDeEdad());
        System.out.println(persona3.toString());


    }
}
