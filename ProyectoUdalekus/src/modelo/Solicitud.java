/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.util.ArrayList;

public class Solicitud {

    private ArrayList<HojaParticipacion> hojasParticipacion;
    
    private int numero;
    private String fecha;
    private int numeroOrden;
    private String fechaCita;
    private String horaCita;

    
    public Solicitud() {
        hojasParticipacion = new ArrayList<>();
    }
    
    /**
     * @return the hojasParticipacion
     */
    public ArrayList<HojaParticipacion> getHojasParticipacion() {
        return hojasParticipacion;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the numeroOrden
     */
    public int getNumeroOrden() {
        return numeroOrden;
    }

    /**
     * @param numeroOrden the numeroOrden to set
     */
    public void setNumeroOrden(int numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    /**
     * @return the fechaCita
     */
    public String getFechaCita() {
        return fechaCita;
    }

    /**
     * @param fechaCita the fechaCita to set
     */
    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    /**
     * @return the horaCita
     */
    public String getHoraCita() {
        return horaCita;
    }

    /**
     * @param horaCita the horaCita to set
     */
    public void setHoraCita(String horaCita) {
        this.horaCita = horaCita;
    }
    
    
}
