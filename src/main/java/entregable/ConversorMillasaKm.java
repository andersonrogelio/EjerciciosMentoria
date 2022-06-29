package entregable;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversorMillasaKm {

    public static void main(String[] args) {
        int millas;
        double km;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese las millas");
        millas = s.nextInt();
        km = millas *1.6093;
        DecimalFormat formato = new DecimalFormat("#.##");
        System.out.println("Esta cantidad de millas "+millas+ " equivale a "+formato.format(km)+" en km");
        while (millas != 0){
            System.out.println("Ingrese las millas");
            millas = s.nextInt();
            km = millas *1.6093;
            System.out.println("Esta cantidad de millas "+millas+ " equivale a "+formato.format(km)+" en km");
        }
    }
}
