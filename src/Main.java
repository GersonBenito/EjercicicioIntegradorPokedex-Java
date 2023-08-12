import Logica.Bulbasaur;
import Logica.Charmander;
import Logica.Pikachu;
import Logica.Squirtle;

public class Main {
    public static void main(String[] args) {
        // pikachu
        Pikachu pikachu = new Pikachu();
        pikachu.atacarAraniazo();
        pikachu.atacarImpacTrueno();

        // bulbasaur
        Bulbasaur bulbasaur = new Bulbasaur();
        bulbasaur.atacarAraniazo();
        bulbasaur.atacarHojaAfilada();

        // Charmander
        Charmander charmander = new Charmander();
        charmander.atacarAscuas();
        charmander.atacarMordisco();

        // Squirtle
        Squirtle squirtle = new Squirtle();
        squirtle.atacarPlacaje();
        squirtle.atacarBurbuja();
    }
}