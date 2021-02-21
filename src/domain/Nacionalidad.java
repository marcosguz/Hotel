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
public class Nacionalidad {
    
    private Integer idNacionalidad;
    private String tipoNacionalidad;

    public Integer getIdNacionalida() {
        return idNacionalidad;
    }

    public void setIdNacionalida(Integer idNacionalida) {
        this.idNacionalidad = idNacionalida;
    }

    public String getTipoNacionalida() {
        return tipoNacionalidad;
    }

    public void setTipoNacionalida(String tipoNacionalida) {
        this.tipoNacionalidad = tipoNacionalida;
    }

    @Override
    public String toString() {
        return "Nacionalidad: " + "\nidNacionalidad: " + idNacionalidad + "\nTipoNacionalidad: " + tipoNacionalidad;
    }
    
    
}
