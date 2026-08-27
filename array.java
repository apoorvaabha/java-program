public class array {
    public static void main(String[] args) {
        //marks -> 5
        int[] marks = new int [5];          //one dimensional array
        marks[0] = 75;                      // 0-> marks of student 1
        marks[1] = 80;                      // 1-> marks of student 2
        marks[2] = 79;                      // 2-> marks of student 3
        marks[3] = 78;                      // 3-> marks of student 4
        marks[4] = 85;                      // 4-> marks of student 5
     //system.out.println(marks[4]);      
     //iterate
     //average
     //add/5
     //for
     int sum = 0;
     for (int i = 0; i < marks.length; i++) {
         sum = sum + marks[i];
        }
        float avg;
        avg = sum / marks.length;
        System.out.println("Average marks: " + avg);
        }
    }
