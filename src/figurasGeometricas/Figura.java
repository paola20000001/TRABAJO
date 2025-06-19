package figurasGeometricas;

public abstract class Figura {
    protected double valor1;
    
    public Figura(double valor1) {
        if (valor1 <= 0) {
            throw new RuntimeException("Valor inválido: " + valor1);
        }
        this.valor1 = valor1;
    }
    
    public double getValor1() { return valor1; }
    public abstract double getArea();
    public abstract double getPerimetro();
}
