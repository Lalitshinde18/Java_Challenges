package Collection_Framework.Challenges.CollectionClassSp;

import java.util.Comparator;
import java.util.PriorityQueue;

public class StudentPriorityQueue {
/*
Create a PriorityQueue of a custom class Student with attributes
name and grade . use a comparator to order by grade
 */

    public static void main(String[] args) {

        PriorityQueue<student> queue = new PriorityQueue<>(new Comparator<student>() {
            @Override
            public int compare(student student, student t1) {
                return student.getGrade() - t1.getGrade() ;
            }
        });

        queue.offer(new student("Lalit",'A'));
        queue.offer(new student("Rohan",'B'));
        queue.offer(new student("Mahesh",'C'));
        queue.offer(new student("sakshi",'F'));
        queue.offer(new student("Gauri",'D'));
        System.out.printf("Queue is: %s",queue);
        System.out.printf("Queue is: %s\n",queue.poll());
        System.out.printf("Queue is: %s\n",queue.poll());
        System.out.printf("Queue is: %s\n",queue.poll());
        System.out.printf("Queue is: %s\n",queue.poll());
        System.out.printf("Queue is: %s\n",queue.poll());





    }





    private static class student {



        private final  String name;

        private final   char grade;

        public student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public char getGrade() {
            return grade;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return name + ": " + grade;
        }
    }

}
