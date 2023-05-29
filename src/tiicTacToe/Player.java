package tiicTacToe;


public class Player {
    private String name;
    private Symbols symbols;

    public Player(String name){
        this.name = name;
    }

    public Symbols getSymbols() {
        return symbols;
    }

    public void setSymbols(Symbols symbols) {
        this.symbols = symbols;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
