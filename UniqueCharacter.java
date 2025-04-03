package Collection_Framework.Challenges.CollectionClassSp;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/*
write a program that takes a string  and
returns the number of uniques characters using a set
 */
public class UniqueCharacter {
    public static void main(String[] args) {
        Set<Character> unique = new HashSet<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Plese enter the String : ");
        String userStr = input.next();
        for(char ch : userStr.toCharArray()){
            unique.add(ch);
        }
        System.out.printf("Your String has %d Unique Characters",
        unique.size());
    }
}
