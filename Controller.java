
// import java.text.CollationElementIterator;
// import java.util.ArrayList;
// import java.util.Collection;
import java.io.ObjectOutputStream.PutField;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Controller {
    Random rnd = new Random();
    static Scanner sc = new Scanner(System.in);
    static Queue<Toys> prizeList = new LinkedList<>();
    static PriorityQueue<Toys> que = new PriorityQueue<>();

    public static int StartProgram() {
        int menu = View.ShowMenu();
        return menu;
    }

    public static int SelectMenu(int menu) {
        switch (menu) {
            case 1:
                // Добавить игрушку
                System.out.print("\nВыберите тип игрушки, которую хотите добавить: ");
                byte start = 1;
                byte end = 3;
                // Преобразуем введеную строку к числу
                int typeToys = ValidationInput(View.SelectedRobot(), start, end);

                switch (typeToys) {
                    case 1:
                        que.add(new Robot());
                        SelectMenu(View.ShowMenu());
                        return 1;
                    case 2:
                        que.add(new Constructor());
                        SelectMenu(View.ShowMenu());
                        return 2;
                    case 3:
                        que.add(new Boadr_game());
                        SelectMenu(View.ShowMenu());
                        return 3;
                }
                SelectMenu(View.ShowMenu());
                return 1;

            case 2:
                // Добавить игрушку с заданием вручную шанса игрушки попасть в розыгрыш
                System.out.print("\nВыберите тип игрушки, которую хотите добавить: ");
                start = 1;
                end = 3;
                // Фнкция проверки валидности введнных данных
                typeToys = ValidationInput(View.SelectedRobot(), start, end);
                switch (typeToys) {
                    case 1:
                        start = 1;
                        end = 100;
                        System.out.print("Задайте цифрами от 1 до 100 шанс игрушки попасть в розыгрыш: ");
                        typeToys = ValidationInput(sc.nextLine(), start, end);
                        if (typeToys > 1) {
                            que.add(new Robot(typeToys));
                            SelectMenu(View.ShowMenu());
                        }
                        SelectMenu(View.ShowMenu());
                        return 1;
                    case 2:
                        start = 1;
                        end = 100;
                        System.out.print("Задайте цифрами от 1 до 100 шанс игрушки попасть в розыгрыш: ");
                        typeToys = ValidationInput(sc.nextLine(), start, end);
                        if (typeToys > 1) {
                            que.add(new Constructor(typeToys));
                            SelectMenu(View.ShowMenu());
                        }
                        SelectMenu(View.ShowMenu());

                        return 2;
                    case 3:
                        start = 1;
                        end = 100;
                        System.out.print("Задайте цифрами от 1 до 100 шанс игрушки попасть в розыгрыш: ");
                        typeToys = ValidationInput(sc.nextLine(), start, end);
                        if (typeToys > 1) {
                            que.add(new Boadr_game(typeToys));
                            SelectMenu(View.ShowMenu());
                        }
                        SelectMenu(View.ShowMenu());
                        return 3;
                }
                SelectMenu(View.ShowMenu());
                return 2;
            case 3:
                // Показать весь массив игрушек
                System.out.println("QUE");
                for (Object toys : que) {
                    System.out.println(toys);
                }
                SelectMenu(View.ShowMenu());
                return 3;
            case 4:
                System.out.println("Победила игрушка: " + que.peek());
                prizeList.add(que.peek());
                que.remove(que.peek());
                SelectMenu(View.ShowMenu());
                return 4;
            case 5:
                System.out.println("Массив призовых игрушек: ");
                for (Toys prize : prizeList) {
                    System.out.println(prize);
                    SelectMenu(View.ShowMenu());
                }
            case 6:
                break;
        }
        return menu;
    }

    // **Функиция принимает строку и диапазон [start :end] и проверяет, что введно
    // число из этого диапазона */
    public static int ValidationInput(String input, byte start, byte end) {
        int userInt = -1;

        try {
            userInt = Integer.parseInt(input);
            if (userInt != (int) userInt || userInt > end || userInt < start)
                throw new Exception();
        } catch (Exception e) {
            System.out.println(
                    "\nВводить можно только цифры из диапазона меню!" + " от " + start + " до " + end
                            + "\nПовторите ввод!\n");
        }
        return userInt;
    }
}
