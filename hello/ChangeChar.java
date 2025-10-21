//演示转移字符的使用
public class ChangeChar {
   
   //编写一个main的方法
    public static void main(String[] args) {
     
// \t 制表符,实现对其的功能
        System.out.println("北京\t天津\t上海");

// \n 换行符
        System.out.println("jack\nsmit\nmary");

// \\ 代表一个 \(第一个\是转译符,第二个才是\) 如果想要两个\就要写四个\\\\
        System.out.println("c:\\\\windows\\\\system32");
        System.out.println("老韩说：\"要好好学习java，才有前途\"");


// \r 回车符
        System.out.println("韩顺平教育\r北京");

//练习

       System.out.println("书名\t作者\t价格\t销量\n三国\t罗贯中\t120\t1000");
      
// \b 退格符
        System.out.println("hello\bworld");       

    }
}