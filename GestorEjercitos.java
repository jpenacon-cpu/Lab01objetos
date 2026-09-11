// Contiene la lógica del juego y las reglas de evaluación
public class GestorEjercitos{
    // Evalúa qué ejército tiene mayor cantidad de soldados
    public static String determinarGanador(int soldadosEjercito1, int soldadosEjercito2){
        if (soldadosEjercito1>soldadosEjercito2){
            return "El Ejercito 1 es el ganador";
        }
        else if (soldadosEjercito1<soldadosEjercito2){
            return "El Ejercito 2 es el ganador";
        }
        else{
            return "Empate entre ambos Ejercitos";
        }
    }
}