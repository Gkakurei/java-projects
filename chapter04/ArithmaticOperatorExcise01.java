public class ArithmaticOperatorExcise01 {
       public static void main(String[] args) {

    // 1.面试题
/* 
int i = 1; //  i-》1
i = i++; //规则使用临时变量：（1）temp = i;（2）i = i + 1;（3）i = temp;
System.out.println(i); // 1
// 问：结果是多少？为什么？
*/

/*
int h = 1;
h = ++h; //规则使用临时变量：（1）h = h + 1;（2）temp = h;（3）h = temp;
System.out.println(h); // 2 
*/

/*前++：++i先自增后赋值
 后++：i++先赋值后自增 */

int i1 = 10;
int i2 = 20;
int i = i1++;
System.out.print("¡=" + i); // 10 //  i1-> 11 // ln是换行，不加ln就不换行
System.out.println("¡2=" + i2); // 20
i = --i2;
System.out.println("¡= " + i); // 19
System.out.println("¡2= " + i2); // 19

       }
}
