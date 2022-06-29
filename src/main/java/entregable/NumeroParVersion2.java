package entregable;
//este sera la version mejorada de NumeroPar
public class NumeroParVersion2 {
    int n1;
    boolean vof;
    public NumeroParVersion2(int n1, boolean vof){
        this.n1 = n1;
        this.vof = vof;
    }

    public void resultado(){
        System.out.println("El numero "+this.n1+ "es par "+this.vof);
    }
}

public class Par extends NumeroParVersion2{

}
