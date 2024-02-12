import java.util.Scanner;
class Greatest_num{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the size of the array :");
      int size=sc.nextInt();

      int[] numbers=new int [size];
    
      System.out.println("Enter number at index :");
    // This code block is used to take user input and populate the array `numbers` with the entered
    // values.
      for(int index=0; index<size;index++){
         System.out.print(index+" : " );
         numbers[index] = sc.nextInt();
        }

      // This code block is finding the largest number in the array `numbers`.
       int largestNumber=numbers[0];
       for(int index=1; index<size; index++){
         if(numbers[index]>largestNumber){
            largestNumber=numbers[index];
        }
      }
        // `System.out.println("The largest number in the Array is:"+largestNumber);` is printing the
        // message "The largest number in the Array is:" followed by the value of the variable
        // `largestNumber`. This line of code is used to display the largest number found in the array
        // to the user.
        System.out.println("The largest number in the Array is:"+largestNumber);
        sc.close();
    }
}