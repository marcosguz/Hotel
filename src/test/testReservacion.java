/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.*;

/**
 *
 * @author Marcos
 */
public class testReservacion {
    public static void main(String[] args) {
        
        Reservacion reservacion = new Reservacion();
        reservacion.setIdReservacion(7895642);
        reservacion.setFechaIngreso("12/10/2020");
        reservacion.setFechaSalida("20/10/2020");
        reservacion.setCantidaPersonas(1);
        reservacion.setTipoHabitacion(obtnerTipoHabitacionBDD());
        reservacion.setCliente(obtenerClienteBDD());
        
        System.out.println("reservacion = " + reservacion.toString());
        
    }
    
    public static Cliente obtenerClienteBDD(){
        Cliente cliente = new Cliente();
        cliente.setIdCliente(1000);
        cliente.setNombre("Marcos");
        cliente.setApellido("Guzmán");
        cliente.setDireccion("Cochapamba Sur");
        cliente.setEmail("marcosguzzz@gmail.com");
        cliente.setGenero(obtenerGeneroBDD());
        cliente.setNacionalidad(obtenerNacionalidadBDD());
        cliente.setEstadoCivil(obtenerEstadoCivilBDD());
        return cliente;
    }
    
    public static Genero obtenerGeneroBDD(){
        Genero genero = new Genero();
        genero.setIdGenero(0);
        genero.setNombreGenero("Masculino");
        return genero;
    }
    
    public static Nacionalidad obtenerNacionalidadBDD(){
        Nacionalidad nacionalidad = new Nacionalidad();
        nacionalidad.setIdNacionalida(47801);
        nacionalidad.setTipoNacionalida("Ecuador");
        return nacionalidad;
    }
    
    public static EstadoCivil obtenerEstadoCivilBDD(){
        EstadoCivil estadoCivil = new EstadoCivil();
        estadoCivil.setIdEstadoCivil(1245678);
        estadoCivil.setTipoEstadoCivil("Soltero");
        return estadoCivil;
    }
    
    
    public static TipoHabitacion obtnerTipoHabitacionBDD(){
        TipoHabitacion tipoHabitacion = new TipoHabitacion();
        tipoHabitacion.setIdTipoHabitacion(1478965);
        tipoHabitacion.setEstado(true);
        tipoHabitacion.setDescripcion("Habitacion con vista panorámica 270°, frente al mar");
        tipoHabitacion.setNombreHabitacion("Suit");
        return tipoHabitacion;
    }
    
    public static Habitacion obtnerHabitacionBDD(){
        Habitacion habitacion = new Habitacion();
        habitacion.setIdHabitacion(10);
        habitacion.setCaracteristicas("Suit de lujo");
        habitacion.setPrecio(1500.00);
        return habitacion;
    }
    
}
