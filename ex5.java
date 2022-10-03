import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Digite a medida em metros: ");
        int metros = console.nextInt();

        int cm = metros * 100;

        System.out.print(metros + " metros é igual a " + cm + " centímetros.");

        console.close();

    }
}
