package figurasGeometricas;

public class Cubo2D extends Forma {
    public Cubo2D(double lado) { super(lado); }

    @Override
    public double superficie() { return medida * medida; }

    @Override
    public double borde() { return medida * 4; }
}