//Bubble short
import java.util.*;
class BubbleShort{
	public static void shortarray(int arr[]){
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void print(int arr[]){
		System.out.println("The shorted array is:: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:: ");
		int n=sc.nextInt();
		int num[]=new int[n];
		System.out.println("Enter the array element:: ");
		for(int i=0;i<num.length;i++){
			num[i]=sc.nextInt();
		}
		shortarray(num);
		print(num);
	}
}