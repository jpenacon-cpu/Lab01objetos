
public class Soldado {

    // Genera un nivel de vida aleatorio entre 1 y 5
    public static int generarVidaAleatoria() {
        return (int) (Math.random() * 5) + 1;
    }

    // Genera una cantidad aleatoria de soldados entre 1 y 5 para un ejército
    public static int generarCantidadSoldados() {
        return (int) (Math.random() * 5) + 1;
    }

    // Genera nombres automáticos para los arreglos: "Soldado0", "Soldado1", etc.
    public static String[] generarNombresAutogenerados(int cantidad) {
        String[] nombres = new String[cantidad];
        for (int i = 0; i < cantidad; i++) {
            nombres[i] = "Soldado" + i;
        }
        return nombres;
    }
}