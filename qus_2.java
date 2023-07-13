// find maximum value of array
public class qus_2{
    public static void main(String [] args){
        int temp=0;
        int arr [] ={1,5,3};
        for(int i=0;i<3;i++){
            if(temp<arr[i]){
                temp=arr[i];
               
            }
           
            
        }
        System.out.println("the maximum value in array is:"+temp);
    }
}