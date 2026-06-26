package org.hilos;

import org.model.Recordatorio;

import java.time.Duration;
import java.time.LocalDateTime;

public class AlarmaRecordatorio implements  Runnable{

    private Recordatorio  recordatorio;

    public AlarmaRecordatorio(Recordatorio recordatorio){
        this.recordatorio = recordatorio;
    }

    @Override
    public void run() {

        long tiempoEspera = Duration.between(
                LocalDateTime.now(),
                recordatorio.getHora()
        ).toMillis();

        if(tiempoEspera > 0){
            try {
                Thread.sleep(tiempoEspera);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
                System.out.println("la alarma fue interrumpida.");
                return;
            }
        }
        recordatorio.activarAlarma();
    }
}
