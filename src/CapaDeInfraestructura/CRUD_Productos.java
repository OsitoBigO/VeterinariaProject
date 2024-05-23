package CapaDeInfraestructura;
//librerias
import CapaDeDominio.*;
import formato.*;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CRUD_Productos extends ConectarBD{
    public CRUD_Productos(){}
    //metodo que inserta un registro a la base de datos
    public void InsertarProducto(Productos prod){
        try{
         ps = conexion.prepareStatement("insert into"
  + " productos(nombreproducto,idcategoria,cantidadproducto,preciounidad,"
  + "fechavencimiento,stock,indicador) values (?,?,?,?,?,?,'S');");
          ps.setString(1,prod.getNomprod());
          
          ps.setInt(2,prod.getIdcat());
          ps.setString(3,prod.getCantprod());
          ps.setString(4,prod.getPrecio());
          SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
          ps.setString(5,sdf.format(prod.getFechaven()));
          ps.setInt(6,prod.getStock());
          ps.executeUpdate();
          Mensajes.M1("Producto registrado correctamente");
          conexion.close();
        }catch(Exception ex){
            Mensajes.M1("ERROR no se puede puede insertar el producto..."+ex);
        }
    }//fin del metodo   
    public Productos ConsultarProducto(int idprod) {
    Productos prod = null;
    try {
        rs = st.executeQuery("select idproducto, nombreproducto, cantidadproducto, preciounidad, fechavencimiento, stock "
                           + "from productos where indicador='S' and idproducto=" + idprod + ";");
        if (rs.next()) {
            prod = new Productos();
            prod.setIdprod(rs.getString(1));
            prod.setNomprod(rs.getString(2));
            prod.setCantprod(rs.getString(3));
            prod.setPrecio(rs.getString(4));
            prod.setFechaven(rs.getDate(5));
            prod.setStock(rs.getInt(6));
        }
    } catch (Exception ex) {
        Mensajes.M1("ERROR no se puede consultar el producto.." + ex);
    }
    return prod;
}
    
    //metodo que lista los datos del producto en un JTable
    public void MostrarProductosEnTabla(JTable tabla,String consulta){
        String titulos[]={"Nro","ID producto","Nombre Producto","Categoria","Cantidad",
                          "Precio","Vencimiento","Stock"};
        DefaultTableModel modelo =  new DefaultTableModel(null,titulos);
        tabla.setModel(modelo);
        int cantreg=0;
        try{
            rs =  st.executeQuery(consulta);
            while(rs.next()){
                cantreg++;
                Productos prod =  new Productos();
                prod.setIdprod(rs.getString(1));
                prod.setNomprod(rs.getString(2));
                prod.setIdcat(rs.getInt(3));
                prod.setCantprod(rs.getString(4));
                prod.setPrecio(rs.getString(5));
                prod.setFechaven(rs.getDate(6));
                prod.setStock(rs.getInt(7));
                modelo.addRow(prod.Registro(cantreg));
            }
            conexion.close();
        }catch(Exception ex){
            Mensajes.M1("ERROR no se puede mostrar los productos..."+ex);
        }
    }
    public void EliminarProducto(int idprod) {
    try {
        ps = conexion.prepareStatement("UPDATE productos SET indicador='N' WHERE idproducto=?");
        ps.setInt(1, idprod);
        ps.executeUpdate();
        Mensajes.M1("Producto eliminado correctamente");
        conexion.close();
    } catch (Exception ex) {
        Mensajes.M1("ERROR no se puede eliminar el producto... " + ex);
    }
}

}//FIN DE LA CLASE