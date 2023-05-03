import java.util.Comparator;
import java.util.PriorityQueue;

public class Robot1 {
    private int weight;

    public Robot() {
        weight = (int) (Math.random() * 61) + 20; // генерируем случайное значение от 20 до 80
    }

    public int getWeight() {
        return weight;
    }

    public static void addToPriorityQueue(PriorityQueue<Robot> queue, Robot robot) {
        queue.add(robot);
    }

    public static Robot[] getSortedArray(PriorityQueue<Robot> queue) {
        Robot[] robots = new Robot[queue.size()];
        int i = 0;
        while (!queue.isEmpty()) {
            robots[i] = queue.poll();
            i++;
        }
        // Создаем Comparator для сортировки по убыванию
        Comparator<Robot> comparator = Comparator.comparingInt(Robot::getWeight).reversed();
        // Сортируем массив с помощью Comparator
        Arrays.sort(robots, comparator);
        return robots;
    }

    public static void main(String[] args) {
        PriorityQueue<Robot> queue = new PriorityQueue<>(Comparator.comparingInt(Robot::getWeight).reversed());
        for (int i = 0; i < 10; i++) {
            Robot robot = new Robot();
            addToPriorityQueue(queue, robot);
        }
        Robot[] sortedArray = getSortedArray(queue);
        System.out.println("Массив в порядке убывания удельного веса:");
        for (Robot robot : sortedArray) {
            System.out.println(robot.getWeight());
        }
    }
}