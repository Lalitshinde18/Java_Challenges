
package Challenges_Solving_Problems84;

/*
In a class Calculator , crate multiple add()  methods that
overload each other and can sum two integer , three  integer , or two dobule 
demostrate how each can be called with diffrent number of parameters.
 */

public class Calculator {

    public int add(int first , int second){
        return first + second;

    }
    public int add(int first , int second , int third){
        return first + second + third;
    }

    public  double add(double first , double second ){
        return  first + second;
    }

    public static void main(String[] args) {
        Calculator cl = new Calculator();
        System.out.println(cl.add(20,20));
        System.out.println(cl.add(20.2,20.1));
        System.out.println(cl.add(20,20,10));
    }

}
