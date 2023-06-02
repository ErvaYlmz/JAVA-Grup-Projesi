package maze_of_words;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import javax.swing.border.*;

public class Maze_of_Words extends JPanel{
        
    static Levels maze= new Levels();

    @Override
    public void paint(Graphics graph){

    maze.paint(graph);

    }
        static ImageIcon rightIconMale = new ImageIcon("C:\\Users\\Asus\\Documents\\NetBeansProjects\\Maze_of_Words\\src\\images\\rightIconMale.png");
        static ImageIcon leftIconMale = new ImageIcon("C:\\Users\\Asus\\Documents\\NetBeansProjects\\Maze_of_Words\\src\\images\\leftIconMale.png");
        static ImageIcon downIconMale = new ImageIcon("C:\\Users\\Asus\\Documents\\NetBeansProjects\\Maze_of_Words\\src\\images\\downIconMale.png");
        static ImageIcon upIconMale = new ImageIcon("C:\\Users\\Asus\\Documents\\NetBeansProjects\\Maze_of_Words\\src\\images\\upIconMale.png");
        static ImageIcon startIconMale = new ImageIcon("C:\\Users\\Asus\\Documents\\NetBeansProjects\\Maze_of_Words\\src\\images\\startIconMale.png");
        
        static ImageIcon rightIconFemale = new ImageIcon("C:\\Users\\Asus\\Documents\\NetBeansProjects\\Maze_of_Words\\src\\images\\rightIconFemale.png");
        static ImageIcon leftIconFemale = new ImageIcon("C:\\Users\\Asus\\Documents\\NetBeansProjects\\Maze_of_Words\\src\\images\\leftIconFemale.png");
        static ImageIcon downIconFemale = new ImageIcon("C:\\Users\\Asus\\Documents\\NetBeansProjects\\Maze_of_Words\\src\\images\\downIconFemale.png");
        static ImageIcon upIconFemale = new ImageIcon("C:\\Users\\Asus\\Documents\\NetBeansProjects\\Maze_of_Words\\src\\images\\upIconFemale.png");
        static ImageIcon startIconFemale = new ImageIcon("C:\\Users\\Asus\\Documents\\NetBeansProjects\\Maze_of_Words\\src\\images\\startIconFemale.png");
        
        static JLabel label =new JLabel();

public static void main(String []args){
    
        JFrame dispose= new JFrame("Start the Game");
        JFrame gender= new JFrame("Choosing a Gender");
        JLabel genderlbl= new JLabel("Choose a Gender");
        JButton male= new JButton();
        JButton female= new JButton();
        JButton start= new JButton("START");
        JButton exit= new JButton("EXIT");
        Character ch= new Character();
        Crossword crw =new Crossword(ch);
        
        JFrame pop = new JFrame("crossword");
        pop.setBounds(300, 300, 350, 350);
        
    JFrame frame =new JFrame("Maze Game");
    Maze_of_Words game =new Maze_of_Words();

    label.setBounds(0,646, 35, 35);
    label.setBackground(Color.LIGHT_GRAY);
    
    label.setHorizontalAlignment(JLabel.CENTER);
    label.setVerticalAlignment(JLabel.CENTER);
    label.setOpaque(false);
    
    start.setBounds(180, 100, 80, 40);
    
    exit.setBounds(180, 200, 80, 40);
    
    dispose.add(start);
    dispose.add(exit);
    
    dispose.setSize(500, 500);
    dispose.setLocation(350, 100);
    dispose.setLayout(null);
    dispose.setVisible(true);
    dispose.getContentPane().setBackground(Color.white);
    dispose.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    genderlbl.setSize(200, 100);
    genderlbl.setBounds(150, 20, 200, 100);
    genderlbl.setFont(new Font("Calibri", Font.PLAIN, 25));
    
    female.setBounds(280, 150, 100, 100);
    female.setIcon(startIconFemale);
    female.setBorder(new EmptyBorder(5, 15, 5, 15));
    female.setBackground(Color.pink);
    female.setHorizontalTextPosition(JButton.CENTER);
    female.setVerticalTextPosition(JButton.CENTER);
    
    male.setBounds(100, 150, 100, 100);
    male.setIcon(startIconMale);
    male.setBorder(new EmptyBorder(5, 15, 5, 15));
    male.setBackground(new Color(54, 133, 245));
    male.setHorizontalTextPosition(JButton.CENTER);
    male.setVerticalTextPosition(JButton.CENTER);
    
    gender.setSize(500, 500);
    gender.setLocation(350, 100);
    gender.setLayout(null);
    gender.getContentPane().setBackground(Color.WHITE);
    
    gender.add(genderlbl);
    gender.add(male);
    gender.add(female);
    
    frame.add(label);
    frame.add(game);
    
    JFrame win = new JFrame("END OF THE GAME");
                        
                        win.setBounds(300, 200,350, 350);
                        JLabel message1 =new JLabel();
                        JLabel message2 =new JLabel();
                        message1.setText("CONGRATULATIONS!!!");
                        message2.setText("YOU WON THE GAME!!!");
                        message2.setLocation(100,100);
                        message2.setSize(100, 20);
                        message1.setFont(new Font("Calibri", Font.PLAIN, 25));
                        win.add(message1);
                        win.add(message2);
                        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
     start.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose.dispose();
                gender.setVisible(true);
                gender.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                male.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e) {
                gender.dispose();
                        frame.setVisible(true);
                        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        label.setIcon(startIconMale);
                        frame.addKeyListener(new KeyListener(){
    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        if(maze.easy.canMove((label.getY()/34), (label.getX()/34), e.getKeyCode())){
        switch(e.getKeyCode()){
            case 37: label.setLocation(label.getX()-10, label.getY()); label.setIcon(leftIconMale);
                    break;
            case 38: label.setLocation(label.getX(), label.getY()-10); label.setIcon(upIconMale);
                    break;
            case 39: label.setLocation(label.getX()+10, label.getY()); label.setIcon(rightIconMale);
                    break;
            case 40: label.setLocation(label.getX(), label.getY()+10); label.setIcon(downIconMale);
                    break;
        }}
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode()==37 || e.getKeyCode()==38 || e.getKeyCode()==39 || e.getKeyCode()==40){
            label.setIcon(startIconMale);
        }
        if(label.getX()>1326 && label.getY()<102 && label.getX()<1360 && label.getY()>=0){
                    
            pop.setVisible(true);
                    
            JPanel panel = new JPanel();
            panel.setVisible(true);
            pop.add(panel);
                               
                    JLabel lbl = new JLabel();
                    lbl.setSize(80, 20);
                    lbl.setLocation(10, 10);
                    lbl.setText(ch.question);
                    panel.add(lbl);
                    
                    TextField text = new TextField();
                    text.setVisible(true);
                    panel.add(text);
                    
                    JButton btn = new JButton("Send");
                    panel.add(btn);
                    
                    btn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                    String userAns = text.getText();

                    if(crw.Controller(userAns)){
                        pop.dispose();
                        JFrame win = new JFrame("END OF THE GAME");
                        win.setVisible(true);
                        win.setBounds(300, 300, 300, 300);
                        JLabel message =new JLabel();
                        message.setText("CONGRATULATIONS!!! YOU WON THE GAME!!!");
                        win.add(message);
                        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame.dispose();
                }
                    else{
                        JLabel falsemessage=new JLabel("Your answer is wrong. Try again!!");
                        falsemessage.setBounds(300, 300, 300, 300);
                        panel.add(falsemessage);
                    }
                    }
   });
      }
    }
});        }
        });
                
                 female.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                gender.dispose();
                        frame.setVisible(true);
                        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        label.setIcon(startIconFemale);
                        frame.addKeyListener(new KeyListener(){
                            @Override
                            public void keyTyped(KeyEvent e) {}

                            @Override
                            public void keyPressed(KeyEvent e) {
                                if(maze.easy.canMove((label.getY()/34), (label.getX()/34), e.getKeyCode())){
                                switch(e.getKeyCode()){
                                    case 37: label.setLocation(label.getX()-10, label.getY()); label.setIcon(leftIconFemale);
                                        break;
                                    case 38: label.setLocation(label.getX(), label.getY()-10); label.setIcon(upIconFemale);
                                        break;
                                    case 39: label.setLocation(label.getX()+10, label.getY()); label.setIcon(rightIconFemale);
                                        break;
                                    case 40: label.setLocation(label.getX(), label.getY()+10); label.setIcon(downIconFemale);
                                        break;
                    }
                                }
                            }

                            @Override
                            public void keyReleased(KeyEvent e) {
                                if(e.getKeyCode()==37 || e.getKeyCode()==38 || e.getKeyCode()==39 || e.getKeyCode()==40){
                        label.setIcon(startIconFemale);
                    }
                    if(label.getX()>1326 && label.getY()<102 && label.getX()<1360 && label.getY()>=0){
            
                    pop.setVisible(true);
                    
                    JPanel panel = new JPanel();
                    panel.setVisible(true);
                    pop.add(panel);
                               
                    JLabel lbl = new JLabel();
                    lbl.setText(ch.question);
                    panel.add(lbl);
                    
                    TextField text = new TextField();
                    text.setVisible(true);
                    panel.add(text);
                    
                    JButton btn = new JButton("send");
                    panel.add(btn);
                    
                    btn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String userAns = text.getText();

                    if(crw.Controller(userAns)){
                        pop.dispose();
                        JFrame win = new JFrame("END OF THE GAME");
                        win.setVisible(true);
                        win.setBounds(300, 300, 300, 300);
                        JLabel message =new JLabel();
                        message.setText("CONGRATULATIONS!!! YOU WON THE GAME!!!");
                        win.add(message);
                        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame.dispose();
                }
                    else{
                        JLabel falsemessage=new JLabel("Your answer is wrong. Try again!!");
                        falsemessage.setBounds(300, 300, 300, 300);
                        panel.add(falsemessage);
                    }
                    }
   });
                    }
                                }
                        });
                    }
                });
            }
        });
     
     exit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose.dispose();
            }
        });
}}