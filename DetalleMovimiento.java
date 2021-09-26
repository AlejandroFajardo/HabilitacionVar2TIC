package HabilitacionVar2TIC;

public class DetalleMovimiento {
    
    private int dia;
    private int mes;
    private int year;
    private int tipoMovimiento;
    private double saldoMovido;
    private String cuentaInteraccion;

    public DetalleMovimiento(int dia, int mes, int year, int tipoMovimiento, double saldoMovido, String cuentaInteraccion) {
        this.dia = dia;
        this.mes = mes;
        this.year = year;
        this.tipoMovimiento = tipoMovimiento;
        this.saldoMovido = saldoMovido;
        this.cuentaInteraccion = cuentaInteraccion;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getYear() {
        return year;
    }

    public int getTipoMovimiento() {
        return tipoMovimiento;
    }

    public double getSaldoMovido() {
        return saldoMovido;
    }

    public String getCuentaInteraccion() {
        return cuentaInteraccion;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setTipoMovimiento(int tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public void setSaldoMovido(double saldoMovido) {
        this.saldoMovido = saldoMovido;
    }

    public void setCuentaInteraccion(String cuentaInteraccion) {
        this.cuentaInteraccion = cuentaInteraccion;
    }
}
