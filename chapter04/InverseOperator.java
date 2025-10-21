public class InverseOperator {
    
    public static void main(String[] args) {
        
     //！操作是取反 T -> F, F -> T
     System.out.println(60 > 20); // T
     System.out.println(!(60 > 20)); //F

     //a^b: 叫逻辑异或，但a和b不同时，则结果为true，否则为false
     boolean b = (10 > 1) ^ (3 < 5);
     System.out.println("b=" + b); // F

     
     //练习题
     //1
     int x = 5;
     int y = 5;
     if(x++==6 & ++y==6){// 逻辑与（F，T ）
             x =11; // 这个是结果，上面的if能执行了才会出这个x=11
     }
     System.out.println("x=" + x + ",y=" + y); // 错误 x=11 y=6。正确： x=6 y=6

    }
    //2
     int x = 5;int y = 5;
     if(x++==6 && ++y==6){//F x=6
             x =11; // 这个是结果，上面的if能执行了才会出这个x=11
     }
     System.out.println("x=" + x + ",y=" + y); // 自己正确 x=6 y=5。

     //3
    int x = 5;int y = 5;
     if(x++==5 | ++y==5){//逻辑或
             x =11; //错： F x=6; F y=6 正确：T 为真后自变+1 x=6 F y=6
     }
     System.out.println("x=" + x + ",y=" + y); // true x=11，y=6

     //4
     int x = 5;int y = 5;
     if(x++==5 || ++y==5){// T x=6；
             x =11; // 这个是结果，上面的if能执行了才会出这个x=11
     }
     System.out.println("x=" + x + ",y=" + y); // true x=11,y=5 

    //练习题2
    boolean x = true;
    boolean y = false;
    short z = 46;
    if((z++==46)&&(y=true)) z++; // 短路与 T z=47 T z=48 // y是赋值 我不要判断 ，上下if是链接关系
    if((x=false)||(++z==49)) z++; // 短路或 错误F z=47 正确：F x=false  z=49 T 为 T后，再执行z++ z=50
    System.out.println("z="+z); //错误：z=47，正确：T z=50



    }
}
