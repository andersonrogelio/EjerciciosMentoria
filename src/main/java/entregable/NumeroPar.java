package entregable;

import java.util.Scanner;

public class NumeroPar {

    public static void main(String[] args) {
        int numero;
        boolean vof;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un número para saber si es par");
        numero = s.nextInt();
        vof = numero%2 == 0;
        System.out.println("El número"+numero+ "es par "+ vof);
    }

}
