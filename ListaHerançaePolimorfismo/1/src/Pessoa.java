public class Pessoa {
    protected String nome;
    protected int idade;
    protected String pai;
    protected String mae;

    public void arvoreGenelogica(String nome, int idade, String pai, String mae){
        this.nome = nome;
        this.idade = idade;
        this.pai = pai;
        this.mae = mae;
    
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Pai: " + this.pai);
        System.out.println("Mãe: " + this.mae);
        
    }
}
