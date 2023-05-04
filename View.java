import java.text.BreakIterator;
import java.util.Scanner;

public class View {

    public static int ShowMenu() {
        Scanner sc = new Scanner(System.in);
        int userInput;
        while (true) {
            System.out.println(
                    "\n1- Добавить игрушку\n2- Добавить игрушку с заданием вручную  шанса игрушки попасть в розыгрыш\n3- Показать массив игрушек\n4- Провести розыгрыш игрушки\n5- Показать массив призовых игрушек\n6 -Выход из программы\n");

            System.out.print("Выберите пункт меню: ");
            userInput = sc.nextInt();

            // if (userInput > 0 && userInput < 5) {
            // return userInput;
            // }
            switch (userInput) {
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
            return userInput;

        }
    }

    public static int SelectedRobot() {
        Scanner sc = new Scanner(System.in);
        int userInput;
        System.out.println("\n1- Robot\n2- Constructor\n3- Boadr Game\n ");
        System.out.print("Выберите пункт меню: ");
        userInput = sc.nextInt();
        return userInput;

    }

}
