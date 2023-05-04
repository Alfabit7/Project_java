import java.text.BreakIterator;
import java.util.Scanner;
import java.lang.Exception;

public class View {

    public static int ShowMenu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "\n1- Добавить игрушку\n2- Добавить игрушку с заданием вручную  шанса игрушки попасть в розыгрыш\n3- Показать массив игрушек\n4- Провести розыгрыш игрушки\n5- Показать массив призовых игрушек\n6 -Выход из программы\n");

            System.out.print("Выберите пункт меню: ");
            // userInput = sc.nextLine();
            // int userInt = Integer.parseInt(userInput);
            int userInt = Controller.ValidationInput(sc.nextLine(), 1, 6);
            switch (userInt) {
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                    break;
            }
            return userInt;

            // System.out.println("\nВведите значения от 1 до 7! Буквы вводить нельзя!\n");

        }
    }

    public static String SelectedRobot() {
        Scanner sc = new Scanner(System.in);
        String userInput;
        System.out.println("\n1- Robot\n2- Constructor\n3- Boadr Game\n ");
        System.out.print("Выберите пункт меню: ");
        userInput = sc.nextLine();
        return userInput;
    }

}
