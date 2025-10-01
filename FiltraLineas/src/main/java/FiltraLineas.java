import java.util.Scanner;

public class FiltraLineas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String linea = sc.nextLine();
            if (linea.length() > 20) {
                System.out.println(linea);
            }
        }

        sc.close();
    }
}
