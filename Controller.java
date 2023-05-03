import java.util.ArrayList;
import java.util.Collection;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;

public class Controller {
    Random rnd = new Random();
    static Scanner sc = new Scanner(System.in);
    // static Collection toysQueue = new PriorityQueue<>();
    static ArrayList listToys = new ArrayList<>();

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
                        listToys.add(new Robot());
                        SelectMenu(View.ShowMenu());
                        return 1;
                    case 2:
                        listToys.add(new Constructor());
                        SelectMenu(View.ShowMenu());
                        return 2;
                    case 3:
                        listToys.add(new Boadr_game());
                        SelectMenu(View.ShowMenu());
                        return 3;

                }
                return 1;
            case 2:
                // Удалить игрушку
                System.out.print("Введите номер (индекс) игрушки: ");
                listToys.remove(sc.nextInt());
                SelectMenu(View.ShowMenu());
                return 2;
            case 3:
                // Показать информацию о игрушке
                System.out.println();
                System.out.print("Информация о игрушке введите индекс: ");
                System.out.println(listToys.get(sc.nextInt()));
                System.out.println();
                SelectMenu(View.ShowMenu());
                return 3;
            case 4:
                // Показать весь массив игрушек
                for (Object toys : listToys) {
                    System.out.println(toys);
                }
                SelectMenu(View.ShowMenu());
                return 4;
            case 5:
                break;
        }
        return menu;
    }

}
