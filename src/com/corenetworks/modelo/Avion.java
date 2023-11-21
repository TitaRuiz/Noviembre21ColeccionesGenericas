package com.corenetworks.modelo;

import java.util.ArrayList;
import java.util.List;

public class Avion {
    public final int numeroAsientosEjecutiva = 8;
    public final int numeroAsientosTurista = 42;
    private List<Asiento> claseEjecutiva;
    private List<Asiento> claseTurista;

    //toString Constructor vacio y getters


    @Override
    public String toString() {
        return "Avion{" +
                "claseEjecutiva=" + claseEjecutiva +
                ", claseTurista=" + claseTurista +
                '}';
    }

    public Avion() {
        //Programar
        int numAsiento = 1;
        claseEjecutiva = new ArrayList<>();
        claseTurista = new ArrayList<>();

        for (int i = 0; i < 8 / 2; i++) {
            for (Ubicacion elemento :
                    Ubicacion.values()) {
                if (elemento.ordinal() % 2 == 0) {
                    claseEjecutiva.add(new Asiento(ClasePasaje.EJECUTIVA, numAsiento, elemento));
                    numAsiento++;
                }
            }
        }
        for (int i = 0; i < 42/3; i++) {
            for (Ubicacion elemento :
                    Ubicacion.values()) {
                claseTurista.add(new Asiento(ClasePasaje.TURISTA, numAsiento, elemento));
                numAsiento++;
            }
        }
        System.out.println(claseEjecutiva.size());
        System.out.println(claseEjecutiva);
        System.out.println(claseTurista.size());
        System.out.println(claseTurista);
    }

    public List<Asiento> getClaseEjecutiva() {
        return claseEjecutiva;
    }

    public List<Asiento> getClaseTurista() {
        return claseTurista;
    }
}
