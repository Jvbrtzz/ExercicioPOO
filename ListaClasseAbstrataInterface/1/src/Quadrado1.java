public class Quadrado1 extends Retangulo1{
    public Quadrado1(float altura) {
        super(altura);
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        this.area = this.altura*this.altura;
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro = this.altura*4;
    }
}