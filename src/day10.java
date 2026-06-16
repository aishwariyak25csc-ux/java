import java.util.ArrayList;

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
}
