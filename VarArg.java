package Collection_Framework.Challenges;

/*
Write a method Concatenate String that takes varialble argument
Of String types and concatenates them into a single String

 */
public class VarArg {
    public static void main(String[] args) {
        System.out.println(concatenate("Lalit"));
        System.out.println(concatenate("Shinde", "Engineer"));
        System.out.println(concatenate("Lalit","2","3"));

    }
        public static String concatenate(String... strs){
        StringBuilder sb = new StringBuilder();
         for(String str : strs){
             sb.append(str).append(" ");
         }
         return sb.toString();

    }

}
