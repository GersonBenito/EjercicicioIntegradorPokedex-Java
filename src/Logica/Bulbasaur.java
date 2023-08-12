package Logica;

import Interfaces.IPlanta;

public class Bulbasaur extends Pokemon implements IPlanta {
    @Override
    public void atacarPlacaje(){
        System.out.println("Soy Bulbasaur y estoy atacando Placaje");
    }
    @Override
    public void atacarAraniazo(){
        System.out.println("Soy Bulbasaur y estoy atacando Arañazo");
    }
    @Override
    public void atacarMordisco(){
        System.out.println("Soy Bulbasaur y estoy atacando Mordisco");
    }
    @Override
    public void atacarParalizar(){
        System.out.println("Soy Bulbasaur y estoy atacando Paralizar");
    }
    @Override
    public void atacarDrenaje(){
        System.out.println("Soy Bulbasaur y estoy atacando Drenaje");
    }
    @Override
    public void atacarHojaAfilada(){
        System.out.println("Soy Bulbasaur y estoy atacando Hoja afilada");
    }
    @Override
    public void atacarLatigoCepal(){
        System.out.println("Soy Bulbasaur y estoy atacando Latigo Cepal");
    }
}
