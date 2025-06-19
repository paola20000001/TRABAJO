package figurasGeometricas;

public abstract class Forma {
    protected double medida;

    public Forma(double medida) {
        if (medida <= 0) {
            throw new RuntimeException("Medida inválida: " + medida);
        }
        this.medida = medida;
    }

    public double getMedida() { return medida; }
    public abstract double superficie();
    public abstract double borde();
}