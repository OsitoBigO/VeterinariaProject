package Principal;
//libreria
import Vistas.*;
import CapaDeAplicaciones.*;

public class Main {
        public static LoginAdmin LA;
    public static ControladorLogin ControladorLogin;
    public static Categorias f1;
    public static ControladorCategorias controlfcat;
    public static FrmClientes f4;
    public static ControladorClientes controlf4;
    public static FormularioMenu fm;
    public static ControladorMenu controlfm;
    
     public static void main(String[] args) {
      LA = new LoginAdmin();
       fm = new FormularioMenu();
       ControladorLogin = new ControladorLogin(LA, fm);
     }
       public static void FormularioMenu() {
    fm = new FormularioMenu();
   controlfm = new ControladorMenu(fm);

       }
}