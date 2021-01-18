package jp.ac.uryukyu.ie.e205714;

import java.util.Scanner;
import java.util.Random;

/**
 * This class is GameMaster class(GameMasterクラスです。) This game is proceed by this
 * class. (このゲームはこのクラスで進行します。)
 */
public class GameMaster {

    private boolean loop = true;

    /**
     * Constructor.
     */
    public GameMaster() {

    }

    /**
     * This method set players name.
     */
    public void setNames(Player player1, Player player2) {
        System.out.println("player1の名前を入れてください");
        Scanner scanner = new Scanner(System.in);
        player1.setName(scanner.nextLine());
        System.out.println("player2の名前を入れてください");
        player2.setName(scanner.nextLine());
    }

    public void setFirstOrLater(Player player1, Player player2) {
        var random = new Random();
        boolean status = random.nextBoolean();
        player1.setSatus(status);
        player2.setSatus(!status);

    }

    /**
     * This method display game board.
     * 
     * @param grid
     */
    public void gridPrint() {
        System.out.println("-------");
        System.out.print("|");
        for (int i = 1; i < 4; i++) {
            System.out.print(i);
            System.out.print("|");
        }
        System.out.println();
        System.out.print("|");
        for (int i = 4; i < 7; i++) {
            System.out.print(i);
            System.out.print("|");
        }
        System.out.println();
        System.out.println("-------");
    }

    /**
     * This method judge that ball enter the goal.
     * 
     * @param shoot  shoot position
     * @param keep   keep position
     * @param keeper 1 is player1,2 is player2
     */
    public void goalJudge(Player shooter, Player keeper) {
        if (shooter.getShoot() == keeper.getKeep()) {
            System.out.println(keeper.getName() + "は" + shooter.getName() + "の攻撃を防いだ");
        } else {
            System.out.println(shooter.getName() + "はゴールを決めた");
            shooter.setScore();
        }
    }

    /**
     * This method judge game finish. if this game finish,loop value false.
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
     * This method return loop value.
     * 
     * @return
     */
    public boolean getLoop() {
        return this.loop;
    }

    /**
     * This game is proceed by this method. (このゲームはこのメソッドで進行します。)
     */
    public void gameStart() {
        Player player1 = new Player();
        Player player2 = new Player();
        Opponent opponent = new Opponent();
        setNames(player1, player2);
        setFirstOrLater(player1, player2);
        int numberOfTime = 0;
        while (!(numberOfTime == 10)) {
            gridPrint();
            if (player1.getStatus()) {
                player1.shootPosition();
                player2.keepPosition();
                goalJudge(player1, player2);

            } else {
                player2.shootPosition();
                player1.keepPosition();
                goalJudge(player2, player1);
            }
            numberOfTime++;
            if (!(numberOfTime == 10)) {
                System.out.println("現在の点数は");
                System.out.println(player1.getName()+"::"+player1.getScore());
                System.out.println(player2.getName()+"::"+player2.getScore());
                System.out.println("攻守交代です。");
            }else{
                System.out.println("試合終了。");
            }
        }
        System.out.println("最終成績は");
        System.out.println(player1.getName()+"::"+player1.getScore());
        System.out.println(player2.getName()+"::"+player2.getScore());
        if(player1.getScore()>player2.getScore()){
            System.out.println(player1.getName()+"の勝ち！！");
        }else if(player1.getScore()<player2.getScore()){
            System.out.println(player2.getName()+"の勝ち！！");
        }else{
            System.out.println("引き分けです。");
        }
        finishGame();
    }
}