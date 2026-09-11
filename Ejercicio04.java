public class Ejercicio04 {
    public static void main(String[] args) {
        // --- ACTIVIDAD 4: 5 Soldados (Arreglos estándar, nombre y vida) ---
        String[] nombresAct3 = {"Alpha", "Beta", "Gamma", "Delta", "Epsilon"};
        System.out.println("\n>>> EJECUTANDO ACTIVIDAD 4 <<<");
        int[] vidasAct4 = new int[5];
        for (int i = 0; i < 5; i++) {
            vidasAct4[i] = Soldado.generarVidaAleatoria();
        }
        EntradaSalida.mostrarEjercito("Ejército Actividad 4", nombresAct3, vidasAct4);
    }
}
