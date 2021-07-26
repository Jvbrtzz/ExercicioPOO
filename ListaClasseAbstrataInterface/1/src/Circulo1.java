public class Circulo1 extends FormaGeo{
    private float raio;

    public Circulo1(int raio){
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        this.area = (float)(3.14*(this.raio*this.raio));
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro = (float)(2*3.14*this.raio);
    }
}