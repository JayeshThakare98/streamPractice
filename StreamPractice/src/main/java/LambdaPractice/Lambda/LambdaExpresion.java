package LambdaPractice.Lambda;

public class LambdaExpresion {
    public static void main(String[] args) {
        MyInter myInter = () -> System.out.println("This is first time I am using lambda ");
// calling lambda
        myInter.sayHello();

//        SumInter sumInter = (int a ,int b ) -> {return  a+b;};
        SumInter sumInter = (a, b) -> a + b;
        System.out.println(sumInter.sum(10, 10));

        Lengthinterf lengthinterf = (str) -> str.length();
        System.out.println(lengthinterf.getLengthOfString("abcd"));
    }

}
