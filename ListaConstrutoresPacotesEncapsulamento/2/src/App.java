import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        Aluno novoAluno = new Aluno("João", 19);
        Inscricao novaInscricao = new Inscricao("João", 40);
        Disciplina novDisciplina = new Disciplina();
        imprimir(novoAluno);
        imprimirInsc(novaInscricao);
        System.out.println("Histórico.");
        novoAluno.setHistorico("historico");
        
        System.out.println("-----------------------------------------------------------");
        System.out.println("Média.");
        Professor mediaTurma = new Professor();
        mediaAluno(mediaTurma);
        System.out.println("-----------------------------------------------------------");
        InscDisciplina(novDisciplina);



    }
    static void imprimir(Aluno novo){
        System.out.println("Nome:" +novo.getNome());
        System.out.println("idade:" +novo.getIdade());
    }
    static void imprimirInsc(Inscricao novo){
        System.out.println("carga horária semanal:" +novo.getHoraririo() + "horas");
    }
    
    
    static void InscDisciplina(Disciplina novo){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ementa discipina: (1) matemática (2) Portugues (3) fisica (4) Quimica");
        System.out.println("Qual disciplina: ");
        int getDisciplica = teclado.nextInt();
        if(getDisciplica == 1){
            System.out.println("Matemácia");
            System.out.println("Números naturais, inteiros, racionais e reais. Progressão aritmética e geométrica. Produtos notáveis fatoração e equação do segundo grau. Resolução de equações e inequações.Trigonometria no triângulo retângulo. Noção de função real. Função afim. ");
        }if(getDisciplica == 2){
            System.out.println("Portugues");
            System.out.println("Linguagem, língua e fala. O signo linguístico: significado e significante; aarbitrariedade do signo. O conceito de valor. A dupla articulação das línguas. Relações sintagmáticas e correlações paradigmáticas. Os pontos de vista sincrônico e diacrônico. Línguaem sociedade: fatores de preservação, de variação e de mudança lingüística. Teoria daVariação: pressupostos teóricos e metodologia de pesquisa. Os desenvolvimentos atuais dosestudos linguísticos. ");
        }if(getDisciplica == 3){
            System.out.println("Fisica");
            System.out.println("Medidas. Vetores. Cinemática da partícula. Força e leis de Newton. Dinâmica da partícula. Trabalho, energia e conservação da energia. Sistema de partículas. Colisões. Cinemática e dinâmica de rotação. Momento angular.");
        }if(getDisciplica == 4){
            System.out.println("Quimica");
            System.out.println("Química na resolução de problemas industriais, por meio de pesquisas e estudos ligados à composição química, às propriedades fundamentais e à composição da estrutura das substâncias; fabricar produtos e subprodutos químicos; realizar análises químicas ou físico-químicas.");
        }else{
            System.out.println("Disciplina não existente");
        }
    
    
    
    
    
    
    
    }

    static void mediaAluno(Professor novo){
        final int NUMERO_ALUNOS = 5;
        Scanner teclado = new Scanner(System.in);
        float[] notas = new float[NUMERO_ALUNOS];
        float media = 0;

        
            
    for (int i = 0; i < NUMERO_ALUNOS; i++) {
            System.out.print("Informe a nota: ");
            notas[i] = teclado.nextFloat();
            media += notas[i];
            }
            media /= NUMERO_ALUNOS;
            for (int  i = 0; i < NUMERO_ALUNOS; i++) {
            if (notas[i] > media)
            System.out.println("Media " + media);
    }
				
		
	}
    }



     