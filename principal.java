import java.util.Scanner;
public class principal{
static Scanner leer = new Scanner(System.in);
    static int opCrud;
    public static void main(String[] args){
        int op;
        
        do{
        limpiarPantalla();
        menu_principal();
        System.out.println("Digite la opcion");
        op = leer.nextInt();
        switch (op) {
            case 1:
                System.out.println("---- Gestion de propietarios ----");
                pausa();
                break;
            case 2:
                //System.out.println("---- Gestion de vehiculos ----");
                gestion_de_veiculos();
                pausa();
                break;
                case 3:
                System.out.println("---- Gestion del control ----");
                pausa();
                break;
                case 4:
                System.out.println("---- Gestion de pago ----");
                pausa();
                break;
        }
    } while(op >=1 && op < 5);
    System.out.println("Gracias por usar el software");
}
//gention de veiculos
    public static void gestion_de_veiculos(){
        do{
            menu_crud("Gestion de Veiculos ----");
            opCrud = leer.nextInt();
        }while(opCrud != 5);
    }

    public static void menu_principal() {
        
        System.out.println("1. Gestion de propietarios");
        System.out.println("2. Gestion de vehiculos");
        System.out.println("3. Gestion del control");
        System.out.println("4. Gestion de pagos");
        System.out.println("5. Salir");
    }

    public static void menu_crud(String titulo) {
        System.out.println("--Menu de " + titulo + "--");
        System.out.println("1. Registrar");
        System.out.println("2. Listar");
        System.out.println("3. Modificar");
        System.out.println("4. Eliminar");
        System.out.println("5. Regresar al menu principal");
    }
    public static void limpiarPantalla() {
        try{
            ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
            Process startProcess = pb.inheritIO().start();
            startProcess.waitFor();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void pausa(){
        leer.nextLine();
        System.out.println("\t\nPresione enter para continuar...");
        leer.nextLine();
    }
}
