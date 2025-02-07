package FileHandling.Challenges;

/*
File not fount exception handling
  Write a program to read a filename from the user and dispplay its
  content the program should handle the situation where the file
  does not exist.
   key point :
   . User Scanner to read the filename form the user
   . User FileReader to read the file content
   . Implement a try - catch block to handle FileNotFountException.
   . Display a message informaing the user the user if the file is not found
 */
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RobustFileReader {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the name of the file name you wish to read ");
        String fileName = input.next();
        try(FileReader reader = new FileReader(fileName)){
            int read;
            while ((read = reader.read()) != - 1){
                System.out.println((char) read);
            }
        } catch (IOException exception){
            System.out.printf("Exception OCcured: %s",exception.getMessage());
        }







    }

}
