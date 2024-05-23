package CapaDeAplicaciones;
import javax.swing.JMenuItem;
import Vistas.FormularioMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import Vistas.FormularioMenu;
import CapaDeInfraestructura.CRUD_Login;
import formato.Mensajes;
import CapaDeDominio.Login;
import Principal.Main;
import Vistas.LoginAdmin;

public class ControladorLogin implements ActionListener {

    private LoginAdmin vista;
    private CRUD_Login crud;
    private FormularioMenu formaMenu;

    public ControladorLogin(LoginAdmin vista, FormularioMenu formaMenu) {
        this.vista = vista;
        this.vista.Ingresar.addActionListener(this);
        this.formaMenu = formaMenu;
        crud = new CRUD_Login();
        this.vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.Ingresar) {
            String usuario = vista.LUsuario.getText();
            String contraseña = new String(vista.LContraseña.getPassword());
            String categoria = vista.LCategoria.getSelectedItem().toString();

            Login login = new Login();
            login.setUsuario(usuario);
            login.setContraseña(contraseña);

            boolean validado = false;


              if (categoria.equals("EMPLEADOS")) {
                validado = crud.validarCredencialesAdministrador(login);
            }

            if (validado) {
                Mensajes.M1("Inicio de Sesión Exitoso");
                Main.FormularioMenu();

                // Deshabilitar o habilitar los JMenuItems según el tipo de usuario
                if (categoria.equals("EMPLEADOS")) {
                    formaMenu.mitemRegistroCliente.setEnabled(true);
                    formaMenu.mitemRegistroCita.setEnabled(true);
                    formaMenu.mitemlistacita.setEnabled(true);
                    formaMenu.itemcatprod.setEnabled(true);
                    formaMenu.itemprod.setEnabled(true);
                    formaMenu.mitemlistacita.setEnabled(true);
                }

                vista.dispose(); // Cerrar el formulario de inicio de sesión
            } else {
                Mensajes.M1("Intenta de Nuevo Datos Incorrectos");
            }
        }
    }
}
