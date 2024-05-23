package CapaDeAplicaciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import CapaDeDominio.*;
import Vistas.*;
import Procesos.*;
import CapaDeInfraestructura.*;
import formato.*;
import java.time.Instant;
import java.util.Date;

public class ControladorProductos implements ActionListener {
    FrmProductos vista;
    CRUD_Productos crud;
    Productos prod;

    public ControladorProductos(FrmProductos f2) {
        vista = f2;
        vista.btnRegistrar.addActionListener(this);
        vista.btnConsultarProducto.addActionListener(this);
        vista.btnEliminarProducto.addActionListener(this); // Agregar este listener
        ProcesosFrmProductos.Presentacion(vista);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnRegistrar) {
            Productos prod = ProcesosFrmProductos.LeerProducto(vista);
            CRUD_Productos crud = new CRUD_Productos();
            crud.InsertarProducto(prod);
            ProcesosFrmProductos.LimpiarEntradas(vista);
        } else if (e.getSource() == vista.btnConsultarProducto) {
            int idprod = Mensajes.M2("Ingrese el ID del producto a buscar..");
            crud = new CRUD_Productos();
            prod = crud.ConsultarProducto(idprod);
            if (prod == null) {
                Mensajes.M1("El id " + idprod + " no existe en la tabla");
            } else {
                vista.txtIdProducto.setText(prod.getIdprod());
                vista.jtxtNombreProducto.setText(prod.getNomprod());
                vista.jtxtCantidadProducto.setText(prod.getCantprod());
                vista.jtxtPrecio.setText(prod.getPrecio());
                vista.jcbxCategoria.setSelectedItem(prod.getIdcat());
                vista.jdchFechaVencimiento.setDate(prod.getFechaven());
                vista.jspnStock.setValue(prod.getStock());
            }
        } else if (e.getSource() == vista.btnEliminarProducto) {
            int respuesta = Mensajes.M3("Confirmar!!", "¿Desea eliminar el registro?");
            if (respuesta == 0) {
                int idprod = Integer.parseInt(vista.txtIdProducto.getText());
                crud = new CRUD_Productos();
                crud.EliminarProducto(idprod);
                
            }
        }
    }
}