

public class main {
    public static void main(String[] args) {

    int numeroIf = 0;

      if(numeroIf>0){
        System.out.println("La variable numeroIf " + numeroIf + " es positivo");
    }
      else if (numeroIf<0){
            System.out.println("La variable numeroIf " + numeroIf + " es negativo");}
      else {
        System.out.println("La variable numeroIf es 0");
    }


    int numeroWhile = 2;

    while(numeroWhile < 3){
        numeroWhile++;
        System.out.println("La variable numeroWhile ahora vale: " + numeroWhile);
    }


    int numeroDoWhile = 1;
    do{
        numeroDoWhile++;
        System.out.println("La variable numeroDoWhile ahora vale: " + numeroDoWhile);
    }
    while(numeroDoWhile < 3);


    for(int numeroFor = 0; numeroFor <= 5; numeroFor++){
        System.out.println("La variable numeroFor ahora vale: " + numeroFor);
    }


    String estacion = "verano";
    switch(estacion) {
        case "primavera":
            System.out.println("Estamos en primavera");
            break;
        case "invierno":
            System.out.println("Estamos en invierno");
            break;
        case "otoño":
            System.out.println("Estamos en otoño");
            break;
        case "verano":
            System.out.println("Estamos en verano");
            break;
        default:
            System.out.println("No es una estación");
    }
}
}
