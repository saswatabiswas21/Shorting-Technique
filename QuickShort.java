import java.util.*;
class QuickShort{
	public static int parti(int arr[],int low,int high){
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++){
			if(arr[j]<pivot){
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		i++;
		int temp=arr[i];
		arr[i]=arr[high];
		arr[high]=temp;
		return i;
	}
	public static void Shortarray(int arr[],int low,int high){
		if(low<high){
			int pivotpos=parti(arr,low,high);
			
			Shortarray(arr,low,pivotpos-1);
			Shortarray(arr,pivotpos+1,high);
		}
	}
	public static void show(int arr[]){
		System.out.println("The sorted array is:: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}		
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of the array:: ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		Shortarray(arr,0,n-1);
		show(arr);
	}
}