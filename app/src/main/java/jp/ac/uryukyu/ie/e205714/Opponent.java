package jp.ac.uryukyu.ie.e205714;

import java.util.Scanner;

/**
 * This class is Opponent class. This class write opponent
 * movement.(このクラスは自分の動きを記述します。) 
 * String name;//Opponent name status indicate that opponent'job is shooter or keeper.
 */
public class Opponent extends Character{
    /**
     * Constructor.
     */
    public Opponent() {
        super();
    }

    /**
     * This method get opponent's shoot position.
     */
    @Override
    public void shootPosition() {
        System.out.println(this.getName() + "がシュートします");
        System.out.println("シュートする場所を選択(1~6の数字を入力)");
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                this.setShoot(scanner.nextInt()); 
                if (this.getShoot() >= 0 && this.getShoot() <= 6) {
                    break;
                } else {
                    System.out.println("1~6の数字を入力してください。");
                }
            } catch (Exception e) {
                System.out.println("1~6の数字を入力してください。");
            }
        }
        this.setStatus(!getStatus());
    }

    /**
     * This method get opponent's gard position.
     */
    @Override
    public void keepPosition() {
        System.out.println(this.getName() + "がキーパーをします");
        System.out.println("守る場所を選択(1~6の数字を入力)");
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                this.setKeep(scanner.nextInt());
                if (this.getKeep() >= 0 && this.getKeep() <= 6) {
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