package Logica;

import Interfaces.IFuego;

public class Charmander extends Pokemon implements IFuego {
    @Override
    public void atacarPunioTrueno() {
        System.out.println("Soy Charmander y estoy atacando con Puño trueno");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Soy Charmander y estoy atacando con Ascuas");
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("Soy Charmander y estoy atacando con Lanza llamas");
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Soy Charmander y estoy atacando con Placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Soy Charmander y estoy atacante con Arañazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Soy Charmander y estoy atacando con Mordisco");
    }
}
