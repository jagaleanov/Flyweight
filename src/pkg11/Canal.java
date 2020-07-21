/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11;

/**
 *
 * @author jgale
 */
public class Canal implements Espectro {

    private String name;
    private int upFrecuencia;
    private int lowFrecuency;

    public Canal(String name) {
        this.name = name;
    }

    public void setUpFrecuencia(int upFrecuencia) {
        this.upFrecuencia = upFrecuencia;
    }

    public void setLowFrecuency(int lowFrecuency) {
        this.lowFrecuency = lowFrecuency;
    }

    public int getUpFrecuencia() {
        return upFrecuencia;
    }

    public int getLowFrecuency() {
        return lowFrecuency;
    }

    @Override
    public void asignar() {
        System.out.println("Canal: [Nombre : " + name + ", Frecuencia máxima : " + upFrecuencia + ", Frecuencia mínima :" + lowFrecuency);
    }
}
