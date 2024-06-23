#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

public class GameMap {
    public String name;
    public int id;
    public GameMode gameMode;

    public GameMap(String name, int id, GameMode gameMode) {
        this.name = name;
        this.id = id;
        this.gameMode = gameMode;
    }
}
