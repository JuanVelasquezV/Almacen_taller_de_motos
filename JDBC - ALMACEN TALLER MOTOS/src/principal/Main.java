package principal;

import modelo.Cliente;
import modelo.Producto;
import modelo.OrdenServicio;
import dao.ClienteDAO;
import dao.ProductoDAO;
import dao.OrdenServicioDAO;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ClienteDAO clienteDAO = new ClienteDAO();
        Cliente cliente = new Cliente(0, "Pedro Pérez", "3001234567");
        clienteDAO.insertar(cliente);

        ProductoDAO productoDAO = new ProductoDAO();
        Producto producto = new Producto(0, "Aceite 10W40", 35000, 10);
        productoDAO.insertar(producto);

        OrdenServicioDAO ordenDAO = new OrdenServicioDAO();
        OrdenServicio orden = new OrdenServicio(0, 1, "Cambio de aceite", new Date());
        ordenDAO.insertar(orden);

        System.out.println("Datos insertados correctamente.");
    }
}