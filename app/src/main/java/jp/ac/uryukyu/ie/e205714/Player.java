package jp.ac.uryukyu.ie.e205714;

import java.util.Scanner;

/**
 * This class is Player class. This class write player
 * movement.(このクラスは自分の動きを記述します。) 
 * String name;//Player name status indicate that player'job is shooter or keeper.
 */
public class Player extends Character {
    /**
     * Constructor.
     */
    public Player() {
        super();
    }

    /**
     * This method get player's shoot position.
     * getStatud indicate that true is shooter,false is keeper.
     */
    @Override
    public void shootPosition() {
        System.out.println(this.getName() + "がシュートします");
        System.out.println("シュートする場所を選択(1~6の数字を入力)");
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                this.setShoot(scanner.nextInt());
                if (this.getShoot() > 0 && this.getShoot() <= 6) {
                    break;
                } else {
                    System.out.println("1~6の数字を入力してください。");
                }
            } catch (Exception e) {
                System.out.println("1~6の数字を入力してください。");
            }
        }
        this.setStatus(!this.getStatus());
    }

    /**
     * This method get player's gard position.
     */
    @Override
    public void keepPosition() {
        System.out.println(this.getName() + "がキーパーをします");
        System.out.println("守る場所を選択(1~6の数字を入力)");
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                this.setKeep(scanner.nextInt());
                if (this.getKeep() > 0 && this.getKeep() <= 6) {
                    break;
                } else {
                    System.out.println("1~6の数字を入力してください。");
                }
            } catch (Exception e) {
                System.out.println("1~6の数字を入力してください。");
            }
        }
        this.setStatus(!this.getStatus());
    }
}
