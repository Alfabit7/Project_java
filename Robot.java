import java.util.UUID;

public class Robot extends Toys {
    static int num = 0;

    public Robot() {
        this.name = "Robot_id_" + (++num);
    }

    public static Robot CreateRobot() {
        return new Robot();
    }
}
