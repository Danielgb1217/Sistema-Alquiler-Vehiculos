package modelo;

public interface VehiculoAble {

    public abstract void alquilar();

    public abstract void devolver(int kmFinal);

    public abstract double calcularAlquiler(int km);

    public abstract String mostrarDatos();
}
