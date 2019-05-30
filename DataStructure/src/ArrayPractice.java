
public class ArrayPractice {
	int i=0;
	int arr[]= {10,80,20,38,78,29};
	int n=6;
	int key= 38; // we have to search 38 in the above created array
	int elementFind() 
	{
	for(i=0; i<n; i++)
	{
		if(arr[i]==key) {
			
			System.out.println("It's True");
		}
	}
		return i;
	}

	public static void main(String[] args) {
		
ArrayPractice ap= new ArrayPractice();
ap.elementFind();
		
	}

}
