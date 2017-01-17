/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obl_opgave2;

/**
 *
 * @author Nao
 */
public class GameResult {

    private int result;

    public int getResult() {
        double result = Math.random() * 6 + 1;
        return this.result;
    }

    @Override
    public String toString() {
        return "GameResult{" + "result=" + result + '}';
    }
// Jeg forstår ikke helt hvad jeg skal bruge denne klasse til så den er rimelig tom :S
}
