import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) { 
            System.out.print("Enter no. of Subejcts = ");
            int n = sc.nextInt();
            System.out.println();
            if(n > 0){
                float marks[] = new float[n];5
                

                for(int i = 0; i < n; i++){
                    System.out.print("Subject "+(i+1)+" marks - ");
                    marks[i] = sc.nextInt();
                    if(marks[i] < 0 || marks[i] > 100){
                        System.out.println("Enter valid marks...\nRe-enter...\n");
                        i--;
                        continue;
                    }
                }
                float totalMarks = 0;

                for(float element: marks){
                    totalMarks += element;
                }

                System.out.println("Total = " +totalMarks+"/"+(n*100)+"\n");
                float percentage = 100*(totalMarks/(n*100));
                System.out.println("Percentage = "+percentage+"%");

                if(percentage<=100 && percentage>80){
                    System.out.println("Grade - A\n");
                }
                else if(percentage<=80 && percentage>60){
                    System.out.println("Grade - B\n");
                }
                else if(percentage<=60 && percentage>45){
                    System.out.println("Grade - C\n");
                }
                else if(percentage<=45 && percentage>33){
                    System.out.println("Grade - D\n");
                }
                else{
                    System.out.println("Grade - E\n");
                }
            }
            else{
                System.out.println("Enter valid no. of subjects...\nTry Again...\n");
                continue;
            }
            break;
        }
    }
}