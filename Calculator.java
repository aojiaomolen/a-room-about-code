package Mouthen;
import java.util.Scanner;
public class Calculator {
    Scanner sc = new Scanner(System.in);
    public void calmethod(){
        System.out.println("请输入第一个数字");
        float left = sc.nextFloat();
        System.out.println("请输入第二个数字");
        float right = sc.nextFloat();
        System.out.println("请输入运算符");
        char myt = sc.next().charAt(0);//sc.next()获取输入的字符，charAt（）是读取第几个字符
        if(myt == '+'){
            System.out.println(left+"+"+right+"="+(left+right));
        }if(myt == '-'){
            System.out.println(left+"-"+right+"="+(left-right));
        }if(myt == '*'){
            System.out.println(left+"*"+right+"="+(left*right));
        }if(myt == '/'){
            System.out.println(left+"/"+right+"="+(left/right));
        }if(myt == '^'){
            System.out.println(left+"^"+right+"="+(Math.pow(left,right)));
        }if(myt!='+'&&myt!='/'&&myt!='*'&&myt!='-'&&myt!='^'){
            System.out.println("请输入正确的运算符！");
        }
    }


}
