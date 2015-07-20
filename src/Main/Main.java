package Main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * @author Nathan Reymer This program takes in Added books/Journals Then they
 * can be searched by typing in Keywords
 */
public class Main {

    /**
     * Creates the List for everything now
     */
    public static ArrayList<Refrence> rList = new ArrayList<>();

/**
 * Start the main program! This program takes in Added books/Journals Then
     * they can be searched by typing in Keywords
     * @param args
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException  {
        //Declare Variables, Not War
        try {
            Gui assignmentGui = new Gui();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
}
