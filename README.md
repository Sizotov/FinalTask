____
___Импортирую библиотеку:___

`import java.util.Scanner;
`
____
___Точка входа в программу:___

* `public class Main {`
    *    `public static void main(String[] args)`
____
___Создаю массив из 10 строк:___

```
String [] strings = new String[10];
```
____
___Прошу ввести строки с клавиатуры:___

```
Scanner scanner = new Scanner(System.in);
System.out.println("Введите десять строк: ");
for (int i = 0; i < strings.length; i++) {
    strings[i] = scanner.nextLine();
```
____
___Создание нового массива с длиной строк <= 3 символов:___

```
String [] newStrings = new String[strings.length];
int newIndex = 0;
for (int i = 0; i < strings.length; i++) {
    if (strings[i].length() <= 3){
        newStrings[newIndex] = strings[i];
        newIndex++;
       }
   }
```
____
___Вывод нового массива на экран:___

```
 System.out.println("Массив строк, длина которых <= 3 символам: ");
 for (int i = 0; i < newIndex; i++) {
     System.out.println(newStrings[i]);
 }
```
____
___Спасибо за внимание!___





