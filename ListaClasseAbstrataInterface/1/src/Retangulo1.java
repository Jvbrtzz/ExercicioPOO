public class Retangulo1 extends FormaGeo{
    protected float altura;
    private float largura;

    public Retangulo1(float altura, float largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public Retangulo1(float altura) {
    }

    @Override
    public void calcularArea() {
        this.area = this.altura*this.largura;
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro = (this.altura*2)+(this.largura*2);
    }
}