import java.util.Scanner;
public class principal{
static Scanner leer = new Scanner(System.in);
    static int opCrud;

    // ===== PROPIETARIOS =====
static Propietarios[] np = new Propietarios[20];
static int PR = 0;

// ===== VEHICULOS =====
static Vehiculo[] nv = new Vehiculo[20];
static int VH = 0;

// ===== CONTROL =====
static Control[] nc = new Control[20];
static int CR = 0;

// ===== PAGOS =====
static Pago[] pg = new Pago[20];
static int PG = 0;

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
            leer.nextLine();
            switch (opCrud) {
            case 1:
                System.out.println("---- registrar de propietario ----");
                    
                    System.out.println("Ingrese el nombre del propietario: ");
                String nombre = leer.nextLine();

                System.out.println("Ingrese el apellido del propietario: ");
                String apellido = leer.nextLine();

                System.out.println("Ingrese el numero de telefono del propietario: ");
                String telefono = leer.nextLine();

                System.out.println("Ingrese la cedula del propietario: ");
                String cedula = leer.nextLine();

                Propietarios p = new Propietarios();

                

                p.nombre = nombre;
                p.apellido = apellido;
                p.telefono = telefono;
                p.cedula = cedula;

                np[PR]= p;


                PR++;

                System.out.println("propietario registrado correctamente. ");



                    
                pausa();
                break;
            case 2:
                
                System.out.println("---- Listar propietario ----");

                    if (PR == 0) {
                    System.out.println("No hay propietarios registrados.");
                    
                }else{
                    for(int i = 0; i<PR; i++){
                        
                System.out.println("-----------------------------");       
                System.out.println("PROPIETARIO #"+ (i+1));
                System.out.println("Nombre: " + np[i].nombre);
                System.out.println("Apellido: " + np[i].apellido);
                System.out.println("Telefono: " + np[i].telefono);
                System.out.println("Cedula: " + np[i].cedula);
                System.out.println("-----------------------------");
                    }

                }

                    
                pausa();
                break;
            case 3:
                System.out.println("---- modificar del propietario ----");

                if(PR == 0){

                    System.out.println("No hay propietarios registrados.");

                }else{

                    for(int i = 0; i<PR; i++){
                        
                System.out.println("-----------------------------");       
                System.out.println("PROPIETARIO #"+ (i+1));
                System.out.println("Nombre: " + np[i].nombre);
                System.out.println("Apellido: " + np[i].apellido);
                System.out.println("Telefono: " + np[i].telefono);
                System.out.println("Cedula: " + np[i].cedula);
                System.out.println("-----------------------------");



                }

            }
                    System.out.println("Digite la opcion del posicion del propietario que desea modificar: ");
                    int cambiar = leer.nextInt();
                    leer.nextLine();

                    cambiar--;

                    if (cambiar >= 0 && cambiar < PR) {

                System.out.println("Ingrese el nombre del propietario: ");
                np[cambiar].nombre = leer.nextLine();

                System.out.println("Ingrese el apellido del propietario: ");
                np[cambiar].apellido = leer.nextLine();

                System.out.println("Ingrese el numero de telefono del propietario: ");
                np[cambiar].telefono = leer.nextLine();

                System.out.println("Ingrese la cedula del propietario: ");
                np[cambiar].cedula = leer.nextLine();

                System.out.println("Propietario modificado correctamente.");
                        
                    }else{

                        System.out.println("Posicion invalida.");
                    }
                    
                pausa();
                break;
            case 4:
                System.out.println("---- eliminar propietario ----");

                    if (PR == 0) {
                    System.out.println("No hay propietarios registrados.");
                    
                }else{
                    for(int i = 0; i<PR; i++){
                        
                System.out.println("-----------------------------");       
                System.out.println("PROPIETARIO #"+ (i+1));
                System.out.println("Nombre: " + np[i].nombre);
                System.out.println("Apellido: " + np[i].apellido);
                System.out.println("Telefono: " + np[i].telefono);
                System.out.println("Cedula: " + np[i].cedula);
                System.out.println("-----------------------------");
                    }

                }

        System.out.print("Digite la posicion del propietario a eliminar: ");
        int posicion = leer.nextInt();

        posicion--;

        if (posicion >= 0 && posicion < PR) {

            // Mover datos para cerrar el espacio
            for (int i = posicion; i < PR - 1; i++) {

                np[i] = np[i + 1];
                np[i] = np[i + 1];
                np[i] = np[i + 1];
                np[i] = np[i + 1];
            }

            PR--;

            System.out.println("Propietario eliminado correctamente");

        } else {

            System.out.println("Posicion invalida");
        }
                    
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
            leer.nextLine();
            switch (opCrud) {
            case 1:
                System.out.println("---- registrar de Vehiculo ----");
                    
                    System.out.println("Ingrese el nombre del Placa: ");
                String Placa = leer.nextLine();

                System.out.println("Ingrese el Modelo: ");
                String Modelos = leer.nextLine();

                System.out.println("Ingrese la Marca: ");
                String Marca = leer.nextLine();

                Vehiculo v = new Vehiculo();

                v.Placa = Placa;
                v.Modelo = Modelos;
                v.Marca = Marca;

                nv[VH]= v;


                VH++;

                System.out.println("Vehiculo registrado correctamente. ");
 
                pausa();
                break;
            case 2:
                
                System.out.println("---- Listar Vehiculos ----");

                    if (VH == 0) {
                    System.out.println("No hay propietarios registrados.");
                    
                }else{
                    for(int i = 0; i<VH; i++){
                        
                System.out.println("-----------------------------");       
                System.out.println("Vehiculo #"+ (i+1));
                System.out.println("Placa: " + nv[i].Placa);
                System.out.println("Modelo: " + nv[i].Modelo);
                System.out.println("Marca: " + nv[i].Marca);
                System.out.println("-----------------------------");
                    }

                }

                    
                pausa();
                break;
            case 3:
                System.out.println("---- modificar del Vehiculo ----");

                if(VH == 0){

                    System.out.println("No hay propietarios registrados.");

                }else{

                    for(int i = 0; i<VH; i++){
                        
                System.out.println("-----------------------------");       
                System.out.println("Vehiculo #"+ (i+1));
                System.out.println("Placa: " + nv[i].Placa);
                System.out.println("Modelo: " + nv[i].Modelo);
                System.out.println("Marca: " + nv[i].Marca);
                System.out.println("-----------------------------");

                }

            }
                    System.out.println("Digite la opcion del posicion del Vehiculo que desea modificar: ");
                    int cambiar = leer.nextInt();
                    leer.nextLine();

                    cambiar--;

                    if (cambiar >= 0 && cambiar < VH) {

                System.out.println("Ingrese el nombre del propietario: ");
                nv[cambiar].Placa = leer.nextLine();

                System.out.println("Ingrese el apellido del propietario: ");
                nv[cambiar].Modelo = leer.nextLine();

                System.out.println("Ingrese el numero de telefono del propietario: ");
                nv[cambiar].Marca = leer.nextLine();

                System.out.println("Vehiculo modificado correctamente.");
                        
                    }else{

                        System.out.println("Posicion invalida.");
                    }
                    
                pausa();
                break;
            case 4:
                System.out.println("---- eliminar Vehiculo ----");

                    if (VH == 0) {
                    System.out.println("No hay Vehiculo registrados.");
                    
                }else{
                    for(int i = 0; i<VH; i++){
                        
                System.out.println("-----------------------------");       
                System.out.println("Vehiculo #"+ (i+1));
                System.out.println("Placa: " + nv[i].Placa);
                System.out.println("Modelo: " + nv[i].Modelo);
                System.out.println("Marca: " + nv[i].Marca);
                System.out.println("-----------------------------");
                    }

                }

        System.out.print("Digite la posicion del Vehiculo a eliminar: ");
        int posicion = leer.nextInt();

        posicion--;

        if (posicion >= 0 && posicion < VH) {

            // Mover datos para cerrar el espacio
            for (int i = posicion; i < VH - 1; i++) {

                nv[i] = nv[i + 1];
                nv[i] = nv[i + 1];
                nv[i] = nv[i + 1];
                nv[i] = nv[i + 1];
            }

            VH--;

            System.out.println("vehiculo eliminado correctamente");

        } else {

            System.out.println("Posicion invalida");
        }
                    
                pausa();
                break;
            }        
        }while(opCrud != 5);
    }
//gestion de control
    public static void gestion_de_control(){


        do{
            menu_crud("Gestion de control ----");
            opCrud = leer.nextInt();
            leer.nextLine();
            switch (opCrud) {
            case 1:

                System.out.println("---- registrar entrada ----");

                System.out.println("Ingrese el vehiculo: ");
                String vehiculo = leer.nextLine();

                System.out.println("Ingrese la fecha: ");
                String fecha = leer.nextLine();

                System.out.println("Ingrese la hora de entrada: ");
                String horaEntrada = leer.nextLine();

                System.out.println("Ingrese la hora de salida: ");
                String horaSalida = leer.nextLine();

                System.out.println("Ingrese el estado: ");
                String estado = leer.nextLine();

                Control c = new Control();

                c.vehiculo = vehiculo;
                c.fecha = fecha;
                c.horaEntrada = horaEntrada;
                c.estado = estado;
                c.horaSalida = horaSalida;

                nc[CR] = c;
                CR++;

                System.out.println("Entrada registrada correctamente");
                
                pausa();
                break;
            case 2:
                
                System.out.println("---- Listar entrada ----");
                    if (CR == 0) {
                        System.out.println("No hay controles registrados.");
                    }else{
                        for(int i = 0; i<CR; i++){
                            System.out.println("-----------------------------");
                            System.out.println("CONTROL #"+ (i+1));
                            System.out.println("Vehiculo: " + nc[i].vehiculo);
                            System.out.println("Fecha: " + nc[i].fecha);
                            System.out.println("Hora de entrada: " + nc[i].horaEntrada);
                            System.out.println("Hora de salida: " + nc[i].horaSalida);
                            System.out.println("Estado: " + nc[i].estado);
                            System.out.println("-----------------------------");
                        }
                }

                pausa();
                break;
            case 3:

                System.out.println("---- modificar el estado ----");

                if(CR == 0){

                    System.out.println("No hay registros");

                }else{

                    for(int i = 0; i < CR; i++){

                        System.out.println((i+1) + ". " + nc[i].vehiculo);
                    }

                    System.out.println("Digite la posicion: ");
                    int cambiar = leer.nextInt();
                    leer.nextLine();

                    cambiar--;

                    if(cambiar >= 0 && cambiar < CR){

                        System.out.println("Nuevo estado: ");

                        nc[cambiar].estado = leer.nextLine();

                        System.out.println("Estado actualizado");

                    }else{

                        System.out.println("Posicion invalida");
                    }
                }

                pausa();
                break;
case 4:

    System.out.println("---- salida ----");

    if(CR == 0){

        System.out.println("No hay registros");

    }else{

        for(int i = 0; i < CR; i++){

            System.out.println((i+1) + ". " + nc[i].vehiculo);
        }

        System.out.println("Digite la posicion: ");
        int salida = leer.nextInt();
        leer.nextLine();

        salida--;

        if(salida >= 0 && salida < CR){

            System.out.println("Ingrese hora de salida: ");
            nc[salida].horaSalida = leer.nextLine();

            nc[salida].estado = "FINALIZADO";

            System.out.println("Salida registrada correctamente");

            // ELIMINAR EL REGISTRO DEL CONTROL
            for(int i = salida; i < CR - 1; i++){

                nc[i] = nc[i + 1];
            }

            CR--;

            System.out.println("Registro eliminado correctamente");

        }else{

            System.out.println("Posicion invalida");
        }
    }

    pausa();
    break;
            }        
        }while(opCrud != 5);
    }
 // gestion de pago
public static void gestion_de_pago(){

    do{

        menu_crud("Gestion de pago ----");

        opCrud = leer.nextInt();
        leer.nextLine();

        switch(opCrud){

           
            case 1:

                System.out.println("---- registrar pago ----");

                System.out.println("Ingrese el vehiculo:");
                String vehiculo = leer.nextLine();

                System.out.println("Ingrese la tarifa por hora:");
                double tarifa = leer.nextDouble();

                System.out.println("Ingrese las horas:");
                int horas = leer.nextInt();

                double total = tarifa * horas;

                Pago p = new Pago();

                p.vehiculo = vehiculo;
                p.tarifa = tarifa;
                p.total = total;

                pg[PG] = p;

                PG++;

                System.out.println("Pago registrado correctamente");
                System.out.println("Total a pagar: " + total);

                pausa();
                break;

            
            case 2:

                System.out.println("---- listar pagos ----");

                if(PG == 0){

                    System.out.println("No hay pagos registrados");

                }else{

                    for(int i = 0; i < PG; i++){

                        System.out.println("----------------------");
                        System.out.println("PAGO #" + (i+1));
                        System.out.println("Vehiculo: " + pg[i].vehiculo);
                        System.out.println("Tarifa: " + pg[i].tarifa);
                        System.out.println("Total: " + pg[i].total);
                        System.out.println("----------------------");
                    }
                }

                pausa();
                break;

            
            case 3:

                System.out.println("---- modificar pago ----");

                if(PG == 0){

                    System.out.println("No hay pagos registrados");

                }else{

                    for(int i = 0; i < PG; i++){

                        System.out.println((i+1) + ". " + pg[i].vehiculo);
                    }

                    System.out.println("Digite la posicion:");
                    int cambiar = leer.nextInt();
                    leer.nextLine();

                    cambiar--;

                    if(cambiar >= 0 && cambiar < PG){

                        System.out.println("Nueva tarifa:");
                        pg[cambiar].tarifa = leer.nextDouble();

                        System.out.println("Nuevas horas:");
                        int horasNuevas = leer.nextInt();

                        pg[cambiar].total = pg[cambiar].tarifa * horasNuevas;

                        System.out.println("Pago modificado correctamente");

                    }else{

                        System.out.println("Posicion invalida");
                    }
                }

                pausa();
                break;

            
            case 4:

                System.out.println("---- eliminar pago ----");

                if(PG == 0){

                    System.out.println("No hay pagos registrados");

                }else{

                    for(int i = 0; i < PG; i++){

                        System.out.println((i+1) + ". " + pg[i].vehiculo);
                    }

                    System.out.println("Digite la posicion:");
                    int eliminar = leer.nextInt();

                    eliminar--;

                    if(eliminar >= 0 && eliminar < PG){

                        for(int i = eliminar; i < PG - 1; i++){

                            pg[i] = pg[i + 1];
                        }

                        PG--;

                        System.out.println("Pago eliminado correctamente");

                    }else{

                        System.out.println("Posicion invalida");
                    }
                }

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
