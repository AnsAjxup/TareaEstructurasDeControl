public class Main {
    public static void main(String[] args) {
        // IF
        System.out.println("Ejercicio If");
        int numeroIf = -3;
        if (numeroIf<0){
            System.out.println("El número " + numeroIf + " es NEGATIVO");
        } else if (numeroIf==0) {
            System.out.println("El numero es " + numeroIf);
        }else {
            System.out.println("El número " + numeroIf + " es POSITIVO");
        }

        //WHILE
        System.out.println("Ejercicio While");
        int numeroWhile = 0;
        while (numeroWhile < 3){
            System.out.println("El numero es: " + numeroWhile);
            numeroWhile++;
        }

        //DO WHILE
        System.out.println("Ejercicio do while");
        int numeroDoWhile = 0;
        do {
            System.out.println("El numero es: " + numeroDoWhile);
            numeroDoWhile += 3;
        }
        while (numeroDoWhile < 3);

        //FOR
        System.out.println("Ejercicio For");
        for (int numeroFor = 0; numeroFor <=3; numeroFor++){
            System.out.println("El numero es: " + numeroFor);
        }

        //SWITCH
        System.out.println("Ejercicio Switch");
        String estacion = "invierno";
        switch (estacion){
            case "verano":
                System.out.println("La estación del año es: " + estacion);
                break;
            case "invierno":
                System.out.println("La estación del año es: " + estacion);
                break;
            case "otoño":
                System.out.println("La estación del año es: " + estacion);
                break;
            case "primavera":
                System.out.println("La estación del año es: " + estacion);
                break;
            default:
                System.out.println("Esta no es una estación: " + estacion);
        }


    }
}