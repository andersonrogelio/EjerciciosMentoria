package TallerJava;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Funciones {
    int n1;
    String palabra;
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

    public String quitaEspacios(String palabra){
        this.palabra = palabra;
        this.palabra = this.palabra.replace(" ","");
        return this.palabra;
    }
//    public String quitaVocales(String palabra){
//        this.palabra = palabra;
//        this.palabra = this.palabra.replace("a","");
//        this.palabra = this.palabra.replace("e","");
//        this.palabra = this.palabra.replace("i","");
//        this.palabra = this.palabra.replace("o","");
//        this.palabra = this.palabra.replace("u","");
//        return this.palabra;
//    }

    public void fechayHoraActual(){
        System.out.println(LocalDate.now()+" "+ LocalTime.now());
    }
}
