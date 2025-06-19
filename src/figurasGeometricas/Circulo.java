package figurasGeometricas;

public class Redondo extends Forma {
    public Redondo(double radio) { super(radio); }

    @Override
    public double superficie() { return Math.PI * medida * medida; }

    @Override
    public double borde() { return 2 * Math.PI * medida; }
}