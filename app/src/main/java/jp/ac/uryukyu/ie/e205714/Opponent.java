package jp.ac.uryukyu.ie.e205714;

import java.util.Scanner;
import java.util.Random;

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
     * Opponent shoot position is random.
     */
    @Override
    public void shootPosition() {
        System.out.println(this.getName() + "がシュートします");
        var random = new Random();
        this.setShoot(random.nextInt(5)+1); 
        this.setStatus(!this.getStatus());
    }

    /**
     * This method get opponent's gard position.
     * Opponent keep position is random.
     */
    @Override
    public void keepPosition() {
        System.out.println(this.getName() + "がキーパーをします");
        var random = new Random();
        this.setKeep(random.nextInt(5)+1); 
        this.setStatus(!this.getStatus());
    }
}