void main() {
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
}