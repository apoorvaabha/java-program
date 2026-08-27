public class twodarray { 
    public static void main(String[] args) {

        int st_marks[][] = {{76,78,79,67,67},{67,89,79,88,76},{77,79,86,90,78},{67,78,88,76,77},{77,89,80,70,76}};


        // total marks
        // for loop nested


        for (int i = 0; i < st_marks.length; i++) {   // outer
            int sum = 0;
            for (int j = 0; j < st_marks[i].length; j++) {
                sum = sum + st_marks[i][j];           //[0][0] -> [0][1] -> [0][2] -> [0][3] -> [0][4] 
       
        }
    
        System.out.println("Total marks of student " +i+": " + sum);
        }
    }
    
}
