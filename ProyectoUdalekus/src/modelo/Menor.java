/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

public class Menor extends Persona {

    private String centro;
    private String modelo;
    private String fechaNacimiento;
    private boolean discapacidad;

    private HojaParticipacion hojaParticipacion;
    
    /**
     * @return the centro
     */
    public String getCentro() {
        return centro;
    }

    /**
     * @param centro the centro to set
     */
    public void setCentro(String centro) {
        this.centro = centro;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the fechaNacimiento
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the discapacidad
     */
    public boolean isDiscapacidad() {
        return discapacidad;
    }

    /**
     * @param discapacidad the discapacidad to set
     */
    public void setDiscapacidad(boolean discapacidad) {
        this.discapacidad = discapacidad;
    }

    /**
     * @return the hojaParticipacion
     */
    public HojaParticipacion getHojaParticipacion() {
        return hojaParticipacion;
    }

    /**
     * @param hojaParticipacion the hojaParticipacion to set
     */
    public void setHojaParticipacion(HojaParticipacion hojaParticipacion) {
        this.hojaParticipacion = hojaParticipacion;
    }
    
    
}
