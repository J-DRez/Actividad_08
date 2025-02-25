package transporte;

abstract class Vehiculo {

    protected int velocidadMaxima;
    protected boolean encendido;

    protected Vehiculo(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    protected int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    protected void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public void arrancar() {
        System.out.println("El vehículo está en marcha.");
    }

    protected abstract void describir();
}
