public class ArithmeticOperatorExercise02 {
      public static void main(String[] args) {

  //1.需求
  //假如还有59天放假，问：合xx个星期零xx天
  //2.思路分析
  //（1）使用 int 变量 days 保存 天数
  //（2）一个星期是7天 星期数weeks ： days / 7  零xx天 days % 7
  //（3）输出

 //3.走代码
  int days = 59;
  int weeks = days / 7;
  int leftdays = days % 7; 

  /*System.out.println("weeks =" + days / 7);
  System.out.println("days =" + days % 7);
  */
 System.out.println(days + "天 合" + weeks + "个星期" + leftdays + "天");

/* 自己写的
 //2.第2题
//1.需求
//定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为：5/9*(华氏温度-100)，
//请求出华氏温度对应的摄氏温度。[234.5]
//2.思路分析
//(1) 使用double 变量temperature 保存 华氏温度
//(2) 华氏温度转换摄氏温度的公式为：5/9*(华氏温度-100)
//(3)输出

*/

 //2.第2题  老师写的：
//1.需求
//定义一个变量保存华氏温度fahrenheit，华氏温度转换摄氏温度的公式为：5/9*(华氏温度-100)，
//请求出华氏温度对应的摄氏温度。[234.5]
//2.思路分析
//(1) 先定义一个double 变量fahrenheit 保存 华氏温度
//(2) 根据给出的公式，计算即可：5/9*(华氏温度-100)
//.   考虑数学公式和java语言的特性
//(3)将得到的结果保存到 double fahrenheit


//3.走代码

double fahrenheit = 234.6;
double sheshi = 5.0 / 9 * (fahrenheit - 100);


System.out.println("华氏温度" +fahrenheit + "对应的摄氏温度是" + sheshi);



      }     
}
