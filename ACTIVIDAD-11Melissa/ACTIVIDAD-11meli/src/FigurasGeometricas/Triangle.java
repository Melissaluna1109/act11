package FigurasGeometricas;
import java.lang.Math;

public class Triangle implements Shape {
    private double lado, altura;

    public Triangle (double lado) { this.lado = lado; this.altura = CalcularAltura ();}

    public void setLado_Triangle (double lado) { this.lado = lado; this.altura = CalcularAltura ();}

    public double getLado_Triangle () { return altura; }

    public double getAltura_Triangle () { return altura; }

    @Override
    public double getArea() { return (( lado * altura) / 2); }

    @Override
    public double getPerimeter() { return (lado * 3); }

    private double CalcularAltura () { return (Math.sqrt(3.0) * this.lado) / 2.0; }
}