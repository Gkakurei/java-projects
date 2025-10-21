public class ForceConvertDetail {
    public static void main(String[] args) {
        //演示强制类型转换
        //int x = (int)10*3.5+6*1.5; //错误, double => int
        int x = (int)(10*3.5+6*1.5); //int(40.0) => 40
        System.out.println(x);//40

        char c1 = 100;
        int m = 100;
        //char c2 = m; 错误
        char c3 = (char)m; //ok
        System.out.println(c3);//100对应的字符----d
    }
}
