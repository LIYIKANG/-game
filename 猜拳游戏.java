import java.io.*;

import java.util.Scanner;
class test  
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 while (true) {
            System.out.println("*******************************");
            System.out.println("--------欢迎进入猜拳游戏--------");
            System.out.println("请出拳:（1是剪刀，2是石头，3是布）");
            Scanner sc=new Scanner(System.in);
            int person=(int)(Math.random()*3)+1; //获取用户输入
            int computer=(int)(Math.random()*3)+1; //电脑随机出拳
            String per="用户";
            String com = "电脑";
            //用户出拳
            switch(person){
                case 1:
                    per="剪刀";
                    break;
                case 2:
                    per="石头";
                    break;
                case 3:
                    per="布";
                    break;
            }
            //电脑出拳
            switch(computer){
                case 1:
                    com="剪刀";
                    break;
                case 2:
                    com="石头";
                    break;
                case 3:
                    com="布";
                    break;
            }

            //根据出拳判断输赢
            if(person==1&&computer==2||person==2&&computer==3||person==3&&computer==1){
                System.out.println("你出的是（"+per+"） 电脑出的是（"+com+"）");
                System.out.println("       【你输了！再来一次吧】");
                //System.out.println();
            }else if (person==computer){
                System.out.println("你出的是（"+per+"） 电脑出的是（"+com+"）");
                System.out.println("       【平局！再来一次吧】");
                // System.out.println();
            }else{
                System.out.println("你出的是（"+per+"） 电脑出的是（"+com+"）");
                System.out.println("       【恭喜你赢了！！！】");
                System.out.println("【你终于战胜了电脑，游戏结束！】");;
                break;
            }
        }

	}
}
