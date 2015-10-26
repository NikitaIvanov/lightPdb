/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chem.lightpdb.pdb.common;

import com.chem.lightpdb.pdb.Conect;
import com.chem.lightpdb.pdb.Remark;
import java.util.ArrayList;

/**
 *
 * @author nikita
 */
public class Molecule {
    
    private ArrayList<Atom> atoms;
    private ArrayList<Conect> conects;
    private ArrayList<Remark> remarks;

    public Molecule() {
    }
    
    public void addAtom(Atom atom) {
        atoms.add(atom);
    }
    
    public void addConect(Conect conect) { 
        conects.add(conect);
    }

    public void setAtoms(ArrayList<Atom> atoms) {
        this.atoms = atoms;
    }

    public void setConects(ArrayList<Conect> conects) {
        this.conects = conects;
    }

    public void setRemarks(ArrayList<Remark> remarks) {
        this.remarks = remarks;
    }

    public ArrayList<Atom> getAtoms() {
        return atoms;
    }

    public ArrayList<Conect> getConects() {
        return conects;
    }

    public ArrayList<Remark> getRemarks() {
        return remarks;
    }
    
    public ArrayList<Atom> getResidue(int id) {
        ArrayList<Atom> residue = new ArrayList<>();
        for(Atom atom: atoms) {
            if(atom.getResSeq()==id) {
                residue.add(atom);
            }
        }
        return residue;
    }
    
    public Atom getAtom(int serial) {
        for(int i=0; i<atoms.size(); i++) {
            if(atoms.get(i).getSerial()==serial) return atoms.get(i);
        }
        return null;
    }
    
    @Override
    public String toString() {
        String mol = "";
        for(int i=0; i<remarks.size(); i++) mol += remarks.get(i).toString() + "\n";
        for(int i=0; i<atoms.size(); i++) {
            mol += atoms.get(i).toString() + "\n";
        }
        for(int i=0; i<conects.size(); i++) mol += conects.get(i).toString() + "\n";
        return mol;
    }
    
}
