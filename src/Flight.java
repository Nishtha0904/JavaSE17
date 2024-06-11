public class Flight {




    // this is example of Chaning of constructors
    int passengers;
    int seats;
     double perBagFee=8;
     static int number=1;
    Flight(double perBagFee)
    {
        this.perBagFee=perBagFee;

    }
    Flight(int passengers)
    {
        this(passengers>1?5.0:8.0);
        this.passengers=passengers;

    }

    Flight(int passengers, int seats)
    {
        this(passengers);
        this.seats=seats;

    }
    public void addBy1(){
        number+=1;
    }
    public static int getName(){
        return number;
    }
    public void printAll(){
        System.out.println("All the parameters are "+"seats :"+seats+
                "passengers :"+passengers +"perBagFee :"+perBagFee);
    }




    //whenever we pass object as parameter in any method then copy of reference are made through that only
    // the methods deals with . if we try to swap the value of both object it will possible just inside
    // that method but not outside bcz in methods copy of reference are made and not tha references presnt itself
    /*
    even though the references remain the same of every object instance  but this when
    we are passing the object in any method then in that case fields of same objects can be changed

     */


   








}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             