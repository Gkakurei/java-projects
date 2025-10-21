public class FloatDetail {
    public static void main(String[] args) {
        //Java的浮点型常量（具体值）默认为double型，声明float型常量须后加F或f
      double num4 = 1.1F;

    System.out.println(5.12e2);
    System.out.println(5.12E-2);

    double num9  = 2.1234567851;
    float num10  = 2.1234567851F;

    System.out.println(num9);
    System.out.println(num10);

//浮点数使用陷阱： 2.7和8.7/3 比较
//看看一段代码
double num11 = 2.7;
double num12 = 8.1 / 3; //2.7
System.out.println(num11);// 2.7
System.out.println(num12);// 接近2.7的一个小数，而不是2.7
//得到一个重要的使用点：当我们对运算结果是小数的进行相等的判断时，要小心
//应该是以两个数的差值的绝对值，在某个精度范围内来判断
if (num11 == num12) {
    System.out.println("num11 == num12 相等");
    }

//正确的写法，ctrl+/ 注释快捷键，再次输入就取消注释
if(Math.abs(num11 - num12) < 0.000001){
    System.out.println("差值非常小，到我的规定精度，认为相等...");
 }

//可以通过java API 来看
System.out.println(Math.abs(num11 - num12));

//细节：如果是直接查询得到的小数或者直接赋值，是可以判断相等
    }

}
