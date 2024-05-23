/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaDeDominio;

import java.util.Date;
import CapaDeInfraestructura.*;
public class RegistroCitas {
    private String idcita;
    private String detalleperro;
    private int idcli;
    private int idvet;
    private String preciocita;
    private Date fechareg;
    private Date fechapro;
    private String ind;
    public RegistroCitas(){}
        public Object[] Registro(int num){
        AdministrarClaves ac1= new AdministrarClaves();
        String nombrevet=ac1.RecuperarNombre(ac1.consultanomvet, getIdvet());
        AdministrarClaves ac2= new AdministrarClaves();
        String nombrecli=ac2.RecuperarNombre(ac2.consultadnicli, getIdcli());
        Object[] fila={num, idcita, detalleperro, nombrevet,nombrecli , preciocita, fechareg, fechapro};
        return fila;
    }

    

    public String getDetalleperro() {
        return detalleperro;
    }

    public void setDetalleperro(String detalleperro) {
        this.detalleperro = detalleperro;
    }

    public int getIdcli() {
        return idcli;
    }

    public void setIdcli(int idcli) {
        this.idcli = idcli;
    }

    public int getIdvet() {
        return idvet;
    }

    public void setIdvet(int idvet) {
        this.idvet = idvet;
    }

    public String getPreciocita() {
        return preciocita;
    }

    public void setPreciocita(String preciocita) {
        this.preciocita = preciocita;
    }

    public Date getFechareg() {
        return fechareg;
    }

    public void setFechareg(Date fechareg) {
        this.fechareg = fechareg;
    }

    public Date getFechapro() {
        return fechapro;
    }

    public void setFechapro(Date fechapro) {
        this.fechapro = fechapro;
    }

    public String getInd() {
        return ind;
    }

    public void setInd(String ind) {
        this.ind = ind;
    }

    public String getIdcita() {
        return idcita;
    }

    public void setIdcita(String idcita) {
        this.idcita = idcita;
    }

    
    
}
