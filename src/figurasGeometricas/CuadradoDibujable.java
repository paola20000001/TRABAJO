package figurasGeometricas;
import java.awt.*;

public class CuadradoDibujable extends Cuadrado implements figuraDibujable {
    int x, y;
    
    public CuadradoDibujable(double valor1, int x, int y) {
        super(valor1);
        this.x = x;
        this.y = y;
    }
    
    @Override
    public void dibujar2D(Graphics g) {
        g.drawRect(x, y, (int)valor1, (int)valor1);
    }
}
