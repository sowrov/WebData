/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mozadded.app.api.response;

/**
 *
 * @author sowrov
 */
public class Version {
    private final int major;
    private final int minor;
    private final int bugFix;
    
    private Version(){
        this.major=1;
        this.minor=0;
        this.bugFix=0;
    }
    
    public static Version getInstance() {
        return SingletonInstance.instance;
    }
    
    private static class SingletonInstance {
        private static final Version instance = new Version();
    }
    
    @Override
    public String toString(){
        return this.major+"."+this.minor+"."+this.bugFix;
    }
}
