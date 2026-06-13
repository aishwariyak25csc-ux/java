/*public class day8{
    record CourseRecord(int course,int dept){
    }
    static void main(){
        CourseRecord courserecord=new CourseRecord(123,34);
        System.out.println(courserecord.course());
        System.out.println(courserecord.dept());
    }
}*/




/*public class day8 {
    enum LANGUAGES{
        EN("English"),
        GR("German"),
        JP("Japanese"),
        TA("Tamil");
        String description;
        LANGUAGES(String description){
            this.description=description;
        }

    }
    static void main(){
        System.out.println(LANGUAGES.EN.description);
    }
}*/

public class day8 {
    enum DEPARTMENT{
        CS("computer science"),
        AI("Artificial intelligence"),
        AIDS("Artificial intelligence and data science"),
        CSA("Computer science and applications ");
        String description;
        DEPARTMENT(String description){
            this.description=description;
        }



    }
    static void main(){
        System.out.println(DEPARTMENT.CS.description);
    }
}


