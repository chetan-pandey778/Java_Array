import java.util.Scanner;
public class array_2d {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
         System.out.println("Enter the no. of rows in your array");
        int rowsize = sc.nextInt();
         System.out.println("Enter the no. of colms in your array");
        int colmsize = sc.nextInt();
        int numbers [][] = new int[rowsize][colmsize]; 

        for(int i=0;i<rowsize;i++){
            for(int j=0;j<colmsize;j++){
                numbers[i][j]=sc.nextInt();

            }
        }
        for(int i=0;i<rowsize;i++){
            for(int j=0;j<colmsize;j++){
                System.out.print(numbers[i][j] +" ");
            }
            System.out.println();

        }        
         
    }
    
}
