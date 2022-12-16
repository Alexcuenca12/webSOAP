/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ws;

/**
 *
 * @author UsuarioF
 */
public class Cliente {

    private String usuario;
    private String password;
    private double saldo;

    public Cliente() {
        super();
    }

    public Cliente(String usuario, String password, double saldo) {
        this.usuario = usuario;
        this.password = password;
        this.saldo = saldo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "usuario=" + usuario + ", password=" + password + ", saldo=" + saldo + '}';
    }
    

}
