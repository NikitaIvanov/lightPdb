/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chem.lightpdb.pdb.common;

/**
 *
 * @author nikita
 */
public abstract class Atom {
        
    protected int serial; //Atom  serial number.
    protected String name; //Atom name.
    protected char altLoc; //Alternate location indicator.
    protected String resName; //Residue name.
    protected char chainID; //Chain identifier.
    protected int resSeq; //Residue sequence number.
    protected char iCode; //Code for insertion of residues.
    protected float x; //Orthogonal coordinates for X in Angstroms.
    protected float y; //Orthogonal coordinates for Y in Angstroms.
    protected float z; //Orthogonal coordinates for Z in Angstroms.
    protected float occupancy; //Occupancy
    protected float tempFactor; //Temperature  factor.
    protected String element; //Element symbol, right-justified.
    protected String charge; // Charge  on the atom.

    public Atom() {
    }
    
    public Atom(String line) {
        init(line);
    }
    
    protected abstract void init(String line);
    
    public char getAltLoc() {
        return altLoc;
    }

    public char getChainID() {
        return chainID;
    }

    public String getCharge() {
        return charge;
    }

    public String getElement() {
        return element;
    }

    public String getName() {
        return name;
    }

    public float getOccupancy() {
        return occupancy;
    }

    public String getResName() {
        return resName;
    }

    public int getResSeq() {
        return resSeq;
    }

    public int getSerial() {
        return serial;
    }

    public float getTempFactor() {
        return tempFactor;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public char getiCode() {
        return iCode;
    }

    public void setAltLoc(char altLoc) {
        this.altLoc = altLoc;
    }

    public void setChainID(char chainID) {
        this.chainID = chainID;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOccupancy(float occupancy) {
        this.occupancy = occupancy;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }

    public void setResSeq(int resSeq) {
        this.resSeq = resSeq;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public void setTempFactor(float tempFactor) {
        this.tempFactor = tempFactor;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setiCode(char iCode) {
        this.iCode = iCode;
    }
    
}
