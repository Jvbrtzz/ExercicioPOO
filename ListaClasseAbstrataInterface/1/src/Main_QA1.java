public class Main_QA1{
    public static void main(String[] args) {
        System.out.println("\nCirculo:");
        Circulo1 c1 = new Circulo1(6);
        c1.calcularArea();
        System.out.println("Área: "+c1.getArea());
        c1.calcularPerimetro();
        System.out.println("Perímetro: "+c1.getPerimetro());

        System.out.println("\nRetângulo:");
        Retangulo1 r1 = new Retangulo1(2, 5);
        r1.calcularArea();
        System.out.println("Área: "+r1.getArea());
        r1.calcularPerimetro();
        System.out.println("Perímetro: "+r1.getPerimetro());

        System.out.println("\nQuadrado:");
        Quadrado1 q1 = new Quadrado1(5);
        q1.calcularArea();
        System.out.println("Área: "+q1.getArea());
        q1.calcularPerimetro();
        System.out.println("Perímetro: "+q1.getPerimetro());

        System.out.println("\nTriângulo:");
        Triangulo1 t1 = new Triangulo1(6,7,6);
        t1.calcularArea();
        System.out.println("Área: "+t1.getArea());
        t1.calcularPerimetro();
        System.out.println("Perímetro: "+t1.getPerimetro());
    }
}