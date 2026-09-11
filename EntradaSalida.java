import java.util.*;
// Contiene todo el manejo de lectura con Scanner y salidas por consola
public class EntradaSalida {

    private  static Scanner sc = new Scanner (System.in);
    public static String leerString(String mensaje){
        System.out.println(mensaje);
        return sc.nextLine();
    }
    // Muestra los datos de un ejército usando arreglos estándar
    public static void mostrarEjercito(String nombreEjercito, String [] nombre, int[] vidas){
        System.out.println("\n--- " + nombreEjercito + " ---");
        for (int i =0; i<nombre.length;i++){
            if (vidas !=null){
                System.out.println("  " + nombre[i] + " | Vida: " + vidas[i]);
            }
            else{
                System.out.println("  " + nombre[i]);
            }
        }
    }
}