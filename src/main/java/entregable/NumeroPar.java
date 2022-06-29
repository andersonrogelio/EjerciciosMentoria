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

//    public NumeroPar(int n, boolean vof ){
////        this.numero = n;
//
//    }
//    public void resultado(){
//        System.out.println("Este numero"+ this.numero +" es par"+ this.vof);
//    }
//}
//
//public class EsPar extends NumeroPar{
//    int n1;
//    boolean par;
//
//    public EsPar(int n1, boolean par){
//        super(n1,par);
//        this.par = (n1 % 2 = 0);
//    }
}
