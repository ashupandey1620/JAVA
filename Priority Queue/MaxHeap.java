import java.util.*;

class Student{
    String name;
    int marks;
    int mobile;
    public Student(String string ,int marks ,int mobile)
    {
        this.name = string;
        this.marks =  marks;
        this.mobile = mobile;
    }
}
class MaxHeap{
     public static void main(String[] args) {

        Student s1 = new Student("Ashutosh",68,63841);
        Student s2 = new Student("Arin",87,63782);
        Student s3 = new Student("Devansh",93,97563);

        PriorityQueue<Student> maxHeap = new PriorityQueue<Student>((a,b)-> -a.marks + b.marks);
        maxHeap.offer(s1);
        maxHeap.offer(s2);
        maxHeap.offer(s3);
        System.out.println(maxHeap.poll().name);    
        System.out.println(maxHeap.poll().name);  
        System.out.println(maxHeap.poll().name);      
    } 
}