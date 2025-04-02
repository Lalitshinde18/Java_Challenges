public class variable_arguments {


    static int sum (int a , int b, int c ){

        return  a+b+c;
    }
//    static int sum (int ... arr){
//    //  Avalable  int []a;
//
//    }


    public static void main(String[] args) {
        System.out.println("welcome to variable argument tutorial");
        System.out.println("the sum of 4 and 5 is : "+sum(4,5,6));

    }
}
