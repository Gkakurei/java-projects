/*
 * 演示逻辑运算的使用
 */


public class LogicOperator01 {
    public static void main(String[] args) {
        //短路与&& 和 逻辑与& 案例演示
        int age = 50;
        if(age > 20 && age < 50){
           System.out.println("ok100");

        }
     //逻辑与& 使用   
     if(age > 20 && age < 50){
           System.out.println("ok200");


       //区别
       int a = 4;
       int b = 9;
       //对于 短路与&& 而言，第一个条件为false，后面不再判断
       //对于 逻辑与& 而言，第一个条件为false，后面依然判断
       if(a < 1 && ++b < 50){// ++b 运算为 10
        System.out.println("ok300");
       }
       System.out.println("a=" + a + "b=" + b); // 4 9

       
    }
    }
  }
