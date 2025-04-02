import java.util.Scanner;

import javax.swing.JOptionPane;

public class MiAppJava {
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();  // Guarda el nombre ingresado por el usuario

        System.out.println("¡Hola, " + nombre + "!");  // Muestra el nombre en consola

        scanner.close();
    }
}
    
