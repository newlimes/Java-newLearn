import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2023-07-14
 * Time: 13:31
 */// 按两次 Shift 打开“随处搜索”对话框并输入 `show whitespaces`，
// 然后按 Enter 键。现在，您可以在代码中看到空格字符。
public class Test {
    public static void main(String[] args) {

        /*int sum = 0;      //输入数字sca，求1到sca的阶乘和
        Scanner scanner = new Scanner(System.in);
        int sca = scanner.nextInt();
        for (int i = 1; i <= sca; i++) {
            int ret = 1;
            for (int j = 1; j <= i; j++) {
                ret *= j;
            }
            sum += ret;
        }
        System.out.println(sum);*/

        /*int n = 0;    //使用continue跳过不是3和5的倍数的数
        while (n <= 100){
            n++;
            if((n%3!=0)||(n%5!=0))
                continue;
            System.out.println(n);
        }*/

        /*int n = 5;    //1-5阶乘和
        int i = 1;
        int ret = 1;
        int sum = 0;
        while(n > 0){
            ret = 1;
            i = n;
            while(i > 0){
                ret *= i;
                i--;
            }
            sum += ret;
            n--;
        }
        System.out.println(sum);*/

        /*int i = 1;    //1-100偶数和、奇数和、总和
        int sum = 0;
        int sumEvn = 0;
        int sum0dd = 0;

        while (i <= 100){
            if(i%2 == 0)  {
                sum0dd += i;
            }
            if(i % 2 != 0){
                sumEvn += i;
            }
            sum += i;
            i++;
        }
        System.out.println(sum0dd);
        System.out.println("偶数和"+sum0dd+"  "+"奇数和"+sumEvn+"  "+"总和"+sum);*/


//        Scanner scanner = new Scanner(System.in);
//        int sca = scanner.nextInt();

        /*int i = 0;        //1-100的偶数和
        int sum = 0;
        while(i <= 100){
            sum += i;
            i += 2;
        }
        System.out.println(sum);    //sum = 2550;*/

        /*int i = 1;        //1-100的奇数和
        int sum = 0;
        while(i <= 100){
            sum += i;
            i += 2;
        }
        System.out.println(sum);    //sum = 2500*/

        /*int i = 1;        //1-100的和
        int sum = 0;
        while(i <= 100){
            sum += i;
            i++;
        }
        System.out.println(sum);    //sum = 5050;*/

        /*
        Scanner = new Scanner(System.in);   //输入1-7数字显示星期
        int sca = scanner.nextInt();
        switch(sca){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }*/
    }
}