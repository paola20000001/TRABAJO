package figurasGeometricas;
import java.awt.*;

public class TrianguloDibujable extends Triangulo implements figuraDibujable {
    int x, y;
    
    public TrianguloDibujable(double valor1, int x, int y) {
        super(valor1);
        this.x = x;
        this.y = y;
    }
    
    @Override
    public void dibujar2D(Graphics g) {
        int lado = (int)valor1;
        int altura = (int)(lado * Math.sqrt(3) / 2);
        
        int[] xp = {x + lado/2, x, x + lado};
        int[] yp = {y, y + altura, y + altura};
        
        g.drawPolygon(xp, yp, 3);
    }
}
