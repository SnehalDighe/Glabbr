public class OPerationOnArray {
 
    public static void main(String a[]){

//Common Elements in aaray
        int[] arr1 = {4,1,7,3,9,2,66};
        int[] arr2 = {3,2,12,9,66,40,32,4,1};
System.out.println("Common Elements In array");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                     
                    System.out.println(arr1[i]);
 }
}
}




//Smallest And largest element in array
  int numbers[] = new int[]{32,43,53,54,32,65,63,98,43,23,99,78,100,398,4};
               
               
                int smallest = numbers[0];
                int largetst = numbers[0];
               
                for(int k=1; k< numbers.length; k++)
                {
                        if(numbers[k] > largetst)
                                largetst = numbers[k];
                        else if (numbers[k] < smallest)
                                smallest = numbers[k];
                       
                }
               
                System.out.println("Largest Number is : " + largetst);
                System.out.println("Smallest Number is : " + smallest);
               
           
        
    }
}
