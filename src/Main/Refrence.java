/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;

/**
 * @author Nathan
 */
public class Refrence {

    public String search;
    public String callNum;
    private String cost;
    void setCost(String str) {
    if (str == null) {
        str = "";
    }
    this.cost = str;
}

    /**
     * Sets the stationName for this element
     *
     * @param str
     */
    public void setCallN(String str) {
        if (str == null) {
            str = "";
        }
        this.callNum = str;
    }

    public void Search(ArrayList<String[]> list) {
            }
}
