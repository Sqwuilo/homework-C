import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numPeople = scanner.nextInt();
        int numApple = scanner.nextInt();

        ApllePeoplle(numPeople, numApple);
    }

    public static void ApllePeoplle(int a, int b){
        System.out.println(b / a);
    }
}