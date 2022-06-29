package ejercicios;

public class Operaciones {



        public class Operacion{

            double n1;
            double n2;
            double res;
            char resultado;



            public Operacion(double n1, double n2, char resultado){
                this.n1 = n1;
                this.n2 = n2;
                this.resultado = resultado;
            }

            public void verresultado(){
                System.out.println(this.n1+ " "+this.resultado+" " +this.n2+ " "+this.res);
            }
        }

        public class Resta extends Operacion{

            double resta;

            public Resta(double n1, double n2){

                super(n1,n2,'-');
                this.resta = n1 - n2;
                this.res = this.resta;
            }
        }

        public class Suma extends Operacion{

            double suma;

            public Suma(double n1, double n2){

                super(n1,n2,'+');
                this.suma = n1 + n2;

            }
        }
        public class Multiplicacion extends Operacion{

            double multiplicacion;

            public Multiplicacion(double n1, double n2){

                super(n1,n2,'*');
                this.multiplicacion = n1 + n2;

            }
        }

        public class Division extends Operacion{

            double division;

            public Division(double n1, double n2){

                super(n1,n2,'/');
                this.division = n1 + n2;

            }
        }

//        public static void main(String[] args) {
//            Resta r = new Resta(200 ,300);
//            r.verresultado();
//        }

    }

