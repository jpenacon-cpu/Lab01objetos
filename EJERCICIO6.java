import java.util.*;
public class EJERCICIO6 {
    public static void main(String[] args) {
        String ahor1 = " +---+\n"+
                       " |   |\n"+
                       "     |\n"+
                       "     |\n"+
                       "     |\n"+
                       "     |\n"+
                       "=========";
        String ahor2 = " +---+\n"+
                       " |   |\n"+
                       " O   |\n"+
                       "     |\n"+
                       "     |\n"+
                       "     |\n"+
                       "=========";
        String ahor3 = " +---+\n"+
                       " |   |\n"+
                       " O   |\n"+
                       " |   |\n"+
                       "     |\n"+
                       "     |\n"+
                       "=========";
        String ahor4 = " +---+\n"+
                       " |   |\n"+
                       " O   |\n"+
                       "/|   |\n"+
                       "     |\n"+
                       "     |\n"+
                       "=========";
        String ahor5 = " +---+\n"+
                       " |   |\n"+
                       " O   |\n"+
                       "/|\\  |\n"+
                       "     |\n"+
                       "     |\n"+
                       "=========";
        String ahor6 = " +---+\n"+
                       " |   |\n"+
                       " O   |\n"+
                       "/|\\  |\n"+
                       "/    |\n"+
                       "     |\n"+
                       "=========";
        String ahor7 = " +---+\n"+
                       " |   |\n"+
                       " O   |\n"+
                       "/|\\  |\n"+
                       "/ \\  |\n"+
                       "     |\n"+
                       "=========";
        String [] figuras = {ahor1, ahor2, ahor3, ahor4, ahor5, ahor6, ahor7};
        int contador = 1;
        String letra;
        String [] palabras = {"programacion", "java", "indentacion", "clases",
        "objetos", "desarrollador", "pruebas"};

        String palSecreta = getPalabraSecreta(palabras);
        System.out.println(figuras[0]);
        mostrarBlancos(palSecreta);
        System.out.println("\n");

        char[] letras = new char[palSecreta.length()];
        inicializar(letras);
        int global = 0;
        //COMPLETAR Y/O CORREGIR PARA QUE FUNCIONE EL JUEGO
        while(mostrarGanador(letras,global,contador )){
            letra = ingreseLetra();
            if (letraEnPalabraSecreta(letra, palSecreta)){
                mostrarBlancosActualizados(letra,palSecreta,letras);
                global+=1;
                continue;
            }
            else
                System.out.println(figuras[contador]);
            contador = contador +1;
            global+=1;
        }
        //COMPLETAR PARA INDICAR SI GANÓ, PERDIÓ Y CUÁNTOS TURNOS NECESITÓ
        System.out.println("\n");
    }
    public static String getPalabraSecreta(String [] lasPalabras){
        String palSecreta;
        int ind;
        int indiceMayor = lasPalabras.length -1;
        int indiceMenor = 0;
        ind = (int) (Math.random() * (indiceMayor - indiceMenor + 1) + indiceMenor);
        return lasPalabras[ind];
    }
    public static void mostrarBlancos(String palabra){
        for(int i=0; i< palabra.length(); i++)
            System.out.print("_ " );

    }
    public static String ingreseLetra(){
        String laLetra;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese letra: ");
        laLetra = sc.next();
        while(laLetra.length()!= 1 || !laLetra.matches("[a-z]+")){ //COMPLETAR PARA VALIDAR CARACTERES PERMITIDOS a-z
            System.out.println("Ingrese letra: ");
            laLetra = sc.next();
        }
        return laLetra;
    }
    public static boolean letraEnPalabraSecreta(String letra, String palSecreta){
        for (int i=0;i<palSecreta.length();i++){
            if (letra.charAt(0)==(palSecreta.charAt(i))){
                return true;
            }
        }
        return false;
    }
    public static void mostrarBlancosActualizados(String letra, String palSecreta, char [] letras){
        System.out.println("PROCESANDO.....");
        for (int i=0;i<palSecreta.length();i++){
            if (letra.charAt(0)==palSecreta.charAt(i)){
                letras[i] = letra.charAt(0);
            }
        }
        for (int i=0;i<letras.length;i++){
            System.out.print(letras[i]);
        }
        System.out.println();
    }
    public static void inicializar(char[] letras){
        for (int i=0;i<letras.length;i++){
            letras[i] = '_';
        }
    }
    public static boolean mostrarGanador(char[] letras, int cant,int per){
        boolean v1 = false;
        for (int i=0;i<letras.length;i++){
            if (letras[i]=='_'&& per-1<6){
                v1 = true;
                return v1;
            }
            if (letras[i]=='_'&& per-1==6){
                System.out.print("Perdiste\nCantidad de turnos: "+cant);
                return v1;
            }
        }
        if (!v1){
            System.out.print("Ganaste\nCantidad de turnos: "+cant);
        }

    return v1;
    }
}
