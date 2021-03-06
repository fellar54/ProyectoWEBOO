/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Date;

/**
 *
 * @author Sebastian
 */
public class CompraDTO {

    private int idCarro;
    private int estado;
    private Date fechaCreacion;
    private Date fechaFinalizacion;

    public CompraDTO(int idCarro, int estado, Date fechaCreacion, Date fechaFinalizacion) {
        this.idCarro = idCarro;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    @Override
    public String toString() {
        return "CompraDTO{" + "idCarro=" + idCarro + ", estado=" + estado + ", fechaCreacion=" + fechaCreacion + ", fechaFinalizacion=" + fechaFinalizacion + '}';
    }
}
