package HabilitacionVar2TIC;

import java.util.ArrayList;

public class Banco {
    
    private ArrayList<CuentaBancaria> cuentasBancarias;

    public Banco() {
        this.cuentasBancarias = new ArrayList<>();
    }
    
    public void agregarCuentaBancaria(String IDCuenta, String IDCliente, String nombre){
        cuentasBancarias.add(new CuentaBancaria(IDCuenta, IDCliente, nombre));
    }
    
    public void eliminarCuentaBancaria(String IDCuenta){
        CuentaBancaria aux = null;
        for (CuentaBancaria cuentaBancaria : cuentasBancarias) {
            if (cuentaBancaria.getIDCuenta().equals(IDCuenta)) {
                aux = cuentaBancaria;
            }
        }
        cuentasBancarias.remove(aux);
    }
    
    public void retirar(String IDCuenta, DetalleMovimiento detalleMovimiento){
        for (CuentaBancaria cuentaBancaria : cuentasBancarias) {
            if (cuentaBancaria.getIDCuenta().equals(IDCuenta)) {
                cuentaBancaria.retirar(detalleMovimiento);
            }
        }
    }
    
    public void transferir(String IDCuenta1, String IDCuenta2, DetalleMovimiento detalleMovimiento1, DetalleMovimiento detalleMovimiento2){
        boolean aux = false;
        for (CuentaBancaria cuentaBancaria : cuentasBancarias) {
            if (cuentaBancaria.getIDCuenta().equals(IDCuenta1)) {
                aux = cuentaBancaria.sePuedeTransferir(detalleMovimiento1.getSaldoMovido());
                if (aux) {
                    cuentaBancaria.transferir(detalleMovimiento1);
                }
            }
            if (cuentaBancaria.getIDCuenta().equals(IDCuenta2)) {
                if (aux) {
                    cuentaBancaria.recibirTransferencia(detalleMovimiento2);
                }
            }
        }
    }
    
    public void depositar(String IDCuenta, DetalleMovimiento detalleMovimiento){
        for (CuentaBancaria cuentaBancaria : cuentasBancarias) {
            if (cuentaBancaria.getIDCuenta().equals(IDCuenta)) {
                cuentaBancaria.depositar(detalleMovimiento);
            }
        }
    }
    
    private double promedio(){
        double aux = 0;
        for (CuentaBancaria cuentaBancaria : cuentasBancarias) {
            aux += cuentaBancaria.getSaldo();
        }
        return aux/cuentasBancarias.size();
    }
    
    public double promedioCuadradoSaldos(){
        return Math.pow(promedio(), 2);
    }
    
    public double varianzaSaldos(){
        double v = 0;
        double prom = promedio();
        double sum = 0;
        for (CuentaBancaria cuentaBancaria : cuentasBancarias) {
            sum += Math.pow((cuentaBancaria.getSaldo() - prom), 2);
        }
        v = (sum/cuentasBancarias.size());
        return v; 
   }

    public ArrayList<CuentaBancaria> getCuentasBancarias() {
        return cuentasBancarias;
    }

    public void setCuentasBancarias(ArrayList<CuentaBancaria> cuentasBancarias) {
        this.cuentasBancarias = cuentasBancarias;
    }
}
