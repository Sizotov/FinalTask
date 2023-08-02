import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] strings = new String[10];
        System.out.println("Введите десять строк: ");
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }
        String [] newStrings = new String[strings.length];
        int newIndex = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() <= 3){
                newStrings[newIndex] = strings[i];
                newIndex++;
            }
        }
        System.out.println("Массив строк, длина которых <= 3 символам: ");
        for (int i = 0; i < newIndex; i++) {
            System.out.println(newStrings[i]);
        }
    }
}
