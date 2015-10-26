/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chem.lightpdb.pdb;

/**
 *
 * @author nikita
 */
public class Remark {
    
    private String remark;
    
    public Remark(String line) {
        remark = line;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return remark;
    }

    @Override
    public String toString() {
        return remark;
    }
    
}
