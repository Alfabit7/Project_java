import java.text.BreakIterator;
import java.util.Scanner;

public class View {

    public static int ShowMenu() {
        int userInput;
        while (true) {
            System.out.println(
                    "1 - Добавить игрушку\n 2- Удалить игрушку 3- Показать информацию о игрушке\n 4- Показать массив игрушек\n 5 -Выход из программы\n");
            Scanner sc = new Scanner(System.in);
            System.out.println("Выберите пункт меню: ");
            userInput = sc.nextInt();
            if (userInput == 5) {
                break;
            }
        }

        return userInput;
    }

}
