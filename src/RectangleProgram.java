import java.util.Scanner;

public class RectangleProgram {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width: ");
        width = sc.nextInt();

        System.out.println("Enter height: ");
        height = sc.nextInt();
        float area = width * height;
        System.out.println("Area: " + area);
    }
}

