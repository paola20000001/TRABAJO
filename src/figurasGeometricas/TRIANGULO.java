package figurasGeometricas;

public class Triangulo extends Figura {
    public Triangulo(double valor1) { super(valor1); }
    
    @Override
    public double getArea() { return (valor1 * valor1 * Math.sqrt(3)) / 4; }
    
    @Override
    public double getPerimetro() { return valor1 * 3; }
}
