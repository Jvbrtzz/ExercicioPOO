public class Comissionado  extends Funcionarios{


    public Comissionado(int vendas) {
        this.vendas = vendas;
        this.salario = this.salario();
    }

    @Override
    public float salario() {
        this.salario = this.vendas*5; //5 reais para cada venda
        return this.salario;
    }
}