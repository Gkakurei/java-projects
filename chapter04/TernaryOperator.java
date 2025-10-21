//三元运算符使用


public class TernaryOperator {
    
    public static void main(String[] args) {
       // 解读
       // 1.a > b 为false
       // 2.返回 b--，先返回 b 的值，然后再 b-1
       // 3.返回的结果是 99
        
        int a = 10;
        int b = 99;
        int result = a < b ? a++ : b--;
 
 
      //  int result = a > b ? a++ : b--;
   // System.out.println("result=" + result); //  false 99

      System.out.println("result=" + result); // true 10 
      System.out.println("a=" + a); //11
      System.out.println("b=" + b); //99

    }
}
