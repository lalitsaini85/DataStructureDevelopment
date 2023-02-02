package OOPs.thisKeyword;

/**
 * Created by IntelliJ IDEA.
 * User: Lalit Saini (lalitsaini85)
 * Date: 1/31/2023
 * Time: 3:20 PM
 * File Name : Basic.java
 */
public class Basic {
    public static void main(String[] args) {
        /*Base1 base = new Base1(2,3);
        System.out.println(base.b1) ;

        System.out.println(Base1.Base2.bs2);
        */
        Test t = new Test();
        t.fun();
        System.out.println();

    }
}

/*class Base1{
    int b1;
    int b2;
    public Base1(int b1, int b2){          //Constructor can not be static, and also class.
        this.b1 = b1;
        this.b2 = b2;
    }
     class Base2{
        static int bs2;
        Base2(int bs2){
            this.bs2 = bs2;
        }
    }
}*/
class Test {
    static int a = 10;
    static int b;
    int c;

    static void fun() {          //Non static can have static But static cannot have non-static.
        a = a * 4;
        // c = a*4;        // Non-static field 'c' cannot be referenced from a static context
    }
}
