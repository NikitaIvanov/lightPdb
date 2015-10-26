/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chem.lightpdb.pdb;

import com.chem.lightpdb.pdb.shared.SingleBond;
import java.util.ArrayList;

/**
 *
 * @author nikita
 */
public class Conect {
    
    private ArrayList<SingleBond> singleBonds;
    private int serialAtom;
    
    public Conect() {
        singleBonds = new ArrayList<>();
    }
    
    public Conect(String line) {
        
        singleBonds = new ArrayList<>();
        
        String[] ids = line.substring(6).trim().split("\\s+");
        for(int i=1; i<ids.length; i++) {
            SingleBond singleBond = new SingleBond(Integer.parseInt(ids[0]), Integer.parseInt(ids[i]));
            singleBonds.add(singleBond);
        }
        this.serialAtom = Integer.parseInt(ids[0]);
    }

    /*
        Get all single bonds
        @return array list of objects SingleBond
    */
    public ArrayList<SingleBond> getSingleBonds() {
        return singleBonds;
    }

    /*
        set the array list of SingleBond
    */
    public void setSingleBonds(ArrayList<SingleBond> singleBonds) {
        this.singleBonds = singleBonds;
    }

    @Override
    public String toString() {
        String out = "CONECT"+toStringSerial();
        for(SingleBond singleBond: singleBonds) {
            out += singleBond;
        }
        return out;
    }
    
    private String toStringSerial() {
        return String.format("%5d", serialAtom);
    }
    
}
