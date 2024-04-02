//se hizo el import de scanner
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
      //declaramos de forma correcta el scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String jugador1 = scanner.nextLine().toLowerCase(); // Convertir entrada a minúsculas

        // Solicitar al jugador 2 su elección
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String jugador2 = scanner.nextLine().toLowerCase(); // Convertir entrada a minúsculas

        // Verificar si hay un empate
        if (jugador1.equals(jugador2)) {
            System.out.println("Empate");
        } else {
            int ganador = determinarGanador(jugador1, jugador2);
            if (ganador == 0) {
                System.out.println("Entrada inválida, ¡nadie gana!");
            } else {
                System.out.println("Gana el jugador " + ganador);
            }
        }
    }

    // Método para determinar el ganador
    private static int determinarGanador(String j1, String j2) {
        switch (j1) {
            case "piedra":
                return (j2.equals("tijeras")) ? 1 : 2;
            case "papel":
                return (j2.equals("piedra")) ? 1 : 2;
    
    /*Si j2 es igual a "tijeras", la expresión devuelve 1, 
    lo que indica que el jugador 1 gana.
    Si j2 no es igual a "tijeras", la expresión devuelve 2, 
    lo que indica que el jugador 2 gana.
    */
            case "tijeras":
                return (j2.equals("papel")) ? 1 : 2;
            default:
                return 0; // Si la entrada no es válida, retorna 0
        }
    }
}
