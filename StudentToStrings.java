public class StudentToStrings {



    String name;

    int age;

    String rollNumber;

    String house;

    public StudentToStrings(String name, int age, String rollNumber, String house) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.house = house;
    }

    @Override
    public String toString(){
        return "Student Details :{name: "+ name 
                +" "+ age +", age:"+ rollNumber +", roll number: "+ house +", house: }";
    }



    public static void main(String[] args) {
        StudentToStrings stu = new StudentToStrings("rahul", 16, "30", "lalit house");
        System.out.println(stu);
    }

}
