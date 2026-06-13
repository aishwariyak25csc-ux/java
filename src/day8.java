public class day8 {
    record courseRecord(String courseName, String department) {
    }
    static void main(){
        courseRecord courseRecord=new courseRecord("java","BSC CS");
        System.out.println(courseRecord.courseName());
        System.out.println(courseRecord.department());

    }
}