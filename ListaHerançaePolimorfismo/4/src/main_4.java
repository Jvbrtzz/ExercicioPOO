public class main_4 {
    public static void main(String[] args) {
        Habilidade squirtle_HB = new Habilidade("Barreira D'água", "Recebe menos dano");
        Habilidade charmander_HB = new Habilidade("Sopra Fogo", "Recebe menos dano");

        Habilidade wartortle_HB = new Habilidade("Inunda o ambiente", "Ferir");

        Ataque squirtle_atk1 = new Ataque("Cuspe D'água", "Ferir", 7,4,5);
        Ataque charmander_atk1 = new Ataque("Rabada", "Ferir", 7,4,5);

        pokemon charmander = new pokemon("Charmander","Fogo", charmander_HB);
        pokemon squirtle = new pokemon("Squirtle","Fogo", squirtle_HB);

        Humano lucas = new Humano("Lucas");
        lucas.capturaPokemon(squirtle);

        lucas.treinaPokemon(squirtle);
        lucas.treinaPokemon(squirtle);
        lucas.treinaPokemon(squirtle);

        squirtle.aprendeAtaque(squirtle_atk1);
        charmander.aprendeAtaque(charmander_atk1);

        Evoluçao wartortle = new Evoluçao(squirtle, "Wartortle", "Água", wartortle_HB);

        squirtle.executaAtaque(squirtle_atk1, charmander);
    }
}