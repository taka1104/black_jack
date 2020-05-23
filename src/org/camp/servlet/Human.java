package org.camp.servlet;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author yossan1104
 */
abstract class Human {
    
    //openというabstractな公開メソッドを用意。
    public abstract int open();
    
    //setCardというArrayListを引数とした、abstractな公開メソッドを用意。
    public abstract void setCard();
    
    //checkSumというabstractな公開メソッドを用意。
    public abstract boolean checkSum(ArrayList<Integer> s);
    
    //myCardsというArrayListの変数を用意
    protected ArrayList<Integer> myCards = new ArrayList<>();    
    
}
