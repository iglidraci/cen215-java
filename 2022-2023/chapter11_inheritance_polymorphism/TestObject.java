public class TestObject {
    public static void main(String[] args) {
        Game game = new Game("hangman");
        System.out.println(game.toString());
        System.out.println(game);
    }
}

class Game {

    String name;
    public Game(String name) {
        this.name = name;
    }
    // override toString() method

    // override equals() method
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Game) {
            return this.name.equals(((Game)obj).name);
        } else {
            return false;
        }
    }
}
