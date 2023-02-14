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
class MinHeap{
     public static void main(String[] args) {

        Student s1 = new Student("Ashutosh",68,63841);
        Student s2 = new Student("Arin",87,63782);
        Student s3 = new Student("Devansh",93,97563);

        PriorityQueue<Student> minHeap = new PriorityQueue<Student>((a,b)-> a.marks - b.marks);
        minHeap.offer(s1);
        minHeap.offer(s2);
        minHeap.offer(s3);
        System.out.println(minHeap.poll().name);    
        System.out.println(minHeap.poll().name);  
        System.out.println(minHeap.poll().name);      
    } 
}