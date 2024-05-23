package CapaDeInfraestructura;

import formato.Mensajes;
import CapaDeDominio.Login;

public class CRUD_Login extends ConectarBD {

    public CRUD_Login() {
        super();
    }


    public boolean validarCredencialesAdministrador(Login login) {
        try {
            String query = "SELECT * FROM loginadmin WHERE usuario = ? AND contraseña = ?";
            ps = conexion.prepareStatement(query);
            ps.setString(1, login.getUsuario());
            ps.setString(2, login.getContraseña());
            rs = ps.executeQuery();
            return rs.next(); // Si hay algún registro, las credenciales son válidas
        } catch (Exception ex) {
            Mensajes.M1("Error al validar las credenciales del administrador: " + ex);
        }
        return false;
    }
}




