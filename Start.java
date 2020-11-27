package Mouthen;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        System.out.println("输入1进行闰年的判断，输入2进入质数判断，输入3进入计算器");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch(num){
            case 1 :
                Leapyear lep = new Leapyear();
                lep.leapMethod();
                break;
            case 2 :
                Primenumjudge pri = new Primenumjudge();
                pri.primeJudgemengt();
                break;
            case 3 :
                Calculator ca = new Calculator();
                ca.calmethod();
                break;


            }
        }
    }

