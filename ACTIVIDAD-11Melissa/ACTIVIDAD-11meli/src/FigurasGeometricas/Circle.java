package FigurasGeometricas;

public class Circle implements Shape{

    public static final double num_pi = 3.1416;
    protected double radio;

    public Circle (double radio) {
        this.radio = radio;
    }

    public void setRadio_Circle (double radio) {
        this.radio = radio;
    }

    public double getRadio_Circle () {
        return radio;
    }

    @Override
    public double getArea() {
        return (num_pi * (radio * radio));
    }

    @Override
    public double getPerimeter() {
        return (num_pi * (radio * 2));
    }
}