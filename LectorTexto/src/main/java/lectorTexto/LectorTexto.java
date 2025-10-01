package lectorTexto;
import java.io.*;

public class LectorTexto {
    public static void main(String[] args) {

        try (InputStream is = LectorTexto.class.getResourceAsStream("/Entrada.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(is))) {

                String linea;
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            System.exit(1);
        }
    }
}
