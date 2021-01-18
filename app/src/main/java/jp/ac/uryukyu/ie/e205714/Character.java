package jp.ac.uryukyu.ie.e205714;

import java.util.Scanner;

/**
 * This class is Character class. This class write Character
 * movement.(このクラスは自分の動きを記述します。) String name;//Character name status indicate that
 * Character'job is shooter or keeper.
 */
public abstract class Character {
    private String name;
    private int shoot = 0;
    private int keep = 0;
    private boolean status = false;
    private int score=0;

    /**
     * Constructor.
     */
    public Character() {

    }

    /**
     * This method get Character's shoot position.
     */
    public abstract void shootPosition();

    /**
     * This method get Character's gard position.
     */
    public abstract void keepPosition();

    /**
     * This method get Character name.
     * 
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This method set Character name.
     * 
     * @param _name player new name
     */
    public void setName(String _name) {
        this.name = _name;
    }

    /**
     * This method set Character's job.
     * 
     * @param _status
     */
    public void setStatus(boolean _status) {
        this.status = _status;
    }

    /**
     * This method return Character's job.
     * 
     * @return status
     */
    public boolean getStatus() {
        return this.status;
    }

    /**
     * This method set shoot value.
     * @param _shoot
     */
    public void setShoot(int _shoot){
        this.shoot=_shoot;
    }

    /**
     * This method set keep value.
     */
    public void setKeep(int _keep){
        this.keep=_keep;
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
     * This method add Character's score.
     * @param _score
     */
    public void setScore(){
        this.score++;
    }

    /**
     * This method return Character's score.
     * @return Character's score.
     */
    public int getScore(){
        return this.score;
    }
}