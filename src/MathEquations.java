public class MathEquations {


    int a;
    int b;
    MathEquations(){
        a=0;
        b=0;
    }
    private void justPrint(){
        System.out.println("result successfully processed");

    }
    int  execute( int a, int b)
    {
        justPrint();// private methods can be used inside the same class only
        // public can be used withing teh class that are in the same package

        return a+b;
        //
    }

    // java automatically creates a empty class


}
