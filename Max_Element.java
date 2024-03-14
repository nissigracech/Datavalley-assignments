import java.util.*;
public class Max_Element
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    System.out.print("Enter the size of the array : ");
	    int size=input.nextInt();
	    System.out.print("Enter the elements of the array : ");
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
		    arr[i]=input.nextInt();
		}
		int max_element=arr[0];
		for(int i=1;i<size;i++){
		    if(arr[i]>max_element){
		        max_element=arr[i];
		    }
		}
		System.out.println("Maximum element in the array : "+max_element);
		
	}
}
