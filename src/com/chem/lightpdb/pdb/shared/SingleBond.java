/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chem.lightpdb.pdb.shared;

/**
 *
 * @author nikita
 */
public class SingleBond {
    public int serialAtom1;
    public int serialAtom2;

    public SingleBond() {
        
    }
    
    public SingleBond(int s1, int s2) {
        this.serialAtom1 = s1;
        this.serialAtom2 = s2;
    }
    
    @Override
    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        Formatter form = new Formatter(sb, Locale.US);
        return String.format("%5d", serialAtom2);
    }

    public int getSerialAtom1() {
        return serialAtom1;
    }

    public int getSerialAtom2() {
        return serialAtom2;
    }

    public void setSerialAtom1(int serialAtom1) {
        this.serialAtom1 = serialAtom1;
    }

    public void setSerialAtom2(int serialAtom2) {
        this.serialAtom2 = serialAtom2;
    }
    
}
