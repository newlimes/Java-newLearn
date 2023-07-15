import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2023-07-15
 * Time: 16:49
 */
public class Main {

    public static void main(String[] args) {    //猜数字游戏
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int a = random.nextInt(100);
        while (true){
            System.out.println("请输入猜码数字：");
            int b = scan.nextInt();
            if(a > b){
                System.out.println("低了");
            }else if(a < b){
                System.out.println("高了");
            }else {
                System.out.println("猜对了");
                break;
            }
        }

    }

    public static void main3(String[] args) {   //产生随机数
        Random random = new Random();       //括号内加数字，则只会生成第一次生产的数
        int a = random.nextInt(100);    //括号内的数字n代表是0-n，不包含n
        int b = random.nextInt(100)+1;  //在后再加1，则高度提高1，范围为1-101，不包含101
        System.out.println(a);
        System.out.println(b);
    }

    public static void main2(String[] args) {    //循环输入，ctrl+D退出，CMD上是ctrl+z
        Scanner scan = new Scanner(System.in);

        while(scan.hasNextInt()){
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(a+b);
        }
    }

    public static void main1(String[] args) {   //单个输入
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入你的姓名：");
        String name = scan.nextLine();      //输入检测的是一行，放在别的输入后面会失效
        System.out.println("姓名："+name);
        /*
        System.out.println("请输入你的姓名：");
        String name = scan.next();      //输入后检测到空格就结束，把空格下一个字符数字当成下一个输入的输入
        System.out.println("姓名："+name);
*/
        System.out.println("请输入你的年龄：");
        int age = scan.nextInt();       //输入为整型
        System.out.println("年龄："+age);

        System.out.println("请输入你的工资：");
        float salary = scan.nextFloat();       //输入为单精度浮点型
        System.out.println("工资：" + salary);

        System.out.println("Hello world!");
    }
}