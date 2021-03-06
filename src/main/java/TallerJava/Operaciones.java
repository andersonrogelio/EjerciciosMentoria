package TallerJava;
import java.util.Scanner;
public class Operaciones {
    Scanner scanner = new Scanner(System.in);
    Funciones funciones = new Funciones();
    int n1;
    int n2;
    double r,num_dou1;

    String palabra;

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
}
