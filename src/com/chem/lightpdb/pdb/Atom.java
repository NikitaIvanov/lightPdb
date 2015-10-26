/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chem.lightpdb.pdb;

import java.util.Formatter;
import java.util.Locale;

/**
 *
 * @author nikita
 */
public class Atom extends com.chem.lightpdb.pdb.common.Atom {
    
    
    public Atom(String line) {
        init(line);
    }
    
    public Atom() {
        
    }

    @Override
    protected void init(String line) {
        try { 
            serial = Integer.parseInt(line.substring(6, 11).trim());
        } catch(Exception e) {}
        try {
            name = line.substring(12, 16).trim();
        } catch(Exception e) {}
        try { 
            altLoc = line.substring(16, 17).trim().toCharArray()[0];
        } catch(Exception e) {}
        try {
            resName = line.substring(17, 20).trim();
        } catch(Exception e) {}
        try {
            chainID = line.substring(21, 22).trim().toCharArray()[0];
        } catch(Exception e) {}
        try {
            resSeq = Integer.parseInt(line.substring(22, 26).trim());
        } catch(Exception e) {}
        try {
            iCode = line.substring(26, 27).trim().toCharArray()[0];
        } catch(Exception e) {}
        try {
            x = Float.parseFloat(line.substring(30, 38).trim());
        } catch(Exception e) {}
        try {
            y = Float.parseFloat(line.substring(38, 46).trim());
        } catch(Exception e) {}
        try {
            z = Float.parseFloat(line.substring(46, 54).trim());
        } catch(Exception e) {}
        try {
            occupancy = Float.parseFloat(line.substring(54, 60).trim());
        } catch(Exception e) {}
        try {
            tempFactor = Float.parseFloat(line.substring(60, 66).trim());
        } catch(Exception e) {}
        try {
            element = line.substring(76, 78).trim();
        } catch(Exception e) {}
        try {
            charge = line.substring(78).trim();
        } catch(Exception e) {}
    }

    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Formatter form = new Formatter(sb, Locale.US);
        return form.format("ATOM  %5d %4s %3s  %4d    %8.4f%8.4f%8.4f%6.2f%6.2f%10s%2s", serial, name, resName, resSeq, x, y, z, occupancy, tempFactor, charge, element).toString();
    }
    
}
