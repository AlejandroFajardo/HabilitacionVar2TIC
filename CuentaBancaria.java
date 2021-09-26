package HabilitacionVar2TIC;

import java.util.ArrayList;

public class CuentaBancaria {

    private String IDCuenta;
    private String IDCliente;
    private String nombreCliente;
    private double saldo;
    private ArrayList<DetalleMovimiento> movimientos;

    public CuentaBancaria(String IDCuenta, String IDCliente, String nombreCliente) {
        this.IDCuenta = IDCuenta;
        this.IDCliente = IDCliente;
        this.nombreCliente = nombreCliente;
        this.saldo = 0;
        this.movimientos = new ArrayList<>();
    }

    public void retirar(DetalleMovimiento detalleMovimiento) {
        if (saldo >= detalleMovimiento.getSaldoMovido()) {
            saldo -= detalleMovimiento.getSaldoMovido();
            movimientos.add(detalleMovimiento);
        }
    }

    public void depositar(DetalleMovimiento detalleMovimiento) {
        saldo += detalleMovimiento.getSaldoMovido();
        movimientos.add(detalleMovimiento);
    }

    public boolean sePuedeTransferir(double cantidad) {
        return saldo >= cantidad;
    }

    public void transferir(DetalleMovimiento detalleMovimiento) {
        saldo -= detalleMovimiento.getSaldoMovido();
        movimientos.add(detalleMovimiento);
    }

    public void recibirTransferencia(DetalleMovimiento detalleMovimiento) {
        saldo += detalleMovimiento.getSaldoMovido();
        movimientos.add(detalleMovimiento);
    }

    public void agregarDetalle(DetalleMovimiento detalleMovimiento) {
        movimientos.add(detalleMovimiento);
    }

    public String getIDCuenta() {
        return IDCuenta;
    }

    public String getIDCliente() {
        return IDCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public ArrayList<DetalleMovimiento> getMovimientos() {
        return movimientos;
    }

    public void setIDCuenta(String IDCuenta) {
        this.IDCuenta = IDCuenta;
    }

    public void setIDCliente(String IDCliente) {
        this.IDCliente = IDCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setMovimientos(ArrayList<DetalleMovimiento> movimientos) {
        this.movimientos = movimientos;
    }
}
