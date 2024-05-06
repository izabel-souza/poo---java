import java.util.Locale;
import java.util.Scanner;
import entities.Retangulo;

public class App {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo figura = new Retangulo();

        System.out.println("Informe altura e largura do retangulo respectivamente: ");
        figura.altura = sc.nextDouble();
        figura.largura = sc.nextDouble();

        double area = figura.Area();
        double perimetro = figura.Perimetro();
        double diagonal = figura.Diagonal();

        System.out.printf("AREA = " + area + "\nPERIMETRO = " + perimetro + "\nDIAGONAL = " + diagonal + "\n");

        sc.close();
    }
}
