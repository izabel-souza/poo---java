import java.util.Scanner;
import java.util.Locale;
import entities.Funcionario;

public class App {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario func = new Funcionario();
        
        System.out.printf("Nome: ");
        func.nome = sc.nextLine();
        System.out.printf("Salario bruto: ");
        func.salarioBruto = sc.nextDouble();
        System.out.printf("Imposto: ");
        func.imposto = sc.nextDouble();

        double salarioLiq = func.SalarioLiquido();

        System.out.println("Funcionario: " + func.nome + " \n$ " + salarioLiq + "\n");

        System.out.println("Porcentagem: ");
        double porcent = sc.nextDouble();

        func.AumentoSalario(porcent, salarioLiq);

        System.out.println("\nSalario apos aumento: " + func.salarioBruto);

        sc.close();
    }
}
