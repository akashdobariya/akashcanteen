/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cms.action;

import com.opensymphony.xwork2.ModelDriven;
import com.cms.model.*;
import java.util.Map;
import javax.security.auth.message.callback.PrivateKeyCallback;
import javax.servlet.http.HttpSession;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
/**
 *
 * @author akash
 */
public class LoginAction implements ModelDriven, SessionAware{

    Login log=new Login();
    String user;
    SessionMap sessionmap;
    
    @Override
    public Object getModel() {
        return log;
    }
    
    public String doLogin(){
        boolean b=false;
        user=log.getUsername();
        b=log.logincheck();
        System.out.println("loginaction="+b);
        if(b==true)
          
        return "success";
        else
        return "unsuccess";
        
        
    }

    @Override
    public void setSession(Map map) {
        sessionmap=(SessionMap)map;
        sessionmap.put("uname",user);   
    }

    
    
}
