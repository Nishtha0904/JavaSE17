
import java.util.Scanner;
public class Main {
    public static int calSum(int a, int b)
    {
        return (a+b);

    }
    public static void main(String[] args) {

//        System.out.println("Hello world!");
//
//
//        //Any variable name should be in camel case
//        //for ex-myVar
//        int myVar=50;
//        final int myFinalVar=56;
//        long x=89999L;
//        float kilometersInLength=67.89f;
//        //double is having more range for decimals value
//        double y=678.89d;
//        char test='u';
//
//        System.out.println(++myVar);
//        System.out.println(myVar);
//        System.out.println(myVar++);
//        System.out.println(myVar);
//
//        //Operators Precedence
//        int val1=5;
//        int val2=3;
//        int val3=8;
//
//        System.out.println(val1+val2/val3);
//        System.out.println((val1+val2)/val3);
//
//        //Type Conversions
//        float s =5.6f;
//        int t= (int) s;
//        System.out.println(t);
//        //variable should be declared same time when its declared
//        byte b=9;
//        int i=b;
//        System.out.println(i);
//        int value1=3;
//        int value2=6;
//
//        char c='g';
//        String name;
//
//        switch(c){
//            case 'a':
//                System.out.println(c);
//            case 'g':
//                System.out.println(c);
//
//        }
//         int[] check =new int[]{7,8,9};
//        for( int u:check)
//        {
//            System.out.println(u);
//        }
//
//        System.out.println(calSum(4,5));
//
//        String s1="I love java";
//        String s2="I love java";
//        if(s1==s2)
//        {
//            System.out.println("both the strings refrence to same thing actually they carry same memory ");
//        }
//        else {
//            if(s1.equals(s2))
//            {
//                System.out.println("they are character by character same although they hold different memory ");
//
//            }
//        }
//
//        int f=100;
//        String J=String.valueOf(100);
//
//
//        //StringBuilder
//        //can build the string piece by piece
//
//        StringBuilder sb =new StringBuilder(40);
//        sb.append("i love to ");
//        sb.append("ukranine");
//        String result =sb.toString();
//        System.out.println(result);
//
//        MathEquations mt=new MathEquations();
//        Scanner st=new Scanner(System.in);
//        int firstNumber=st.nextInt();
//        int secondNumber=st.nextInt();
//
//
//
//        System.out.println(mt.execute(firstNumber, secondNumber));


        Flight fl=new Flight(3,4);
        Flight fl2=new Flight(7,8);


        fl.printAll();
        System.out.println(fl.getName());
        fl.addBy1();
        fl.addBy1();

        System.out.println(fl2.getName());
        //Static members
        //Static fields-- all declared within the class , they will be having same value for each instance
        //Static initialization block perform one time type initialization
        //before the class is being used that time static block task is being performed


        // difference between , equals and== methods
        Flight fl3=new Flight(8,1);
        Flight fl4=new Flight(8,1);
        //.equals methods returns true if all the attributes oof those two instance of object are same
        if(fl3.equals(fl4)==true)
        {
            System.out.println("equals methods");
        }
        else{
            System.out.println("no operations");
        }

        if(fl3==fl4)
        {
            System.out.println("comparing operator, they both are not pointing to the same instance ");

        }

        // course-3 module -5
        //module-6
        //11-june-2024---course-3 module-6



    }
}