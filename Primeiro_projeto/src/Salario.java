public class Salario {
    String nome;
    double salarioBruto;
    double taxa;

    public double salarioLiquido() {
        return salarioBruto - taxa;
    }

    public double aumentoSalario(double porcentagem) {
        return salarioBruto += salarioBruto * porcentagem / 100.0;
    }

    public String toString() {
        return nome + ", $ " + String.format("%.2f", salarioLiquido());
    }

}
