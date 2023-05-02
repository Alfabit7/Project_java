import java.util.Random;

import javax.sound.midi.Soundbank;

public abstract class Toys {
    static short id = 0;
    String name;
    byte quanity;
    byte scpecificGravity;
    Random rnd = new Random();

    public Toys() {
        this.id = ++this.id;
        this.name = "Defaul_name_id_" + this.id;
        this.quanity = (byte) rnd.nextInt(50);
        this.scpecificGravity = (byte) rnd.nextInt(100);
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
