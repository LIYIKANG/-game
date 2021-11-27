import java.io.*;

import java.util.Scanner;
class test  
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 while (true) {
            System.out.println("*******************************");
            System.out.println("--------じゃんけんゲーム--------");
            System.out.println("何を出しますか:（1はチョキ，2はグウ，3はパア）");
            Scanner sc=new Scanner(System.in);
            int person=sc.nextInt(); //ユーザ側
            System.out.println("入力した値："+ person);
            int computer=(int)(Math.random()*3)+1; //コンピューター側
            System.out.println("生成されたパソコンの値："+ computer);
            String per="ユーザ";
            String com = "コンピューター";
            //それぞれ定義するperson = 1,2,3の場合それぞれチョキ，グウ，パアに対応する
            switch(person){
                case 1:
                    per="チョキ";
                    break;
                case 2:
                    per="グウ";
                    break;
                case 3:
                    per="パア";
                    break;
            }
            //同上
            switch(computer){
                case 1:
                    com="チョキ";
                    break;
                case 2:
                    com="グウ";
                    break;
                case 3:
                    com="パア";
                    break;
            }

            //じゃんけんゲームを判断する
            if(person==1&&computer==2||person==2&&computer==3||person==3&&computer==1){//負けた場合
                System.out.println("あなたは（"+per+"） コンピューターは（"+com+"）");
                System.out.println("       【負けました！もう一度やり直してください】");
                //System.out.println();
            }else if (person==computer){//一緒になった場合
                System.out.println("あなたは（"+per+"） コンピューターは（"+com+"）");
                System.out.println("       【引き分けです！もう一度やり直してください】");
                // System.out.println();
            }else{//ほかの場合、つまり、勝ったの場合
                System.out.println("あなたは（"+per+"） コンピューターは（"+com+"）");
                System.out.println("       【おめでとうございます！】");
                System.out.println("【やっとコンピューターを勝ちました！おめでとうございます！】");;
                break;
            }
        }

	}
}
