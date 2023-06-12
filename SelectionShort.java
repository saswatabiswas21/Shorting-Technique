import java.util.*;
class SelectionShort{
	public static void shortarray(int arr[]){
		for(int i=0;i<arr.length-1;i++){
			int small=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[small]>arr[j])
					small=j;
			}
			int temp=arr[small];
			arr[small]=arr[i];
			arr[i]=temp;
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