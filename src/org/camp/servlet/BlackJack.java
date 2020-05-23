/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

/**
 *
 * @author yossan1104
 */
public class BlackJack {
    
    // mainメソッドを作成する。(この中に処理を記述。)
    public static void main(String[] args){
        
    // UserクラスとDealerクラスをインスタンス化する。
    User U = new User();
    //dealerが用意されたら山札が用意される(コンストラクタ)
    Dealer D = new Dealer(); 
    
    //プレイヤーとディーラーに2枚ずつカードをセットする。
    U.setCard(D.deal());
    D.setCard(D.deal());
    
    //引いたカードをアウトプリントする。
    System.out.println("あなたは" + U.myCards + "を引きました。");
    System.out.println("ディーラーは" + D.myCards + "を引きました。");  
    
    //改行
    System.out.println();
    
    
    // checkSumの値がtrueならヒットし続ける。(17以下ならヒットし続ける。)
    while(U.checkSum()){
        U.setCard(D.hit());
        System.out.println("あなたはヒットしました。" + U.myCards);
    }
    
        //改行
        System.out.println();
    
// checkSumの値がtrueならヒットし続ける。(17以下ならヒットし続ける。)
    while(D.checkSum()){
        D.setCard(D.hit());
        System.out.println("ディーラーはヒットしました。" + D.myCards);
    }
    
    //改行
    System.out.println();

    //プレイヤーの合計値を表示する。
    System.out.print("[あなたの合計] " + U.open());
    
    //改行
    System.out.println();    
    
    //ディーラーの合計値を表示する。
    System.out.print("[ディーラーの合計] " + D.open());
    
    
    //2行改行
    System.out.println();
    System.out.println();
     
    //プレイヤーがバーストしていれば、ディーラーがバーストしていても、無条件でプレイヤーの負け。
    if(U.open() > 21){  
        System.out.print("あなたはバーストしました。あなたの負けです。");
    //以下、プレイヤーのバーストは無し。  
    //ディーラーがバーストしていれば、プレイヤーの勝ち。    
    }else if(D.open() > 21){
        System.out.print("ディーラーがバーストしました。あなたの勝ちです。");  

    //プレイヤーの方が数字が大きい場合、プレイヤーの勝ち。
    }else if(D.open() < U.open()){
        System.out.print("あなたの勝ちです。");
    //ディーラーの方が数字が大きい場合、ディーラーの勝ち。    
    }else if(D.open() > U.open()){
        System.out.print("ディーラーの勝ちです。");
    //残った条件は、数字が両方同じ場合のみなので、その場合は引き分け。    
    }else{
        System.out.print("引き分けです。");
    }
        
}
 
    
    
    
    
}
