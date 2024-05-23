package CapaDeAplicaciones;
//librerias
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import CapaDeDominio.*;
import Vistas.*;
import Procesos.*;
import CapaDeInfraestructura.*;
import formato.Mensajes;
import java.time.Instant;
import java.util.Date;
public class ControladorCita implements ActionListener{       
        FrmCitas vista;
        CRUD_Citas crud;
        RegistroCitas cit;
    public ControladorCita(FrmCitas f5){        
        vista=f5;
        vista.btnConsultarCita.addActionListener(this);
        vista.btnRegistrar.addActionListener(this);
        vista.btnEliminarCita.addActionListener(this);
        ProcesosFrmCitas.Presentacion(vista);
    }
    @Override
    public void actionPerformed(ActionEvent e) {        
       if(e.getSource()==vista.btnRegistrar){
              RegistroCitas cit =  ProcesosFrmCitas.LeerCita(vista);
              CRUD_Citas crud = new CRUD_Citas();
              crud.InsertarCita(cit);
              ProcesosFrmCitas.LimpiarEntradas(vista);
       }
       if (e.getSource() == vista.btnConsultarCita) {
            int idcita = Mensajes.M2("Ingrese el ID de la cita a buscar..");
            crud = new CRUD_Citas();
            cit = crud.ConsultarCita(idcita);
            if (cit == null) {
                Mensajes.M1("El id " + idcita + " no existe en la tabla");
            } else {
                vista.txtIdCita.setText(cit.getIdcita());
                vista.jtxtdetalleperro.setText(cit.getDetalleperro());
                vista.jcbxdnicli.setSelectedItem(cit.getIdcli());
                vista.jcbxveterinario.setSelectedItem(cit.getIdvet());
                vista.jtxtPrecio.setText(cit.getPreciocita());
                vista.jdchFechaReservacion.setDate(cit.getFechareg());
                vista.jdchFechaProgramada.setDate(cit.getFechapro());
            }
        } else if (e.getSource() == vista.btnEliminarCita) {
            int respuesta = Mensajes.M3("Confirmar!!", "¿Desea eliminar el registro?");
            if (respuesta == 0) {
                int idprod = Integer.parseInt(vista.txtIdCita.getText());
                crud = new CRUD_Citas();
                crud.EliminarCita(idprod);
                
            }
        }
}
    }