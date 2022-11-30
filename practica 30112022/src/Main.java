public class Main {
    public static void main (String[] args){
        int numerolf = 1;
        int numerowhile = 0;
        var estacion = "A";

        if (numerolf < 0){
            System.out.println("Numerolg es menor a cero.");
    }
        else if (numerolf > 0){
                System.out.println("Numerolg es mayor a cero.");
        }
       else {
            System.out.println("Numerolg es igual a cero.");
       }
        while (numerowhile < 3){
            System.out.println(numerowhile);
            numerowhile = numerowhile + 1;
        }
        do {
            System.out.println(numerowhile);
            numerowhile = numerowhile + 3;
        } while (numerowhile < 3) ;

        for (int numeroFor = 0 ; numeroFor <= 3; numeroFor =numeroFor + 1 ) {
            System.out.println(numeroFor);
        }
        switch (estacion) {
            case "VERANO":
                System.out.println("Es verano.");
                break;
            case "INVIERNO":
                System.out.println("Es invierno.");
                break;
            case "PRIMAVERA":
                System.out.println("Es primavera.");
                break;
            case "OTOÑO":
                System.out.println("Es otoño.");
                break;
            default:
                System.out.println("Eso no es una estación.");
        }
    }
}