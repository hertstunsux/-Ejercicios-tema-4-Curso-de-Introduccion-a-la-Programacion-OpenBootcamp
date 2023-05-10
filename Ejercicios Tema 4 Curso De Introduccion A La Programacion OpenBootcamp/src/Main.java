public class Main {
    public static void main(String[] args) {
        System.out.println("Comienzo condicional If");
        int numeroIf = 0;
        if(numeroIf > 0) {
            System.out.println("El numeroIf es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El numeroIf es negativo");
        } else {
            System.out.println("El numeroIf es cero");
        }
        System.out.println("Comienzo bucle While");
        int numeroWhile = 1;
        while (numeroWhile < 3){
            System.out.println("numeroWhile = " +numeroWhile);
            numeroWhile = numeroWhile + 1;
        }
        System.out.println("Comienzo bucle Do While");
        do{
            System.out.println("numeroWhile = " +numeroWhile);
            numeroWhile = numeroWhile + 1;
        } while (numeroWhile < 3);
        System.out.println("Comienzo bucle For");
        for(int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor + 1){
            System.out.println("numeroFor = " +numeroFor);
        }
        System.out.println("Comienzo casos Switch");
        String estacion = "ABRIL";
        switch (estacion){
            case "INVIERNO":
                System.out.println("Estamos en invierno");
                break;
            case "VERANO":
                System.out.println("Estamos en verano");
                break;
            case "PRIMAVERA":
                System.out.println("Estamos en primavera");
                break;
            case "OTOÑO":
                System.out.println("Estamos en otoño");
                break;
            default:
                System.out.println("El valor de la variable no es una estacion");
        }
    }
}