/*public class day10_ex {
    static void main(){
        String name=null;
        try{
            System.out.println(name.charAt(0));
            System.out.println(55/0);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index Out of Bounds Exception");
        }catch (Exception e){
            System.out.println("Exception");
        }finally {
            System.out.println("This will always execute");
            name="";
        }
        System.out.println("Still running");
        System.out.println("Name:"+name);
    }
}*/
public class day10_ex {
    static void main(){
        String name="dyro";
        try {
            System.out.println(name.charAt(2));
            System.out.println(4/0);

        }
        catch(NullPointerException e){
            System.out.println("there is an nullpointer exception");
        }
        catch (Exception e){
            System.out.println("there is an exception");
        }
        finally {
            System.out.println("remaining code will be executed");
        }

    }
}

