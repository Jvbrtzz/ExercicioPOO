public class Main {
    public static void main(String[] args) throws Exception {
        Quadrado novoQuadrado = new Quadrado();
        retangulo novRetangulo =  new retangulo();
        Triangulo novoTriangulo =  new Triangulo();
        Circulo novoCirculo = new Circulo();
        System.out.println("\n");
        System.out.println("Quadrado");
        System.out.println("------------------------------------------------------------");
        novoQuadrado.construtor();
        novoQuadrado.imprimir();
        System.out.println("\n");
        System.out.println("Retangulo");
        System.out.println("------------------------------------------------------------");
        novRetangulo.construtor();
        novRetangulo.imprimir();
        System.out.println("\n");
        System.out.println("Triangulo");
        System.out.println("------------------------------------------------------------");
        novoTriangulo.construtor();
        novoTriangulo.imprimir();
        System.out.println("\n");
        System.out.println("Circulo");
        System.out.println("------------------------------------------------------------");
        novoCirculo.construtor();
        novoCirculo.imprimir();
    }
}
