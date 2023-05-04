
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
    // static Collection toysQueue = new PriorityQueue<>();
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
                        // listToys.add(new Robot());
                        que.add(new Robot());
                        SelectMenu(View.ShowMenu());
                        return 1;
                    case 2:
                        // listToys.add(new Constructor());
                        que.add(new Constructor());
                        SelectMenu(View.ShowMenu());
                        return 2;
                    case 3:
                        // listToys.add(new Boadr_game());
                        que.add(new Boadr_game());
                        SelectMenu(View.ShowMenu());
                        return 3;

                }
                return 1;
            case 2:
                // Удалить игрушку
                System.out.print("Введите номер (индекс) игрушки: ");
                // listToys.remove(sc.nextInt());
                SelectMenu(View.ShowMenu());
                return 2;
            case 3:
                // Показать информацию о игрушке
                System.out.println();
                System.out.print("Информация о игрушке введите индекс: ");
                // System.out.println(listToys.get(sc.nextInt()));
                System.out.println();
                SelectMenu(View.ShowMenu());
                return 3;
            case 4:
                // Показать весь массив игрушек
                // System.out.println("ARRAY");
                // for (Object toys : listToys) {
                // System.out.println(toys);
                // }

                System.out.println("QUE");
                for (Object toys : que) {
                    System.out.println(toys);
                }
                SelectMenu(View.ShowMenu());
                return 4;
            case 5:
                System.out.println("Победила игрушка: " + que.peek());
                prizeList.add(que.peek());
                que.remove(que.peek());
                SelectMenu(View.ShowMenu());
            case 6:
                System.out.println("Массив призовых игрушек: ");
                for (Toys prize : prizeList) {
                    System.out.println(prize);
                    SelectMenu(View.ShowMenu());
                }

        }
        return menu;
    }

}
