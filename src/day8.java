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
    /*enum DEPARTMENT{
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
}*/
sealed interface LoginResult permits LoginSuccess, LoginFailure, LoginLoading {
}
record LoginSuccess(String time) implements LoginResult {
}
record LoginFailure(String reason)  implements LoginResult {
}
record LoginLoading(String expectedTime)  implements LoginResult {
}
record Random(String reason){
}
static void handleLogin(LoginResult result) {
    switch (result) {
        case LoginSuccess success -> System.out.println("Login Success at : " + success.time());
        case LoginFailure failure -> System.out.println("Login Failure because of " + failure.reason());
        case LoginLoading loading -> System.out.println("Login Loading, " + loading.expectedTime());
    }
}
static void main() {
    LoginResult LoginSuccess = new LoginSuccess("2026-06-13:03:03:10");
    LoginResult LoginFailure = new LoginFailure("Insufficient balance");
    LoginResult LoginLoading = new LoginLoading("Check after 5 hours");
    handleLogin(LoginSuccess);
    handleLogin(LoginFailure);
    handleLogin(LoginLoading);
}}






