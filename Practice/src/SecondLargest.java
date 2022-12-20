
public class SecondLargest {

	public static void main(String[] args) {
		int temp;
		// TODO Auto-generated method stub
		int arr[] ={2,3,44,32,32,45,100,101,201,21,3,5};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{		System.out.println(arr[i]);
		}
		System.out.println("Second Highest is"+arr[1]);
		}

	}


