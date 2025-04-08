import java.util.Scanner;

public class MiAppJava {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();  

        Saludador saludador = new Saludador();
        saludador.saludar(nombre);  

        scanner.close();
    }
}

