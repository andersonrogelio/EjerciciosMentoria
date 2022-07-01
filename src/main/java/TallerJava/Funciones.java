package TallerJava;

import java.util.Scanner;

public class Funciones {
    int n1;
    public Funciones() {
    }
    Scanner scanner = new Scanner(System.in);
    public void mostrarParesImpares(){
        int n1 = 1;
        while (n1>=1 && n1<=50 ){
            System.out.println(" Número impar: "+(n1*2-1)+" Número par: "+n1*2);
            n1 += 1;
        }
    }

    public void mostrarPareImparFor(){
        for (int i = 50; i >=1 ; i--) {
            System.out.println(" Número impar: "+(i*2-1)+" Número par: "+i*2);
        }
    }
}
