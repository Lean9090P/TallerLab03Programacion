import java.util.*;

public class Menu {
    public static void PrincipalMenu(){
        Scanner ScanHD = new Scanner(System.in);
        boolean salir = false;
        int opcionPrincipal;
        System.out.println("Ingrese el numero de la opcion de desee");
        do {
            System.out.println("[1] Agregar Buses Iniciales");
            System.out.println("[2] Comprar");
            System.out.println("[3] Vender");
            System.out.println("[4] Salir");
            opcionPrincipal = ScanHD.nextInt();
            Empresa empresa = new Empresa();

            switch (opcionPrincipal) {
                case 1:
                    empresa.busesIniciales();
                    System.out.println();
                    break;
                case 2:
                    empresa.comprar();
                    System.out.println();
                    break;
                case 3:
                    empresa.vender();
                    System.out.println();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
            }
        }
        while (!salir);
    }









}

