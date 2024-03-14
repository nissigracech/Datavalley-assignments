import java.util.*;
public class Math_Operations {
	public int add(int num1,int num2) {
		return num1+num2;
	}
	public double add(double a,double b,double c) {
		return a+b+c;
	}
	public String add(String str1,String str2) {
		return str1+str2;
	}
	public static void main(String args[]) {
		Math_Operations obj=new Math_Operations();
		System.out.println(obj.add(10,30));
		System.out.println(obj.add(2.5,4.5,8.9 ));
		System.out.println(obj.add("Concatinate"," two strings"));
	}
}
