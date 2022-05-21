import java.util.Scanner;

/*
Interfaz del cajero automático (Proyecto del curso)
*/
public class Interfaz{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elija una de las siguientes opciones:");
        System.out.println("    Escriba 1 para consultar su saldo");
        System.out.println("    Escriba 2 para ingresar dinero");
        System.out.println("    Escriba 3 para sacar dinero");
        System.out.println("    Escriba 4 para consultar sus últimos movimientos");
        System.out.println("Una vez escrita la opción, pulse la tecla Enter");
        int opcion = scanner.nextInt();
        System.out.println("La opcion que usted ha elegido es: "+opcion);
        if (opcion==1){
            System.out.println("Consultando saldo...");
        }
        else if (opcion==2){
            System.out.println("Ingresando dinero...");
        }
        else if (opcion==3){
            System.out.println("Sacando dinero...");
        }
        else {
            System.out.println("Consultando sus últimos movimientos...");
        }
    }
}