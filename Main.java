import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] strings = new String[10];
        System.out.println("Введите десять строк: ");
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }
    }

}