public class Bicicleta implements Carbon{
    private String identificador;
    private int km_percoridos;

    public Bicicleta(String identificador, int km_percoridos){
        this.identificador = identificador;
        this.km_percoridos = km_percoridos;
    }

    @Override
    public float getCarbonFootprint() {
        float q_carbon = 16; 
        q_carbon += 16*km_percoridos; 
        return q_carbon;
    }

    @Override
    public String getIdentificador() {
        return this.identificador;
    }
}