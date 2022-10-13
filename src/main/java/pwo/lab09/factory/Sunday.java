/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab09.factory;

/**
 *
 * @author dariusz
 */
public class Sunday implements MessageFactory {

    @Override
    public String createIntroMessage() {
        return "Jest niedziela. I znowu do roboty...";
    }

    @Override
    public String createMainMessage() {
        return "Niedzielna praca powoli się rozkręca";
    }

    @Override
    public String createClosingMessage() {
        return "Koniec niedzielnej zmiany";
    }
}
