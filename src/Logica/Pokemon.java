package Logica;

public abstract class Pokemon {

    protected int numPokedex;
    protected String nombrePokemon;
    protected String pesoPokemon;
    protected String genero;
    protected String temporada;
    protected String tipo;

    protected Pokemon(){

    }

    protected Pokemon(int numPokedex, String nombrePokemon, String pesoPokemon,
                      String genero, String temporada, String tipo
    ){
        this.numPokedex = numPokedex;
        this.nombrePokemon = nombrePokemon;
        this.pesoPokemon = pesoPokemon;
        this.genero = genero;
        this.temporada = temporada;
        this.tipo = tipo;
    }

    public abstract void atacarPlacaje();
    public abstract void atacarAraniazo();
    public abstract void atacarMordisco();

}
