package Mouthen;

import java.util.Scanner;

public class Primenumjudge {
    int count ;
    public void primeJudgemengt(){

        System.out.println("请输入一个数字 ：");
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();

       for(int i = 2 ; i <= num ; i++){
         if(num % i == 0){
             count++;
         }
       }if(count == 1){
            System.out.println("是素数");
        }else{
            System.out.println("不是素数");
        }
    }
}
