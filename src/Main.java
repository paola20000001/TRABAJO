import figurasGeometricas.*;
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {
    static CirculoDibujable circulo;
    static CuadradoDibujable cuadrado;
    static TrianguloDibujable triangulo;
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        try {
            System.out.print("Radio círculo: ");
            circulo = new CirculoDibujable(leerNumero(s), 50, 50);
            
            System.out.print("Lado cuadrado: ");
            cuadrado = new CuadradoDibujable(leerNumero(s), 200, 50);
            
            System.out.print("Lado triángulo: ");
            triangulo = new TrianguloDibujable(leerNumero(s), 350, 50);
            
            mostrarInfo();
            crearVentana();
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        s.close();
    }
    
    static double leerNumero(Scanner s) {
        try {
            double n = s.nextDouble();
            if (n <= 0) throw new RuntimeException("Debe ser positivo");
            return n;
        } catch (Exception e) {
            throw new RuntimeException("Número inválido");
        }
    }
    
    static void mostrarInfo() {
        System.out.println("Círculo - Área: " + circulo.getArea() + " Perímetro: " + circulo.getPerimetro());
        System.out.println("Cuadrado - Área: " + cuadrado.getArea() + " Perímetro: " + cuadrado.getPerimetro());
        System.out.println("Triángulo - Área: " + triangulo.getArea() + " Perímetro: " + triangulo.getPerimetro());
    }
    
    static void crearVentana() {
        JFrame frame = new JFrame("Figuras");
        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                circulo.dibujar2D(g);
                cuadrado.dibujar2D(g);
                triangulo.dibujar2D(g);
            }
        };
        panel.setPreferredSize(new Dimension(500, 300));
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
