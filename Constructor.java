public class Constructor extends Toys {
    static int num = 0;

    public Constructor() {
        this.name = "Constructor_id_" + (++num);
    }

    public static Constructor CreateConstructor() {
        return new Constructor();
    }
}
