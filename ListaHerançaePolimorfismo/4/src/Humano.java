import java.util.ArrayList;

public class Humano {
    private String nome;
    private ArrayList<pokemon> pokemons_obtidos = new ArrayList<>();

    public Humano(String nome){
        this.nome = nome;
    }
    public void capturaPokemon(pokemon pokemon){
        pokemons_obtidos.add(pokemon);
    }

    public void treinaPokemon(pokemon pokemon){
        if (pokemons_obtidos.contains(pokemon)){
            pokemon.nivel+=1;
            pokemon.HP+=1;
            pokemon.Atk+=1;
            pokemon.SP_Atk+=1;
            pokemon.Def+=1;
            pokemon.SP_Def+=1;
            pokemon.speed+=1;
        }
    }
}   