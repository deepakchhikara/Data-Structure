
public class ReverseArray {
	
	int arr[]= {1,2,3,4,5};
	int n=0;
	
	int reverse() 
	{ 
		for(int i=5; i>n; i--) 
		{
			System.out.println(i);
			
		}
		return 1;
	}

	public static void main(String[] args) {
		ReverseArray ra= new ReverseArray();
		ra.reverse();

	}

}
