package dao;

import modelo.OrdenServicio;
import util.Conexion;
import java.sql.*;

public class OrdenServicioDAO {

    public void insertar(OrdenServicio o) {
        String sql = "INSERT INTO ordenes_servicio (cliente_id, descripcion, fecha) VALUES (?, ?, ?)";
        try (Connection conn = Conexion.conectar(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, o.getClienteId());
            ps.setString(2, o.getDescripcion());
            ps.setDate(3, new java.sql.Date(o.getFecha().getTime()));
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminar(int id) {
        String sql = "DELETE FROM ordenes_servicio WHERE id = ?";
        try (Connection conn = Conexion.conectar(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}