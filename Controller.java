
// import java.text.CollationElementIterator;
// import java.util.ArrayList;
// import java.util.Collection;
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
                int typeToys = View.SelectedRobot();
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
                return 1;
            case 2:
                // Добавить игрушку с заданием вручную шанса игрушки попасть в розыгрыш
                int userInput;
                System.out.print("\nВыберите тип игрушки, которую хотите добавить: ");
                typeToys = View.SelectedRobot();
                switch (typeToys) {
                    case 1:
                        System.out.print("Задайте цифрами от 1 до 100 шанс игрушки попасть в розыгрыш: ");
                        userInput = sc.nextInt();
                        que.add(new Robot(userInput));
                        SelectMenu(View.ShowMenu());
                        return 1;
                    case 2:
                        System.out.print("Задайте цифрами от 1 до 100 шанс игрушки попасть в розыгрыш: ");
                        userInput = sc.nextInt();
                        que.add(new Constructor(userInput));
                        SelectMenu(View.ShowMenu());

                        return 2;
                    case 3:
                        System.out.print("Задайте цифрами от 1 до 100 шанс игрушки попасть в розыгрыш: ");
                        userInput = sc.nextInt();
                        que.add(new Boadr_game(userInput));
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

}
