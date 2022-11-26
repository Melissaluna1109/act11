package FigurasGeometricas;

public class Square implements Shape{

    protected double lado;

    public Square (double lado) {
        this.lado = lado;
    }

    public void setLado_Square (double lado) {
        this.lado = lado;
    }

    public double getLado_Square () {
        return lado;
    }

    @Override
    public double getArea() {
        return (lado * lado);
    }

    @Override
    public double getPerimeter() {
        return (lado * 4);
    }
}