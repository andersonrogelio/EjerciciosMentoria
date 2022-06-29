package entregable;

import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) {
        float sueldo;
        float boni;
        String area;
        int nhijos;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese su sueldo básico");
        sueldo = s.nextFloat();
        System.out.println("Ingrese el área donde trabaja");
        area = s.next();
        System.out.println("Ingrese la cantidad de hijos que tiene");
        nhijos = s.nextInt();
        switch (area){
            case "Sistemas":{
                boni=(sueldo*25)/100;
                break;
            }
            case "Contabilidad":{
                boni=(sueldo*20)/100;
                break;
            }
            default:{
                boni=(sueldo*10)/100;
                break;
            }
        }
        if (nhijos>= 2){
            boni = boni + (150*nhijos);
        }
        System.out.println("El total a pagar es "+(sueldo+boni));
    }
}
