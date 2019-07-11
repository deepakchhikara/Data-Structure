
public class InsertingArray {
 
	static int arr[]= {10,20,30,8,90};
	int n=3;
	int key= 25;
	int insert() {
	
			if(arr[3]==key) {
			return 1;	
			}	
		
		return 0;
	}
	
	
	
	public static void main(String[] args) {
		InsertingArray ia= new InsertingArray();
		ia.insert();
		
System.out.println(arr);
	}

}
