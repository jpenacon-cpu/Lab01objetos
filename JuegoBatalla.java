public class JuegoBatalla {

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("        VIDEOJUEGO DE ESTRATEGIA v1.0     ");
        System.out.println("==========================================");

        // --- ACTIVIDAD 1: 5 Soldados (Variables simples, solo nombres) ---
        System.out.println("\n>>> EJECUTANDO ACTIVIDAD 1 <<<");
        String s1 = "Soldado Alpha", s2 = "Soldado Beta", s3 = "Soldado Gamma", s4 = "Soldado Delta", s5 = "Soldado Epsilon";
        System.out.println("Soldados creados: " + s1 + ", " + s2 + ", " + s3 + ", " + s4 + ", " + s5);

        // --- ACTIVIDAD 2: 5 Soldados (Variables simples, nombre y vida aleatoria) ---
        System.out.println("\n>>> EJECUTANDO ACTIVIDAD 2 <<<");
        int v1 = Soldado.generarVidaAleatoria(), v2 = Soldado.generarVidaAleatoria();
        System.out.println("Soldado 1: " + s1 + " | Vida: " + v1);
        System.out.println("Soldado 2: " + s2 + " | Vida: " + v2);

        // --- ACTIVIDAD 3: 5 Soldados (Arreglo estándar, solo nombres) ---
        System.out.println("\n>>> EJECUTANDO ACTIVIDAD 3 <<<");
        String[] nombresAct3 = {"Alpha", "Beta", "Gamma", "Delta", "Epsilon"};
        EntradaSalida.mostrarEjercito("Ejército Actividad 3", nombresAct3, null);

        // --- ACTIVIDAD 4: 5 Soldados (Arreglos estándar, nombre y vida) ---
        System.out.println("\n>>> EJECUTANDO ACTIVIDAD 4 <<<");
        int[] vidasAct4 = new int[5];
        for (int i = 0; i < 5; i++) {
            vidasAct4[i] = Soldado.generarVidaAleatoria();
        }
        EntradaSalida.mostrarEjercito("Ejército Actividad 4", nombresAct3, vidasAct4);

        // --- ACTIVIDAD 5: Entregable Videojuego de Estrategia v1.0 ---
        System.out.println("\n>>> EJECUTANDO ACTIVIDAD 5 (SIMULACIÓN DE BATALLA) <<<");

        // Crear Ejército 1
        int cantEj1 = Soldado.generarCantidadSoldados();
        String[] ej1Nombres = Soldado.generarNombresAutogenerados(cantEj1);
        int[] ej1Vidas = new int[cantEj1];
        for (int i = 0; i < cantEj1; i++) ej1Vidas[i] = Soldado.generarVidaAleatoria();

        // Crear Ejército 2
        int cantEj2 = Soldado.generarCantidadSoldados();
        String[] ej2Nombres = Soldado.generarNombresAutogenerados(cantEj2);
        int[] ej2Vidas = new int[cantEj2];
        for (int i = 0; i < cantEj2; i++) ej2Vidas[i] = Soldado.generarVidaAleatoria();

        // Mostrar ambos ejércitos
        EntradaSalida.mostrarEjercito("Ejército 1 (" + cantEj1 + " soldados)", ej1Nombres, ej1Vidas);
        EntradaSalida.mostrarEjercito("Ejército 2 (" + cantEj2 + " soldados)", ej2Nombres, ej2Vidas);

        // Evaluar y mostrar el ganador
        System.out.println("\n------------------------------------------");
        String resultado = GestorEjercitos.determinarGanador(cantEj1, cantEj2);
        System.out.println("RESULTADO: " + resultado);
        System.out.println("------------------------------------------");
    }
}