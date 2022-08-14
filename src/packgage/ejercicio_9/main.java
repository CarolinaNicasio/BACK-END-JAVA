package packgage.ejercicio_9;

public class main {
    public static void main(String[] args) {
        cliente Cliente = new cliente();
        Cliente.nombre= "Julian";
        Cliente.edad= 33;
        Cliente.telefono= 261234567;
        Cliente.credito= 2344;
        System.out.println ("Nombre: "+ Cliente.nombre + " " +"Edad: "+ Cliente.edad + " "+ "Telefono: " +Cliente.telefono+ " "+ "Credito: "+ Cliente.credito);

        trabajador Trabajador= new trabajador ();
        Trabajador.nombre = "Rodrigo";
        Trabajador.edad = 35;
        Trabajador.telefono = 3456777;
        Trabajador.salario= 2346;
        System.out.println ("Nombre:" + Trabajador.nombre + " "+"Edad:" + Trabajador.edad + " "+ "Telefono:" + Trabajador.telefono + " "+"Salario:" + Trabajador.salario);
    }
}

class persona {
    int edad;
    String nombre;
    int telefono;

}
class cliente extends persona {
    double credito;
}
class trabajador extends persona {
    double salario;
}
