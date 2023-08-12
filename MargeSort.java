import java.util.*;
class MargeSort{
	public static void devide(int arr[],int si,int ei){
		if(si>=ei)
			return;
		int mid=si+(ei-si)/2;
		devide(arr,si,mid);
		devide(arr,mid+1,ei);
		concure(arr,si,mid,ei);
	}
	public static void concure(int arr[],int si,int mid,int ei){
		int m[]=new int[ei-si+1];
		int c=0;
		int indx1=si;
		int indx2=mid+1;
		while(indx1<=mid && indx2<=ei){
			if(arr[indx1]<=arr[indx2])
				m[c++]=arr[indx1++];
			else
				m[c++]=arr[indx2++];
		}
		while(indx1<=mid)
			m[c++]=arr[indx1++];
		while(indx2<=ei)
			m[c++]=arr[indx2++];
		for(int i=0,j=si;i<m.length;j++,i++)
			arr[j]=m[i];
	}
	public static void printArray(int arr[]){
		System.out.println("*****************");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"\t");
		System.out.println();
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:: ");
		int n=sc.nextInt();
		int nums[]=new int[n];
		System.out.println("Enter the elements of array:: ");
		for(int i=0;i<n;i++)
			nums[i]=sc.nextInt();
		devide(nums,0,n-1);
		printArray(nums);
	}
}