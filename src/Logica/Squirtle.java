package Logica;

import Interfaces.IAgua;

public class Squirtle extends Pokemon implements IAgua {
    @Override
    public void atacarHidroBomba() {
        System.out.println("Soy Squirtle y estoy atacando con Hidro Bomba");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Soy Squirtle y estoy atacando con Pistola de Agua");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Soy Squirtle y estoy atacando con Burbuja");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Soy Squirtle y estoy atacando con Hidropulso");
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Soy Squirtle y estoy atacando Placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Soy Squirtle y estoy atacando con Arañazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Soy Squirtle y estoy atacando con Mordiso");
    }
}
