import java.util.Random;
import java.util.UUID;

public abstract class Toys {
    String id;
    String name;
    byte quanity;
    byte scpecificGravity;
    Random rnd = new Random();

    public Toys() {
        this.id = UUID.randomUUID().toString();
        this.name = "Defaul_name_id_" + this.id;
        this.quanity = (byte) rnd.nextInt(50);
        this.scpecificGravity = (byte) (rnd.nextInt(80) + 20);
    }

    @Override
    public String toString() {
        String info = "id: " +
                this.id + " name: " +
                this.name + " quanity:" +
                this.quanity + " scpecificGravity: " +
                this.scpecificGravity;
        return info;
    }

}
