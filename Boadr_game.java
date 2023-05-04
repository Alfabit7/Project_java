public class Boadr_game extends Toys {
    static int num = 0;

    public Boadr_game(int userInput) {
        this.name = "BoadrGame_id_" + (++num);
        this.scpecificGravity = userInput;
    }

    public Boadr_game() {
        this.name = "BoadrGame_id_" + (++num);
    }

    public static Boadr_game CreateBoadrGame() {
        return new Boadr_game();
    }
}
