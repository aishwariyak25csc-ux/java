import java.util.LinkedList;

/*import java.util.ArrayList;

public class day10 {
    static void main(){
        String[] students={"gopiha","nafeela","prasanya","aishu","yazhini"};
        ArrayList<String>list=new ArrayList<>();
        list.add("gopiha");
        list.add("nafeela");
        list.add("prasanya");
        list.add("aishu");
        list.add("yazhini");
        for(String s:list) {
            System.out.print(s);
        }
        list.remove("aishu");
        System.out.println();
        for(String s:list){
            System.out.print(s);
        }
    }
}*/
import java.util.LinkedList;

/*public class day10 {
    static void main() {
        LinkedList<String> queue = new LinkedList<String>();
        queue.add("aishu");
        queue.add("monisha");
        queue.add("devi");
        queue.add("gopiha");
        queue.add("nafeela");
        while(!queue.isEmpty()) {
            process(queue);
        }
    }
    static void process(LinkedList<String> queue){
        String removed=queue.removeFirst();
        System.out.println("Removed:"+removed);

    }
}*/
import java.util.LinkedList;
        class Student{
            String name;
            int regno;
            int marks;
            Student(String name ,int regno,int marks){
                this.name=name;
                this.regno=regno;
                this.marks=marks;
            }
            @Override
            public String toString(){
                return "Name:"+name+
                        ",regno:"+regno+
                        ", Marks:"+marks;
            }}
        public class day10{
            static void main(){
                LinkedList<Student>students=new LinkedList<>();
                students.add(new Student("Aishu",101,85));
                students.add(new Student("ram",102,90));
                students.add(new Student("pooja",103,87));
                students.add(new Student("megha",104,78));
                students.add(new Student("ravi",105,89));
                System.out.println();
                for(Student s:students){
                    System.out.println(s);
                }
                students.removeFirst();
                System.out.println("\nAfter removing first student");
                for(Student s:students){
                    System.out.println(s);
                }
                String searchvalue="Ravi";
                for(Student s:students) {
                    if (s.name.equalsIgnoreCase(searchvalue)) {
                        s.marks = 95;
                        break;
                    }
                }
                System.out.println("\nAfter updating Ravi's marks:");
                for(Student s:students){
                    System.out.println(s);

                }
            }
        }
