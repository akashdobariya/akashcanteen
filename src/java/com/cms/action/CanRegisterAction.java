/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cms.action;

import com.cms.model.CanRegister;
import com.opensymphony.xwork2.ModelDriven;


/**
 *
 * @author akash
 */
public class CanRegisterAction implements ModelDriven{

 CanRegister can=new CanRegister();
    
    @Override
    public Object getModel() {
        return can;
    }
    
    public String docanRegister(){
        boolean b;
        b=can.cRegister();
        if(b)
        return "success";
        else
        return "failure";
        
    }
    

    
    
}
