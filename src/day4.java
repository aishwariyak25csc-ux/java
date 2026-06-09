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
void main() {
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

}