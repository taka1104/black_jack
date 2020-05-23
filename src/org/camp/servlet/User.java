/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.util.ArrayList;

/**
 *
 * @author yossan1104
 */

// Humanクラスを継承したuserクラスを作成。
class User extends Human {


    
    //手札の合計値を計算するメソッド
    @Override
    public int open() {
             
        // myCardsの合計値を表す変数sumを作成。
        int sum = 0;
            
            // myCardsのカードを取り出し、数値を判定。
            for(int i = 0; i < myCards.size(); i++){
                
                if(myCards.get(i) >= 11){
                    sum += 10;
                }else{
                // myCardsの合計値をsumに代入する。
                sum += myCards.get(i);                   
                }

                

            }
                //合計値を戻す。
                return sum;
    }

    //引いたカードを手札に追加するメソッド
    public void setCard(ArrayList<Integer> Y) {
        
        // myCardsのカードを取り出す。
        for(int i = 0; i < Y.size(); i++){
            
            //引いたカードを手札に追加する。
            myCards.add(Y.get(i));
        }        
    }

    //カードを引くか判断するメソッド
    public boolean checkSum() {
        
        // myCardsの合計値を表す変数sumを作成。
        int sum = 0;
            
            // myCardsのカードを取り出す。
            for(int i = 0; i < myCards.size(); i++){
                
                // (再提出部分)
                if(myCards.get(i) >= 11){
                //カードの合計値が11以上なら10として判定。                 
                sum += 10;
                }else{
                // myCardsの合計値をsumに代入する。
                sum += myCards.get(i);                   
                }
            }        
            
        //合計値が17を超えていなければ、trueを返す。
        return sum < 17;          
    } 

    @Override
    public void setCard() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean checkSum(ArrayList<Integer> s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
