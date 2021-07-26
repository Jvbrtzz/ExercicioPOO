public class Assalariado extends Funcionarios{

    public Assalariado(float salario_base) {
        this.salario_base = salario_base;
        this.salario = this.salario();
    }

    @Override
    public float salario() {
        this.salario = this.salario_base;
        return this.salario;
    }
}