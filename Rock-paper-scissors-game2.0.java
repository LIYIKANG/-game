import java.util.Random;
import java.util.Scanner;
public class Janken {
  public static void main(String args[]) {

    // 乱数の初期化処理です。以下の１行は編集しないでください。
   // 以下に解答を入力してください。
  // Random rand = new Random(Integer.valueOf(args[0]));
         while (true) {
            System.out.println("*******************************");
            System.out.println("--------じゃんけんゲーム--------");
            System.out.println("何を出しますか:（0はチョキ，1はグー，2はパー）");
            Scanner sc=new Scanner(System.in);
            int computerA=(int)(Math.random()*2)+0;  //ユーザ側
            //System.out.println("入力した値："+ computerA);
            int computerB=(int)(Math.random()*2)+0; //コンピューター側
            //System.out.println("生成されたパソコンの値："+ computerB);
            String comA="ユーザ";
            String comB = "コンピューター";
            //それぞれ定義するcomputerA = 1,2,3の場合それぞれチョキ，グー，パーに対応する
            switch(computerA){
                case 0:
                    comA="チョキ";
                    break;
                case 1:
                    comA="グー";
                    break;
                case 2:
                    comA="パー";
                    break;
            }
            //同上
            switch(computerB){
                case 0:
                    comB="チョキ";
                    break;
                case 1:
                    comB="グー";
                    break;
                case 2:
                    comB="パー";
                    break;
            }

            //じゃんけんゲームを判断する
            if(computerA==0&&computerB==1||computerA==1&&computerB==2||computerA==2&&computerB==0){//負けた場合
                System.out.println("コンピューターA:（"+comA+"） ");
                //System.out.println("\n");
                System.out.println("コンピューターB:（"+comB+"）");
                //System.out.println("\n");
                System.out.println(" コンピューターAの負け");
                //System.out.println();
            }else if (computerA==computerB){//一緒になった場合
                System.out.println("コンピューターA:（"+comA+"） ");
                //System.out.println("\n");
                System.out.println("コンピューターB:（"+comB+"）");
                //System.out.println("\n");
                System.out.println("【あいこ】");
                // System.out.println();
            }else{//ほかの場合、つまり、勝ったの場合
                System.out.println("コンピューターA:（"+comA+"） ");
                //System.out.println("\n");
                System.out.println("コンピューターB:（"+comB+"）");
                //System.out.println("\n");
                System.out.println("コンピューターAの勝ち");;
                break;
            }
        }
  
  }
}
