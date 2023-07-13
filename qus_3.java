import java.util.Scanner;
public class qus_3{
    public static void main(String [] args){
        int arr[] ={1,5,3};
        System.out.println("enter the value of x who you want to find");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(x==arr[i]){
                System.out.println("the value of "+x+" is foud at index no. "+i);
            }
        }

    }

}