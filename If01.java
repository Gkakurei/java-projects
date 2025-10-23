//if的快速入门

import java.util.Scanner; // 导入Scanner类

public class If01 {
    public static void main(String[] args) {
      
        
// 思路分析
/*
1.接受输入的年龄，应该定义一个Scanner对象
2.把年龄保存到一个变量 int age
3.使用if判断，输出对应信息

*/

 Scanner myScanner = new Scanner(System.in);
 System.out.println("请输入年龄");
 int age = myScanner.nextInt();
 if (age > 18 ) {
     System.out.println("你年龄大于18，要为自己的行为负责任，进入监狱");
 }
  System.out.println("程序继续...");  

    
}
}