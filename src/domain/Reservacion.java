/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;

/**
 *
 * @author Marcos
 */
public class Reservacion {
    
    private Integer idReservacion;
    private String fechaIngreso;
    private String fechaSalida;
    private Integer cantidaPersonas;
    private TipoHabitacion tipoHabitacion;
    private Cliente cliente;  

    public Integer getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(Integer idReservacion) {
        this.idReservacion = idReservacion;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Integer getCantidaPersonas() {
        return cantidaPersonas;
    }

    public void setCantidaPersonas(Integer cantidaPersonas) {
        this.cantidaPersonas = cantidaPersonas;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Reservacion: " + "\nidReservacion: " + idReservacion + "\nFechaIngreso: " + fechaIngreso + "\nFechaSalida: " + fechaSalida + "\nCantidaPersonas: " + cantidaPersonas + "\nTipoHabitacion: " + tipoHabitacion + "\nCliente: " + cliente;
    }
    
    
}
