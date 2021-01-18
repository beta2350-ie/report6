package jp.ac.uryukyu.ie.e205714;

import java.util.Scanner;

/**
 * This class is GameMaster class(GameMasterクラスです。) This game is proceed by this
 * class. (このゲームはこのクラスで進行します。)
 */
public class GameMaster {

    private boolean loop = true;
    private Player player = new Player();
    private Player opponent = new Player();

    /**
     * Constructor.
     */
    public GameMaster() {

    }

    /**
     * This method set players name.
     */
    public void setNames() {
        System.out.println("player1の名前を入れてください");
        Scanner scanner = new Scanner(System.in);
        player.setName(scanner.nextLine());
        System.out.println("player2の名前を入れてください");
        opponent.setName(scanner.nextLine());
    }

    /**
     * This method display game board.
     * @param grid
     */
    public void gridPrint() {
        System.out.println("-------");
        System.out.print("|");
        for (int i = 0; i < 3; i++) {
            System.out.print(i);
            System.out.print("|");
        }
        System.out.println();
        System.out.print("|");
        for (int i = 3; i < 6; i++) {
            System.out.print(i);
            System.out.print("|");
        }
        System.out.println();
        System.out.println("-------");
    }

    /**
     * This method return loop value.
     * @return
     */
    public boolean getLoop() {
        return this.loop;
    }

    /**
     * This method judge game finish.
     * if this game finish,loop value false.
     */
    public void finishGame() {
        System.out.println("ゲームを終了しますか？y(yes)かn(no)を選択してください。");
        String finish;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                finish = scanner.nextLine();
                if (finish.equals("n")) {
                    System.out.println("ゲームを続けます。");
                    loop = true;
                    break;
                } else if (finish.equals("y")) {
                    System.out.println("ゲームを終了します。お疲れ様でした。");
                    loop = false;
                    break;
                } else {
                    System.out.println("y(yes)かn(no)を選択してください。");
                }
            } catch (Exception e) {
                System.out.println("y(yes)かn(no)を選択してください。");
            }
        }
    }

    /**
     * This game is proceed by this method. (このゲームはこのメソッドで進行します。)
     */
    public void gameStart() {
        setNames();
        while (true) {
            gridPrint();
            break;
        }
        finishGame();
    }

}