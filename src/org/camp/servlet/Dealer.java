package org.camp.servlet;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author yossan1104
 */

// Humanクラスを継承したDealerクラスを作成。
class Dealer extends Human {

    
    

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
        
        //引いたカードの配列を作る。
        for(int i = 0; i < Y.size(); i++){
            
            //引いたカードを手札に追加する。
            myCards.add(Y.get(i));
        }
        
    }

    //カードを引くか判断するメソッド
    public boolean checkSum() {
        
        //// myCardsの合計値を表す変数sumを作成。
        int sum = 0;
            
            // myCardsのカードの行列を作る。
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
    
    //cardsというArrayListの変数を用意する。
    protected ArrayList<Integer> cards = new ArrayList<>();

    // Dealerメソッドを作成する。
    public Dealer(){
        //4回ループ
        for(int j = 1; j <= 4 ; j++){
            //13枚追加
            for(int i = 1; i <= 13 ; i++){
                // cardsに全てのカードを追加。  
                cards.add(i);
            }
        }
}
    // dealメソッドを作成する。
    public ArrayList<Integer> deal(){
        
        //ランダムで2枚のカードというArrayListの変数d2を用意する。
        ArrayList<Integer> d2 = new ArrayList<>();
        
        //乱数のクラスを生成。
        Random rnd = new Random();
            
            //引くのは2回なので、まずは2回繰り返すfor文を作る。
            for(int i = 0; i < 2; i++){
                
                //乱数を生成。
                Integer index = rnd.nextInt(cards.size());
                
                //関数を手札に追加。
                d2.add(cards.get(index));             
            }
                    //変数d2を返す。
                    return d2;
               
    }
    
    // hitメソッドを作成する。
    public ArrayList<Integer> hit(){
     
        //ランダムで1枚のカードというArrayListの変数h1を用意する。
        ArrayList<Integer> h1 = new ArrayList<>();
        
        //乱数のクラスを生成。
        Random rnd = new Random();
        
        //乱数を生成。
        Integer index = rnd.nextInt(cards.size());
        
        //関数を手札に追加。
        h1.add(cards.get(index));             
        
        //変数h1を返す。
        return h1;       
     
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
