import java.util.*;
public class Sorting_Count
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    System.out.print("Enter the size of the array : ");
	    int n=input.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the elements in the array : ");
		for(int i=0;i<n;i++){
		    arr[i]=input.nextInt();
		}
		int temp=0;
		for(int i=0;i<n-1;i++){
		    for(int j=0;j<n-i-1;j++){
		        if(arr[j]>arr[j+1]){
		            temp=arr[j];
		            arr[j]=arr[j+1];
		            arr[j+1]=temp;
		        }
		    }
		}
		System.out.print("Sorted Array : ");
		for(int i =0;i<n;i++){
		System.out.print(arr[i]+" ");
		}
	    System.out.println(" ");
		System.out.print("Enter the number to count the occurences : ");
		int count_num =input.nextInt();
		int count =0;
		for(int i =0;i<n;i++){
		    if(count_num == arr[i]){
		        count +=1;
		    }
		}
		System.out.println("Occurence of "+count_num+" in array is : "+count);
	}
}
