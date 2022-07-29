public class coche {
 private int puertas;
 public coche (int puertas) {
     this.puertas=puertas;

 }
public void puertasadd (int puertas){
     this.puertas+= puertas;
}
public void printInfo (){
     System.out.println ("Puertas del coche: " + puertas);
}
public static void main (String []args ){
     coche miCoche= new coche (4);
     miCoche.puertasadd (2);
     miCoche.printInfo();
}
}

