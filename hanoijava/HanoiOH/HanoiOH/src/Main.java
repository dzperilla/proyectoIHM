import java.io.*;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) throws IOException {
        int discos;
        // Creamos una partida de N discos
        JOptionPane.showMessageDialog(null, "Torres de Hanoi en Java Desarrollado por Orlando Hernandez (GooglesC)");
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Introduzca el número de discos a jugar: ");
        discos=Integer.parseInt(entrada.readLine());
        Hanoy H = new Hanoy (discos);
        // Si el usuario escribe un numero igual o menor a 0 no nos arroja un mensaje y sale del programa
        while(discos<=0){
            System.out.print("No es un numero correcto para jugar ");
        
            // Si no es menor o igual a 0 la resolvemos (movemos de columna 0 a columna 2 los n discos
        }
        H.MoverN(0,2,(discos));
        // Mostramos resultado.
        H.Mostrar();
        }
       }
