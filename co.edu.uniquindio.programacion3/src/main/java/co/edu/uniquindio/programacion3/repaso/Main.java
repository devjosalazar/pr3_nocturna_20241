package co.edu.uniquindio.programacion3.repaso;

import co.edu.uniquindio.programacion3.repaso.model.Avion;
import co.edu.uniquindio.programacion3.repaso.model.Carro;

public class Main {
    public static void main(String[] args) {


        ejemploHerencia();

    }

    private static void ejemploHerencia() {
        Carro carro = new Carro();
        Avion avion = new Avion();
        carro.encender();
        avion.encender();
        carro.abriendoSistemaVuelo(2);
    }
}