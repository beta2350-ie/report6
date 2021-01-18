package jp.ac.uryukyu.ie.e205714;

/**
 * This class is Player class. This class write player
 * movement.(このクラスは自分の動きを記述します。) String name;//Player name
 */
public class Player {
    private String name;

    /**
     * Constructor.
     */
    public Player() {

    }

        /**
     * This method get player name.
     * 
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This method set player name.
     * 
     * @param _name player new name
     */
    public void setName(String _name) {
        this.name = _name;
    }
}
