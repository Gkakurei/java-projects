/*课堂练习：
ob110001100转成十进制 
* 二进制 
02456 转十进制
* 八进制
0xA45 转成十进制
* 十六进制
*/

public class BinaryTest {
    public static void main(String[] args) {

        int a = 0b110;
        int b = 024;
        int c = 0xA4;
        
        System.out.println(0b110001100);
        System.out.println(02456);
        System.out.println(0xA45);

 /*
 123 转成二进制 => 0b01111011
678 转成八进制 => 01246
8912 转成十六进制 => 0x22D0
 
 */       
        int i1 = 123;
     
        System.out.println(123); // 0b01111011
        System.out.println(678); // 01246
        System.out.println(8912); // 0x22D0 

        



    }
}
