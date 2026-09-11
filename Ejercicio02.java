public class Ejercicio02 {
    public static void main(String[] args) {
        // --- ACTIVIDAD 2: 5 Soldados (Variables simples, nombre y vida aleatoria) ---
        String s1 = "Soldado Alpha", s2 = "Soldado Beta";
        System.out.println("\n>>> EJECUTANDO ACTIVIDAD 2 <<<");
        int v1 = Soldado.generarVidaAleatoria(), v2 = Soldado.generarVidaAleatoria();
        System.out.println("Soldado 1: " + s1 + " | Vida: " + v1);
        System.out.println("Soldado 2: " + s2 + " | Vida: " + v2);
    }
}
