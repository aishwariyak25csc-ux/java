/*void main() {
    int[][] marks = new int[5][3];
    int[][] studentmarks = {
            {67, 89, 90},
            {45, 78, 67},
            {34, 56, 87},
            {23, 54, 78},
            {45, 75, 86}
    };
    for (int row = 0; row < studentmarks.length; row++) {
        for (int column = 0; column < studentmarks[row].length; column++) {


            System.out.print(studentmarks[row][column] + " ");
        }
        System.out.println();
        }
}*/
/*void main() {
    int[][] attendance=new int[5][3];
    int[][] studentattendance={
            {0,1,0},
            {1,0,0},
            {1,1,1},
            {1,0,1},
            {0,0,0}
    };
    for(int row=0;row< attendance.length;row++){
        System.out.print("Student"+(1+row)+":");
        for(int column=0;column<studentattendance[row].length;column++){
            if(studentattendance[row][column]==1){
                System.out.println("class"+(1+column)+":present");
            }else{
                System.out.println("class"+(1+column)+":absent");
            }
        }
        System.out.println(" ");
    }

}*/
/*void main(){
    int result = div(5,4);
    System.out.println(result);
    System.out.println(div(5,5));

    }
    public int div(int a,int b){
    return a/b;
}*/
/*void main(){
    String name ="vetias";
    System.out.println(name .toLowerCase());
}
 */
void main(){
    System.out.println("Enter your name:");
    Scanner sc=new Scanner(System.in);
    String name=sc.nextLine();
    System.out.println("Enter your department:");
    String department=sc.nextLine();
    System.out.println("Enter your age:");
    int age=sc.nextInt();
}
