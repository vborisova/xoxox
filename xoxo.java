/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication31;

/**
 *
 * @author вики
 */

public class xoxo {
    static boolean ExOh(String str){
boolean equals=true;
int cntX=0, cntO=0;

for(int i=0;i<str.length();i++){
    if(str.charAt(i)=='x'||str.charAt(i)=='X' ){
    cntX++;}
    if(str.charAt(i)=='o' || str.charAt(i)=='O'){
        cntO++;
    }
}
if(cntX!=cntO){
equals=false;
}

return equals;
}
    public static void main(String[] args){
        System.out.println(ExOh("xoxO"));
             
    
    }
    
}
