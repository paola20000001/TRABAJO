import figurasGeometricas.*;
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class App {
    static RedondoPintable r;
    static Cubo2DPintable c;
    static TresLadosPintable t;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            System.out.print("Radio: ");
            r = new RedondoPintable(pedirNumero(s), 50, 50);

            System.out.print("Lado cuadrado: ");
            c = new Cubo2DPintable(pedirNumero(s), 200, 50);

            System.out.print("Lado triángulo: ");
            t = new TresLadosPintable(pedirNumero(s), 350, 50);

            info();
            ventana();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        s.close();
    }

    static double pedirNumero(Scanner s) {
        try {
            double n = s.nextDouble();
            if (n <= 0) throw new RuntimeException("Debe ser positivo");
            return n;
        } catch (Exception e) {
            throw new RuntimeException("Número inválido");
        }
    }

    static void info() {
        System.out.println("Círculo - Área: " + r.superficie() + " Perímetro: " + r.borde());
        System.out.println("Cuadrado - Área: " + c.superficie() + " Perímetro: " + c.borde());
        System.out.println("Triángulo - Área: " + t.superficie() + " Perímetro: " + t.borde());
    }

    static void ventana() {
        JFrame f = new JFrame("Formas");
        JPanel p = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                r.pintar(g);
                c.pintar(g);
                t.pintar(g);
            }
        };
        p.setPreferredSize(new Dimension(500, 300));
        f.add(p);
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}