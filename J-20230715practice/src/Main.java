import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2023-07-15
 * Time: 21:53
 */
public class Main {

    public static void main(String[] args){     //把一个数的二进制码的奇数位与偶数位分开打印
        int n = 15;
        for (int i = 31; i >= 1; i -= 2) {
            System.out.print(((n >> i) & 1) +" ");
        }//偶数
        System.out.println();
        for (int i = 30; i >= 0; i -= 2) {
            System.out.print(((n >> i) & 1) +" ");
        }
    }

    public static void main14(String[] args){     //输入三次密码，判断字符是否正确
        int a = 158;
        int count = 3;
        Scanner scan = new Scanner(System.in);
        while(count != 0){
            System.out.println("请输入密码，共有"+ count +"次机会");
            String pass = scan.nextLine();
            if(pass.equals("123") ) {
                System.out.println("密码正确");
                break;
            }else {
                System.out.print("密码错误");
                count--;
            }
        }

    }


    public static void main13(String[] args){       //输入整数，分解逆序输出
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            int num = scan.nextInt();
            while(num != 0){
                System.out.print(num % 10+" ");
                num /= 10;
            }
        }
    }

    public static void main12(String[] args){     //打印对角星
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()) {
            int num = scan.nextInt();
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    if (j == i) {
                        System.out.print("*");      //if((j == i) || (j + i == num - 1))
                    } else if (j + i == num - 1) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");

                }
                System.out.println();
            }
        }
    }

    public static void main71(String[] args) {        //水仙花进阶版
        for(int i = 1;i < 999999;i++){
            int count = 0;
            int tmp = i;
            int sum = 0;
            while(tmp != 0){
                tmp = tmp/10;
                count++;
            }
            tmp = i;
            while(tmp != 0){
                sum += Math.pow(tmp%10,count);
                tmp = tmp/10;
            }
            if(sum == i)
                System.out.println(i+"是");
        }
    }

    public static void main11(String[] args){     //分子为1，分母增大，每一个数与前面的数的符号相反，最后求和
        double sum = 0;
        int a = 1;
        for(int i = 1;i <= 100;i++){
            sum = sum + (1.0 / i) * a;
            a = -a;
        }
        System.out.println(sum);
    }

    public static void main82(String[] args){       //计算整数的二进制1的个数
        int a = -1;
        int count = 0;
        while(a != 0) {
            a = a & (a - 1);
            count++;
        }
        System.out.println(count);
    }

    public static void main81(String[] args){         //计算整数的二进制1的个数
        int a = -7;
        int count = 0;
        for(int i = 0;i <32;i++){
            if(((a >> i) & 1) != 0)
                count++;

        }
        /*while(a != 0){
            if((a & 1) != 0)
                count += 1;
            a = a >>> 1;
        }*/
        System.out.println(count);
    }

    public static void main10(String[] args) {    //猜数字游戏
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

    public static void main8(String[] args){     //垃圾
        int i = 50;
        int num = 0;
        int j = 0;
        int[] temp={0};
        for(j = 0;i>0;j++){
            temp[j]=i%2;
            if(i%2 == 1)num += 1;
//            else num *=10;
            i/=2;
        }
        for(byte k =(byte)(j-1);k >=0;k--)
            System.out.print(temp[k]);
        System.out.println(num);
    }

    public static void main7(String[] args){        //水仙花数
        int num = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int temp = 0;
        for(int i = 1;i < 1000;i++){
            a = i%10;
            b = i/10%10;
            c = i/100;
            if(i == (a*a*a)+(b*b*b)+(c*c*c))
                System.out.println(i+"是水仙花数");
        }
    }/*num = 0;
            temp = i;
            for(int j = 0;j < temp;){
                num += (temp % 10)*(temp % 10)*(temp % 10);
                temp /= 10;
            }
            if(num == i)
                System.out.println(i+"是水仙花数");
            */

    public static void main6(String[] args){        //求最大公约数
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input tow number：");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int i;
        for( i = a-1;i >1 ;i--){
            if(a%i == 0)
                if(b%i == 0) {
                    System.out.println("最大公约数是：" + i);
                    break;
                }
        }
        if(i == 1)
            System.out.println("两个数最小大公约数为1 ");
    }

    public static void main5(String[] args){    //九九乘法表
        for(int i = 1;i <= 9;i++){
            for(int j = 1;j <=i; j++)
                System.out.printf("%d*%d=%d ",j,i,i*j);
            System.out.println(" ");
        }
    }

    public static void main4(String[] args){     //判断1000-2000的闰年
        for(int i = 1000;i <= 2000;i++){
            if(i%100 != 0){
                if(i%4 == 0)
                    System.out.println(i+" 是闰年");
            }else if (i%400 == 0)
                System.out.println(i+" 是闰年");
        }
    }

    public static void main3(String[] args){     //1-100内素数
        for (int i = 1; i < 100; i++) {
            int j;
            for(j = 2;j < i;j++){       //j <= i/2，取半，或根号公式Math.sqrt(i)
                if(i%j == 0)
                    break;
            }
            if(i == j)                  //if(j > i/2),if(j > Math.sqrt(i))
                System.out.println(i+"是素数");

        }
    }

    public static void main2(String[] args){    //输入判断素数
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            int num = scan.nextInt();
            int i;
            for( i = 2;i < num;i++)         //i <= num/2，取半，或根号公式Math.sqrt(num)
                if(num%i == 0)
                    break;
            if(num == i)
                System.out.println(num+" 是素数");
            else System.out.println(num+" 不是素数");
        }
    }

    public static void main1(String[] args) {    //根据年龄判断阶级
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            int age = scan.nextInt();
            if (age <= 18) {
                System.out.println("当前年龄的人是少年（低于18）");
            }else if(age <= 28){
                System.out.println("当前年龄的人是青年（19-28）");
            }else if(age <= 55){
                System.out.println("当前年龄的人是中年（29-55）");
            }else{
                System.out.println("当前年龄的人是老年（56以上）");
            }
        }
        System.out.println("Hello world!");
    }
}