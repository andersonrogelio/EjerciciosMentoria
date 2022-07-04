package TallerJava;

public class Persona {
    //Ejercicio 16
    final char hombre = 'H';
//    final char mujer = 'M';
    private String nombre;
    private int edad;
    private  String dni;
    private char sexo;
    private float peso,altura;

    public Persona() {
        this.nombre ="";
        this.edad = 0;
        this.sexo = hombre;
        this.peso = 0;
        this.altura = 0;
    }
    public Persona(String nombre, int edad, char sexo) {
        this.nombre =nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
    }
    public Persona(String nombre, int edad,String dni, char sexo,float peso, float altura) {
        this.nombre =nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    public int calcularIMC() {
        final int imc;
        if ((this.peso/(this.altura*this.altura))<20){
            imc = -1;
        } else if (this.peso/(this.altura*this.altura)>=20 && this.peso/(this.altura*this.altura)<=25) {
            imc = 0;
        }else{
            imc = 1;
        }

        return imc;
    }
    public boolean esMayorDeEdad(){
        return this.edad>=18;
    }
    public void comprobarSexo(char sexo){
        if (!((sexo == 'H')||(sexo == 'M'))) {
            this.sexo = sexo;
        }else{
            this.sexo = hombre;
        }
    }
    @Override
    public String toString(){
        return "Nombre:"+this.nombre +"  edad:"+this.edad+" DNI:"+this.dni+" Sexo:"+this.sexo+" Peso:"+this.peso+" Altura:"+this.altura;
    }

    public  generarDNI(){

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}

