package jp.ac.uryukyu.ie.e205714;

import java.util.Scanner;

/**
 * This class is Player class. This class write player
 * movement.(このクラスは自分の動きを記述します。) String name;//Player name status indicate that
 * player'job is shooter or keeper.
 */
public class Player {
    private String name;
    private int shoot = 0;
    private int keep = 0;
    private boolean status = false;
    private int score=0;

    /**
     * Constructor.
     */
    public Player() {

    }

    /**
     * This method get player's shoot position.
     */
    public void shootPosition() {
        System.out.println(this.name + "がシュートします");
        System.out.println("シュートする場所を選択(1~6の数字を入力)");
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                shoot = scanner.nextInt();
                if (shoot >= 0 && shoot <= 6) {
                    break;
                } else {
                    System.out.println("1~6の数字を入力してください。");
                }
            } catch (Exception e) {
                System.out.println("1~6の数字を入力してください。");
            }
        }
        status = !status;
    }

    /**
     * This method get player's gard position.
     */
    public void keepPosition() {
        System.out.println(this.name + "がキーパーをします");
        System.out.println("守る場所を選択(1~6の数字を入力)");
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                keep = scanner.nextInt();
                if (keep >= 0 && keep <= 6) {
                    break;
                } else {
                    System.out.println("1~6の数字を入力してください。");
                }
            } catch (Exception e) {
                System.out.println("1~6の数字を入力してください。");
            }
        }
        status = !status;
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

    /**
     * This method set player's job.
     * 
     * @param _status
     */
    public void setSatus(boolean _status) {
        this.status = _status;
    }

    /**
     * This method return player's job.
     * 
     * @return status
     */
    public boolean getStatus() {
        return this.status;
    }

    /**
     * This method return shoot value.
     * 
     * @return shoot value
     */
    public int getShoot() {
        return this.shoot;
    }

    /**
     * This method return keep value.
     * 
     * @return keep value
     */
    public int getKeep() {
        return this.keep;
    }

    /**
     * This method add player's score.
     * @param _score
     */
    public void setScore(){
        this.score++;
    }

    /**
     * This method return player's score.
     * @return player's score.
     */
    public int getScore(){
        return this.score;
    }
}
