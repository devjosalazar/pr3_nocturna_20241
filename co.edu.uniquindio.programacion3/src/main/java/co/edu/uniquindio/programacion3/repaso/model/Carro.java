package co.edu.uniquindio.programacion3.repaso.model;

import co.edu.uniquindio.programacion3.repaso.services.ICarroVolador;

public class Carro extends Vehiculo implements ICarroVolador {


    @Override
    public void encender() {
        System.out.println("Empujando el carro");
    }

    @Override
    public void abriendoSistemaVuelo(int motor) {
        System.out.println("Iniciar mototes:"+ motor);
    }
}
