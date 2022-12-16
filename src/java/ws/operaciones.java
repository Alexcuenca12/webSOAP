/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package ws;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author UsuarioF
 */
@WebService(serviceName = "operaciones")
public class operaciones {

    public static ArrayList<Cliente> usuarios = new ArrayList();

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Login")
    public boolean Login(@WebParam(name = "Usuario") String Usuario, @WebParam(name = "Password") String Password) {
        //TODO write your implementation code here:
        for (int i = 0; i < usuarios.size(); i++) {
            if (Usuario.equals(usuarios.get(i).getUsuario()) && Password.equals(usuarios.get(i).getPassword())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "registro")
    public boolean registro(@WebParam(name = "Usuario") String Usuario, @WebParam(name = "Contra") String Contra, @WebParam(name = "RepContra") String RepContra, @WebParam(name = "Saldo") double Saldo) {
        Cliente cliente = new Cliente(Usuario, Contra, Saldo);
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getUsuario().equals(Usuario)) {
                return false;
            }
        }
        if (Contra.equals(RepContra)) {
            usuarios.add(cliente);
            return true;
        }
        return false;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "deposito")
    public boolean deposito(@WebParam(name = "Usuario") String Usuario, @WebParam(name = "deposito") double deposito
    ) {
        //TODO write your implementation code here:
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getUsuario().equals(Usuario)) {
                double depo = usuarios.get(i).getSaldo() + deposito;
                usuarios.get(i).setSaldo(depo);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "retiro")
    public boolean retiro(@WebParam(name = "Usuario") String Usuario, @WebParam(name = "retiro") double retiro
    ) {
        //TODO write your implementation code here:
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getUsuario().equals(Usuario)) {
                if (usuarios.get(i).getSaldo() > retiro) {
                    double depo = usuarios.get(i).getSaldo() - retiro;
                    usuarios.get(i).setSaldo(depo);
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return false;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "devolverSaldo")
    public Double devolverSaldo(@WebParam(name = "Usuario") String Usuario
    ) {
        //TODO write your implementation code here:
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getUsuario().equals(Usuario)) {
                return usuarios.get(i).getSaldo();
            }
        }
        return null;
    }

}
