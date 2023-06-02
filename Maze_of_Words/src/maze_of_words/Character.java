package maze_of_words;

import java.awt.Color;
import javax.swing.*;
import java.util.Scanner;

public class Character extends JLabel {
        
        
    String name;
    int levelFlag;
    String question=" ";
    static String answer=" ";

    Character() {
        this.name=name;
        this.levelFlag=1;
        this.question=" ";
        this.answer=" ";
    }
    
    public int getLevelFlag(){
        return(levelFlag);
    }

}