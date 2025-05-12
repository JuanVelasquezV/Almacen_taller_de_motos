package modelo;

import java.util.Date;

public class OrdenServicio {
    private int id;
    private int clienteId;
    private String descripcion;
    private Date fecha;

    public OrdenServicio(int id, int clienteId, String descripcion, Date fecha) {
        this.id = id;
        this.clienteId = clienteId;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getClienteId() { return clienteId; }
    public void setClienteId(int clienteId) { this.clienteId = clienteId; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }
}