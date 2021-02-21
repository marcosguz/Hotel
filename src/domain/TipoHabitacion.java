/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Marcos
 */
public class TipoHabitacion {
    
    private Integer idTipoHabitacion;
    private Boolean estado;
    private String nombreHabitacion;
    private String descripcion;

    public Integer getIdTipoHabitacion() {
        return idTipoHabitacion;
    }

    public void setIdTipoHabitacion(Integer idTipoHabitacion) {
        this.idTipoHabitacion = idTipoHabitacion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getNombreHabitacion() {
        return nombreHabitacion;
    }

    public void setNombreHabitacion(String nombreHabitacion) {
        this.nombreHabitacion = nombreHabitacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "TipoHabitacion: " + "\nidTipoHabitacion: " + idTipoHabitacion + " \nEstado: " + estado + "\nNombreHabitacion: " + nombreHabitacion + "\nDescripcion: " + descripcion;
    }
    
    
}
