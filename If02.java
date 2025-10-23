import java.util.Scanner;


public class If02 {
    public static void main(String[] args) {

// 思路分析
/*
1.接受输入的年龄，应该定义一个Scanner对象
2.把年龄保存到一个变量 int age
3.使用if-else判断，输出对应信息

*/
Scanner myScanner = new Scanner(System.in);
 System.out.println("请输入年龄");
 int age = myScanner.nextInt();
 if (age > 18 ) {
     System.out.println("你年龄大于18，要为自己的行为负责任，进入监狱");
 }else{
        System.out.println("你年龄小于等于18，可以放过你");
 }
  System.out.println("程序继续...");  


// exercise
  int x = 7;
  int y = 4;
 if(x > 5){
    if (y > 5){
     System.out.println(x + y); 
 }
    System.out.println("韩顺平教育～"); // 韩顺平教育～
 } else

     System.out.println("x is " + x ); 


}
    }
