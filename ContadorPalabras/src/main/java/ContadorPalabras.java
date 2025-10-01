import java.util.Scanner;

public class ContadorPalabras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;

        while (sc.hasNextLine()) {
            String linea = sc.nextLine().trim();
            if (!linea.isEmpty()) {
                String[] palabras = linea.split("\\s+"); // divide por espacios
                contador += palabras.length;
            }
        }

        sc.close();
        System.out.println("Número total de palabras: " + contador);
    }
}
