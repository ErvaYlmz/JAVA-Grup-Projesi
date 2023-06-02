package maze_of_words;
import java.util.*;


public class Crossword extends Character {
    static String[] questions3={"Meow!Meow!","Yellow and too hot","What writes your name?","Not small","Not wet","Laugh out loud","What navigates you?",
        "Stopping breathe","Scrambled or boiled","What do you chew?","Where do you build muscle?","You use to unlock","Not women","Fishes' home",
        "Not to lose","Where do you visit animals","... The Road Jack (A song)","Where do you sleep?","Who gives you milk","Not young"};
        
    static String[] answers3={"Cat","Sun","Pen","Big","Dry","lol","Map","Die","Egg","Gum","Gym","Key","Men","Sea","Win","Zoo","Hit","Bed","Cow","Old"};
    
    static String[] questions5={"My thoughts are same as yours","Not dead","..... Birds (A game name)","Thing that a king wears on his head","Not dirty","Opposite of fix","Not expensive",
        "Lets you know the time","What do you do with liquids instead of eating them?","Not true","When do you go to the bed?","Not vegetable","..... Club (A movie)","Not telling the truth",
        "It needs a pilot to fly","Sings the Bohemian Rhapsody","Not Lower","Corona .....","Colour of pureness","Gravitational ....."};
    
    static String[] answers5={"Agree","Alive","Angry","Crown","Clean","Broke","Cheap","Clock","Drink","False","Night","Fruit","Fight","Lying","Plane","Queen","Upper","Virus","White","Force"};
    
    static String[] questions7={"It comes from my parent's DNA, so it is","Now I see ... clear","Not legal","Where do you place your fridge?","Download(Same meaning)","Every wife have a","Not artificial",
        "You have to get this to drive","Chernobyl ... power plant","Opposite of maximum","An ocean","Composed of peptide bonds","One fourth","... Valley","Gives you financial support","Someone who goes to school to learn",
        "You say to someone who just entered the room","... America (Marvel character)","Part of the house where you place your bed","Time-honored,old,dateless (....... Greek)"};
    
    static String[] answers7={"Genetic","Crystal","Illegal","Kitchen","Install","Husband","Natural","License","Nuclear","Minimum","Pacific","Protein","Quarter","Silicon","Sponsor","Student","Welcome","Captain","Bedroom","Ancient"};

    public Crossword(Character person){
        int min=0;
        int max=19;
        int number = (int)Math.floor(Math.random()*(max-min+1)+min);
        int min2=65;
        int max2=90;

        //***
        if(person.levelFlag==1){
            person.question=questions3[number];
            person.answer=answers3[number];
            

            /*while(!userAns.toUpperCase().equals(person.answer.toUpperCase())){
                System.out.println("Your answer is wrong, try again.");
                userAns = input.nextLine();
            }
       
            if(userAns.toUpperCase().equals(person.answer.toUpperCase())){
                int keyNumber = (int)Math.floor(Math.random()*(max2-min2+1)+min2);
                person.Key=(char)keyNumber;
                System.out.println("Your answer is true!! Here is your Key: "+ person.Key);
                person.levelFlag++;
            }
       //***
       number = (int)Math.floor(Math.random()*(max-min+1)+min);
        }
        if(person.levelFlag==2){
            person.question=questions5[number];
            person.answer=answers5[number];
            
            System.out.println(person.question);
            System.out.println("Enter your guess");
            Scanner input = new Scanner(System.in);
            String userAns = input.nextLine();
            
            while(!userAns.toUpperCase().equals(person.answer.toUpperCase())){
                System.out.println("Your answer is wrong, try again.");
                userAns = input.nextLine();
            }
       
            if(userAns.toUpperCase().equals(person.answer.toUpperCase())){
                int keyNumber = (int)Math.floor(Math.random()*(max2-min2+1)+min2);
                person.Key=(char)keyNumber;
                System.out.println("Your answer is true!! Here is your Key: "+ person.Key);
                person.Key='A';
                person.levelFlag++;
            }
        }
        //***
        number = (int)Math.floor(Math.random()*(max-min+1)+min);
        if(person.levelFlag==3){
            person.question=questions7[number];
            person.answer=answers7[number];
            
            System.out.println(person.question);
            System.out.println("Enter your guess");
            Scanner input = new Scanner(System.in);
            String userAns = input.nextLine();
            while(!userAns.toUpperCase().equals(person.answer.toUpperCase())){
                System.out.println("Your answer is wrong, try again.");
                userAns = input.nextLine();
            }
       
            if(userAns.toUpperCase().equals(person.answer.toUpperCase())){
                System.out.println("Your answer is true!! YOU WON THE GAME!!!");
               }*/
     
    }

   }
    
     public boolean Controller(String userAns){
            
        return Character.answer.toUpperCase().equals(userAns.toUpperCase());

     }
}