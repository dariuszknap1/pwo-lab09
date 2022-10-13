/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab09.composite;

/**
 *
 * @author dariusz
 */
public class Cover extends WaterSystem {

    public void fill() {
        super.fill();
        System.out.println("Ptwieram pokrywę");
    }

    public void afterFill() {
        super.afterFill();
        System.out.println("Zamykam pokrywę");
    }

    public void drain() {
        super.drain();
        System.out.println("Otwieram pokrywę");
    }

    public void afterDrain() {
        super.afterDrain();
        System.out.println("Zamykam pokrywę");
    }
}
