public abstract class FormaGeo {
    protected float area;
    protected float perimetro;

    public float getPerimetro() {
        return this.perimetro;
    }

    public float getArea() {
        return this.area;
    }

    public abstract void calcularArea();
    public abstract void calcularPerimetro();
}