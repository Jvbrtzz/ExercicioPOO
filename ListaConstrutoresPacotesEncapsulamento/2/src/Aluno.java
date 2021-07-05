import java.util.Scanner;
import java.util.Vector;

public class Aluno {
    private String historico;
    private String nome;
    private int idade;

public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade= idade;
    }
    public String getNome() {
        return this.nome;
    

    } 
    public int getIdade() {
        return this.idade;
    

    } 

public void setHistorico(String historico){
    Vector materias = new Vector();
    Vector nota = new Vector();
    Scanner teclado =  new Scanner(System.in);
    System.out.println("Quantidade de matérias: ");
    int n = teclado.nextInt();
    for(int i = 0; i < n; i++){
        System.out.println("Digite a materia:");
        String mat = teclado.next();
        materias.add(mat);
    
    
    }
    for(int i1 = 0; i1 < n; i1++){
        System.out.println("Notas respectivas: ");
        double not = teclado.nextDouble();
        nota.add(not);

    
    }
    System.out.println("Materias : " + materias);
    System.out.println("Notas : " + nota);
}

}