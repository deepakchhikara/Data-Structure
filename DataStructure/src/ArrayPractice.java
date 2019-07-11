
public class ArrayPractice {
	
	    
		int arr[]= {10,80,20,38,'D',78,29};
		int n=6; //we are taking 6 because we have six index
		int key= 'D'; // we have to search 38 in the above created array
	int elementFind() 
	{
	for(int i=0; i<n; i++)// i is counting index here.
	{
		if(arr[i]==key) {
			
			System.out.println("Index" + ' '+ i);// 3rd Index showing our searched value
		}
	}
		return -1;
	}

	public static void main(String[] args) {
		
    ArrayPractice ap= new ArrayPractice();
     ap.elementFind();
		
	}

}
