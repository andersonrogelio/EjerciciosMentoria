package TallerJava;

public class Electrodomestico {

    private int precioBase = 100;
    private String colorElectro = "blanco";
    private char consumoEnergetico = 'F';
    private float peso = 5;

    public Electrodomestico(){

    }
    public Electrodomestico(int precio,float peso){
        this.precioBase = precio;
        this.peso = peso;
    }
    public Electrodomestico(int precio,String color,char consumoEnergetico, float peso){
        this.precioBase = precio;
        this.colorElectro = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public String getColorElectro() {
        return colorElectro;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public float getPeso() {
        return peso;
    }



}
