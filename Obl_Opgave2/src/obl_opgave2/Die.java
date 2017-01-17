/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obl_opgave2;

import java.util.Random;

/**
 *
 * @author Nao
 */
public class Die {

    private int antalSider;
    private int value;

    public Die(int antalSider) {
        this.antalSider = antalSider;
    }

    public int throwDie() {
        Random ran = new Random();
        value = ran.nextInt(antalSider) + 1;
        return value;
    }

    public int getAntalSider() {
        return antalSider;
    }

    public void setAntalSider(int antalSider) {
        this.antalSider = antalSider;
    }

}
