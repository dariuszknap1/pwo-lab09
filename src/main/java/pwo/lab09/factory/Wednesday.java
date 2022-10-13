/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab09.factory;

/**
 *
 * @author dariusz
 */
public class Wednesday implements MessageFactory{
        @Override
    public String createIntroMessage() {
        return "Dzień dobry sroda.";
    }

    @Override
    public String createMainMessage() {
        return "Srodowa praca idzie lepiej";
    }

    @Override
    public String createClosingMessage() {
        return "Trzeci dzień pracy w tym tygodniu minął";
    }
}
