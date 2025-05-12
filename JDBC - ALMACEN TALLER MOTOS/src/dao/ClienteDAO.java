package dao;

import modelo.Cliente;
import util.Conexion;
import java.sql.*;

public class ClienteDAO {

    public void insertar(Cliente c) {
        String sql = "INSERT INTO clientes (nombre, telefono) VALUES (?, ?)";
        try (Connection conn = Conexion.conectar(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, c.getNombre());
            ps.setString(2, c.getTelefono());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}