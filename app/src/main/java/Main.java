import jp.ac.uryukyu.ie.e205714.*;

public class Main {
    public static void main(String[] args) {
        GameMaster gameMaster=new GameMaster();
        while(gameMaster.getLoop()){
            gameMaster.gameStart();
        }
    }
}