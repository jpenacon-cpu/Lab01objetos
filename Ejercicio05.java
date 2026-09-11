public class Ejercicio05 {
    public static void main(String[] args) {
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

