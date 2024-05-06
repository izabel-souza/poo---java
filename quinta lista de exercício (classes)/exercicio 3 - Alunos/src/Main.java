import java.util.Scanner;
import java.util.Locale;
import entities.Alunos;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Alunos alu = new Alunos();

        System.out.print("Nome: ");
        alu.nome = sc.nextLine();

        System.out.print("Nota 1: ");
        alu.nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        alu.nota2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        alu.nota3 = sc.nextDouble();

        double nota_final = alu.NotaFinal();
        System.out.println("FINAL GRADE = " + nota_final);

        decisao(nota_final);
        
        sc.close();
    }

    public static void decisao(double nota_final) {
        if((nota_final) > 60) {
            System.out.println("PASS\n");
        }
        else {
            System.out.println("FAILED");
            System.out.print("MISSING " + (60 - nota_final) + " POINTS\n");
        }
    }

}