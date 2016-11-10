package practicaParcial2.Calls;

import java.time.LocalDateTime;

/**
 * Created by arimi on 09-Nov-16.
 */
public class Call {
    /*Una llamada conoce la fecha y hora en que se originó, el número origen y el número de destino y la duración de la misma.
     El número tiene un código de país, de área y un número particular.
     Las llamadas puede ser internacionales, larga distancia y locales.
     Son internacionales cuando tienen distinto código de país, larga distancia cuando el código de país es igual pero varía el código de área y locales las restantes.
     Los usuarios de una compañía telefónica tienen siempre una línea de teléfono.
     a) Se desea conocer las llamadas realizadas entre un par de fechas.
     b) Se tiene un tarifador que sabe calcular el costo de las llamadas. El costo es $1 el minuto de las internacionales, $0.5 el minuto de las larga distancia y $0.1 las locales.
     Calcular el consumo realizado entre un par de fechas.
     */

    private LocalDateTime originT;
    private PhoneNumber originN;
    private PhoneNumber destinyN;
    private Integer duration;

    public LocalDateTime getOriginT() {
        return originT;
    }

    public PhoneNumber getOriginN() {
        return originN;
    }

    public PhoneNumber getDestinyN() {
        return destinyN;
    }

    public Integer getDuration() {
        return duration;
    }
}
