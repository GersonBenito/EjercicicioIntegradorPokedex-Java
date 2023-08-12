package Logica;

import Interfaces.IElectrico;

public class Pikachu extends Pokemon implements IElectrico {
    @Override
    public void atacarImpacTrueno() {
        System.out.println("Soy Pikachu y estoy atacando con Trueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Soy Pikachu y estoy atacando con Puño trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Soy Pikachu y estoy atacando con Rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Soy Pikachu y estoy atacando con Rayo carga");
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Soy Pikachu y estoy atacando con Placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Soy Pikachu y estoy atacando con Arañazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Soy Pikachu y estoy atacando con Mordisco");
    }
}
