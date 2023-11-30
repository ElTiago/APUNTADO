package BaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class gestor_base {
    public static void main(String[] args) {
        // Configuración de la conexión
        String url = "jdbc:mysql://localhost:3306/bdcartas";
        String usuario = "Santiago";
        String contraseña = "hola123";

        // Datos del nuevo jugador
        String nombre = "NuevoJugador";
        String contraseñaJugador = "nuevaContraseña";
        int edad = 25;
        int fichas = 30;

        // Consulta SQL para insertar un nuevo jugador
        String consulta = "INSERT INTO jugador (nombre, contraseña, edad, fichas) VALUES (?, ?, ?, ?)";

        try {
            // Establecer la conexión
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);

            // Preparar la consulta
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setString(1, nombre);
            statement.setString(2, contraseñaJugador);
            statement.setInt(3, edad);
            statement.setInt(4, fichas);

            // Ejecutar la consulta de inserción
            int filasAfectadas = statement.executeUpdate();

            // Verificar si la inserción fue exitosa
            if (filasAfectadas > 0) {
                System.out.println("Se ha insertado el nuevo jugador correctamente.");
            } else {
                System.out.println("No se pudo insertar el nuevo jugador.");
            }

            // Cerrar recursos
            statement.close();
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
