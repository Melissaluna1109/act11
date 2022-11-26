package FigurasGeometricas;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) throws Exception {
        menu();
    }

    public static void menu () throws Exception {
        Scanner entrada = new Scanner(System.in);
        int figura, propiedad;
        double lado;
        boolean salir = false;
        while (!salir) {
            System.out.println("¡Calcula tu figura geometrica!");
            System.out.println("1. Cuadrado");
            System.out.println("2. Circulo");
            System.out.println("3. Triangulo");
            System.out.println("0. Salir");
            try {
                System.out.print("Escoge una figura: ");
                figura = entrada.nextInt();
                System.out.println();
                if (figura == 0) {
                    salir = true;
                } else if (figura > 0 && figura < 4) {
                    System.out.println("1. Área");
                    System.out.println("2. Perimetro");
                    System.out.print("Escoge una propiedad a calcular: ");
                    propiedad = entrada.nextInt();
                    System.out.println();
                    switch (figura) {
                        case 1:
                            System.out.print("Ingresa la dimensión del lado en cm: ");
                            lado = entrada.nextDouble();
                            Square square = new Square (lado);
                            if (propiedad == 1) {
                                System.out.println("El área del cuadrado es: " + square.getArea() + " cm");
                            } else if (propiedad == 2) {
                                System.out.println("El perimetro del cuadrado es: " + square.getPerimeter() + " cm");
                            }
                            break;
                        case 2:
                            System.out.print("Ingresa la dimensión del radio en cm: ");
                            lado = entrada.nextDouble();
                            Circle circle = new Circle (lado);
                            if (propiedad == 1) {
                                System.out.println("El área del circulo es: " + circle.getArea() + " cm");
                            } else if (propiedad == 2) {
                                System.out.println("El perimetro del circulo es: " + circle.getPerimeter() + " cm");
                            }
                            break;
                        case 3:
                            System.out.print("Ingresa la dimensión de la base en cm: ");
                            lado = entrada.nextDouble();
                            Triangle triangle = new Triangle(lado);
                            if (propiedad == 1) {
                                System.out.println("El área del triangulo es: " + triangle.getArea() + " cm");
                            } else if (propiedad == 2) {
                                System.out.println("El perimetro del triangulo es: " + triangle.getPerimeter() + " cm");
                            }
                            break;
                    }
                    } else {
                    throw new IllegalArgumentException("Opción no valida");
                }
                System.out.println();
            } catch (InputMismatchException e) {
                System.out.println("Debes de teclear un número");
                entrada.next();
                System.out.println();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.println();
            }
        }
    }
}