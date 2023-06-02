package maze_of_words;

import java.awt.*;
import javax.swing.*;

public class Levels{
    
        Easy easy= new Easy();
        Medium medium= new Medium();
        Hard hard= new Hard();
        
        JFrame frame = new JFrame("Game");
        Character ch= new Character();
    
    
    public void paint(Graphics graph){  
        
        if(ch.getLevelFlag()==1){
            easy.paint(graph);
        } 
        
        else if(ch.getLevelFlag()==0){
            medium.paint(graph);
        }
        
        else if(ch.getLevelFlag()==3){
            hard.paint(graph);
        }
    }
    
}