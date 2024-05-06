package entities;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double imposto;

    public double SalarioLiquido() {
        return (salarioBruto - imposto);
    }

    public void AumentoSalario(double porcentagem, double salarioliq) {
        salarioBruto =  salarioliq + (salarioBruto * (porcentagem / 100));
    }

}
