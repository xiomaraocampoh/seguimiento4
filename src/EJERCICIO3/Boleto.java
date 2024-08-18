package EJERCICIO3;

public class Boleto {
    private Cliente cliente;
    private Viaje viaje;
    private Asiento asiento;

    public Boleto(Cliente cliente, Viaje viaje, Asiento asiento) {
        this.cliente = cliente;
        this.viaje = viaje;
        this.asiento = asiento;
        cliente.agregarBoleto(this);
    }
    public Cliente obtenerCliente(){
        return cliente;
    }
    public Viaje obtenerViaje() {
        return viaje;
    }

    public Asiento obtenerAsiento() {
        return asiento;
    }
}


