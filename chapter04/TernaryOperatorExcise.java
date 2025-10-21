public class TernaryOperatorExcise {
    
    public static void main(String[] args) {
        
// 思路
// 1. 先得到n1 和 n2 中最大数，保存到max1
// 2. 然后再求出max1 和 n3 中的最大数，保存到max2
        int n1 = 553333;
        int n2 = 33;
        int n3 = 123;

        int max1 = n1 > n2 ? n1 : n2;
        int max2 = max1 > n3 ? max1 : n3;

        System.out.println("最大值=" + max2);
       
        // 使用一条语句实现，推荐使用上面的
       int max = (n1 > n2 ? n1 : n2) > n3 ? 
               (n1 > n2 ? n1 : n2) : n3;

        System.out.println("最大值=" + max);
       

       /*自己写的 错误：int max = n1 > n2 ? n1 : n3;
        System.out.println("最大值=" + max);
        */
    }
}