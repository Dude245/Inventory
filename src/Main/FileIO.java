/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Nathan
 */
public class FileIO {

    public static ArrayList readIn()
    {
        String csvFile = "data/cpy.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        ArrayList<String[]> list = new ArrayList();
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] inv = line.split(cvsSplitBy,14);
                list.add(inv);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }


    public void printList(ArrayList<String> list)
    {

//               System.out.println("Location " + inv[0]+" Room # " + inv[1]+" Station name " + inv[2]+" Device Type " + inv[3]+" Model # " + inv[4]+" sn " + inv[5]+
//                       " Notes " + inv[6]+" Value " + inv[7]+" Date " + inv[8]+" Asset tag " + inv[9]+" Supplier " + inv[10]+" ups " + inv[11]);              " Notes " + inv[5]+" Value " + inv[6]+" Date " + inv[7]+" Asset tag " + inv[8]+" Supplier " + inv[9]);

    }

}
