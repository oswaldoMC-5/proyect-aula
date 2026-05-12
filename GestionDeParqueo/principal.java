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
                //System.out.println("---- Gestion de propietarios ----");
                gestion_de_propietarios();
                pausa();
                break;
            case 2:
                //System.out.println("---- Gestion de vehiculos ----");
                gestion_de_vehiculos();
                pausa();
                break;
            case 3:
                //System.out.println("---- Gestion del control ----");
                gestion_de_control();
                pausa();
                break;
            case 4:
                //System.out.println("---- Gestion de pago ----");
                gestion_de_pago();
                pausa();
                break;
        }
    } while(op >=1 && op < 5);
    System.out.println("Gracias por usar el software");
}

//gestion de propietarios
    public static void gestion_de_propietarios(){
        do{
            menu_crud("Gestion de propietarios ----");
            opCrud = leer.nextInt();
            switch (opCrud) {
            case 1:
                System.out.println("---- registrar de propietario ----");
                pausa();
                break;
            case 2:
                
                System.out.println("---- Listar propietario ----");
                pausa();
                break;
            case 3:
                System.out.println("---- modificar del propietario ----");
                pausa();
                break;
            case 4:
                System.out.println("---- eliminar propietario ----");
                pausa();
                break;
            }        
        }while(opCrud != 5);
    }
//gestion de vehiculos
    public static void gestion_de_vehiculos(){
        do{
            menu_crud("Gestion de Vehiculos ----");
            opCrud = leer.nextInt();
            switch (opCrud) {
            case 1:
                System.out.println("---- Registrar vehiculo ----");
                pausa();
                break;
            case 2:
                
                System.out.println("---- Listar vehiculo ----");
                pausa();
                break;
            case 3:
                System.out.println("---- modificar del vehiculo ----");
                pausa();
                break;
            case 4:
                System.out.println("---- eliminar vehiculo ----");
                pausa();
                break;
            }        
        }while(opCrud != 5);
    }
//control
    public static void gestion_de_control(){
        do{
            menu_crud("Gestion de control ----");
            opCrud = leer.nextInt();
            switch (opCrud) {
            case 1:
                System.out.println("---- registrar de entrada ----");
                pausa();
                break;
            case 2:
                
                System.out.println("---- Listar entrada ----");
                pausa();
                break;
            case 3:
                System.out.println("---- modificar el estado ----");
                pausa();
                break;
            case 4:
                System.out.println("---- salida ----");
                pausa();
                break;
            }        
        }while(opCrud != 5);
    }
 //pago
    public static void gestion_de_pago(){
        do{
            menu_crud("Gestion de pago ----");
            opCrud = leer.nextInt();
            switch (opCrud) {
            case 1:
                System.out.println("---- registrar pago ----");
                pausa();
                break;
            case 2:
                
                System.out.println("---- Listar pago ----");
                pausa();
                break;
            case 3:
                System.out.println("---- modificar pago ----");
                pausa();
                break;
            case 4:
                System.out.println("---- eliminar pago ----");
                pausa();
                break;
            }        
        }while(opCrud != 5);
    }

    public static void menu_principal() {
        System.out.println("---- Menu Principal ----");
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
        System.out.println("4. eliminar" );
        System.out.println("5. Regresar al menu principal");
        System.out.println("Digite la opcion");
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
