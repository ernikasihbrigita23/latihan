package driver;

import java.util.Scanner;

import model.Circle;
import model.Rectangle;
import model.Shape;
import model.Triangle;

public class driver1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis bentuk (0: Lingkaran, 1: Persegi Panjang, 2: Segitiga): ");
        int choice = scanner.nextInt();

        double area = 0;

        switch (choice) {
            case 0:
                Circle circle = new Circle(5);
                area = calculateArea(circle);
                break;
            case 1:
                Rectangle rectangle = new Rectangle(4, 6);
                area = calculateArea(rectangle);
                break;
            case 2:
                // Membuat objek segitiga dengan alas 3 dan tinggi 4
                Triangle triangle = new Triangle(3, 4); 
                area = calculateArea(triangle);
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                break;
        }

        if (area != 0) {
            System.out.println("Luas: " + area);
        }

        scanner.close();
    }

    private static double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}
