/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab09.builder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author dariusz
 */
public class TxtPic3 {

    private char background = ' ';
    private char foreground = ' ';
    private int size;
    private String fileName;
    private String art;

    public TxtPic3() {
    }

    private TxtPic3(char background, char foreground,
            int size, String fileName) {
        this.background = background;
        this.foreground = foreground;
        setSize(size);
        setFileName(fileName);
        art = "";

    }

    public TxtPic3 setBackground(char background) {
        this.background = background;
        return this;
    }

    public TxtPic3 setForeground(char foreground) {
        this.foreground = foreground;
        return this;
    }

    public final TxtPic3 setSize(int size) {
        if(size < 0){
            System.out.println("Rozmiar nie moze byc ujemny");
            this.size = 1;
            return this;
        }
        this.size = size;
        return this;
    }

    public TxtPic3 setFileName(String fileName) {
        if(fileName.isEmpty())
        {
            this.fileName = "file.txt";
            return this;
        }
        this.fileName = fileName + ".txt";
        return this;
    }

    public TxtPic3 createTxtPic(int size, String fileName) {
        if(background == ' ')
            setBackground('_');
        if(foreground == ' '){
            setForeground('*');
        }
        return new TxtPic3(background, foreground, size, fileName);
    }

    private void genArt() {
        for (int i = 0; i < size; i++) {
            int count = i + 1;
            int start = (size - count) / 2;
            for (int j = 0; j < size; j++) {
                if (j < start || count == 0) {
                    art += background;
                } else {
                    art += foreground;
                    count--;
                }
            }
            art += "\n";
        }
    }

    private void toFile() throws IOException {
        BufferedWriter writer
                = new BufferedWriter(new FileWriter(fileName));
        writer.write(art);
        writer.close();
    }

    public boolean save() {
        genArt();
        try {
            toFile();
        } catch (IOException ex) {
            return false;
        }
        return true;
    }
}
