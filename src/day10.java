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

public class day10 {
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
}