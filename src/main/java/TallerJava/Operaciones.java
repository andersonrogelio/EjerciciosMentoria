package TallerJava;
import java.util.Scanner;
public class Operaciones {
    Scanner scanner = new Scanner(System.in);
    Funciones funciones = new Funciones();
    int n1;
    int n2;
    double r,num_dou1;

    String palabra, palabra2;

    public Operaciones() {
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setNum_dou1(double num_dou1) {
        this.num_dou1 = num_dou1;
    }

    public void esMayor(){
        if (this.n1>this.n2){
            System.out.printf("El número "+this.n1+" es mayor a "+this.n2);
        }else if(this.n1<this.n2){
            System.out.println("El número "+this.n1+" es menor a "+this.n2);
        }else{
            System.out.println("El número "+this.n1+" es igual a "+this.n2);
        }
    }

    public void verficacionNumeroMayor(){
        System.out.println("Ingrese el primer número");
        this.setN1(scanner.nextInt());
        System.out.println("Ingrese el primer número");
        this.setN2(scanner.nextInt());
        this.esMayor();
    }

    public void radioDeCirculo(){
        System.out.println("Ingrese el  radio del circulo ");
        this.setR(scanner.nextDouble());
        System.out.println("El radio del circulo es: "+r*Math.PI);
    }
    public Double calculoPorcentaje(int porcentaje, double valor ){
        return (porcentaje*valor)/100;
    }
    public void calcularPrecioIVA(){
        System.out.println("Ingrese el precio");
        this.setNum_dou1(scanner.nextDouble());
        System.out.println("El valor con IVA incluida es: "+(this.calculoPorcentaje(21,this.num_dou1)+this.num_dou1));
    }

    public void verificarNumeroMayoraCero(){
        do{
            System.out.println("Ingrese un número");
            this.n1 = scanner.nextInt();
        }while (!(this.n1>=0));
        System.out.println("El número es: "+this.n1);
    }

    public void esDiaLaboral(){
        System.out.println("Ingrese un día de la semana para saber si es laborable");
        this.palabra = scanner.next();
        switch (this.palabra){
            case  "domingo":
                System.out.println("Día no laborable");
                break;
            case "Domingo":
                System.out.println("Día no laborable");
                break;
            case "sábado":
                System.out.println("Día no laborable");
                break;
            case  "Sábado":
                System.out.println("Día no laborable");
                break;
            default:
                System.out.println("Día laborable");

        }

    }

    public void cadenaRemplazadayConcatenacion(){
        this.palabra = "La sonrisa sera la mejor arma contra la tristesa ";
        this.palabra = palabra.replace("a","e");
        System.out.println("Ingrese un texto:");
        this.palabra = this.palabra.concat(scanner.nextLine());
        System.out.println(this.palabra);
    }

    public void remplazarEspacios(){
        System.out.println("Ingrese un texto");
        this.palabra = scanner.nextLine();
        this.palabra = this.palabra.replaceAll(" ","");
        System.out.println(this.palabra);
    }

    public void contarCaracteresyVocales(){
        long cantidadVocales = 0;
        System.out.println("Ingrese un texto:");
        this.palabra = scanner.nextLine();
        this.palabra = funciones.quitaEspacios(this.palabra);
        System.out.println("La cantidad de carácteres es: "+this.palabra.length());
        cantidadVocales += this.palabra.chars().filter(a -> a == 'a').count();
        cantidadVocales += this.palabra.chars().filter(e -> e == 'e').count();
        cantidadVocales += this.palabra.chars().filter(i -> i == 'i').count();
        cantidadVocales += this.palabra.chars().filter(o -> o == 'o').count();
        cantidadVocales += this.palabra.chars().filter(u -> u == 'u').count();
        System.out.println("La cantidad de vocales es: "+cantidadVocales);

    }

    public void palabrasIguales(){
        System.out.println("Ingrese la primer palabra");
        this.palabra = scanner.nextLine();
        System.out.println("Ingrese la segunda palabra");
        this.palabra2 = scanner.nextLine();
        if(this.palabra.equals(this.palabra2)){
            System.out.println("Las palabras son iguales");
        } else {
            char [] p1 = this.palabra.toCharArray();
            char [] p2 = this.palabra2.toCharArray();

            if (this.palabra.length() > this.palabra2.length()) {
                System.out.println("Estas son las diferencias");
            for (int i = 0 ;i <= p2.length-1 ;i++){
                if ((p2 [i] != p1 [i]))
                System.out.print(" "+ p2 [i]);

            }
        }
            if (this.palabra.length() < this.palabra2.length()) {
                System.out.println("Estas son las diferencias");
            for (int i = 0 ;i<(p1.length  -1);i++){
                if (!(p1 [i] == p2 [i]))
                    System.out.print(" "+p1[i]);

            }
        }
            if (this.palabra.length() == this.palabra2.length()) {
                System.out.println("Estas son las diferencias");
            for (int i = 0 ;i<(p1.length -1);i++){
                if (!(p1[i] == p2[i]))
                    System.out.print(" "+p1[i]);

            }
        }

        }
    }

    public void numeroDe2en2(){
        System.out.println("Ingrese un número:");
        this.n1 = scanner.nextInt();
        for (int i = this.n1; i <= 1000; i = i+2) {
            System.out.println(i);
        }
    }

    public void menuIterativo(){
        do {
            System.out.println("******GESTION CINEMATOGRAFICA********");
            System.out.println("1-NUEVO ACTOR");
            System.out.println("2-BUSCAR ACTOR");
            System.out.println("3-ELIMINAR ACTOR");
            System.out.println("4-MODIFICAR ACTOR");
            System.out.println("5-VER TODOS LOS ACTORES");
            System.out.println("6-VER PELICULAS DE LOS ACTORES");
            System.out.println("7-VER CATEGORIAS DE LAS PELICULAS DE LOS ACTORES");
            System.out.println("8-SALIR");
            this.n1 = scanner.nextInt();

            switch (this.n1){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                default:
                    System.out.println("OPCION INCORRECTO");
            }

        }while (this.n1 != 8);
    }
}
