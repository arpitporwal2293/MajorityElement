
public class MajorityElement {
	
	//Moore’s Voting Algorithm
	public static int findMajority(int[] arr){
		int index=0;
		int count=1;
		for(int i=1;i<arr.length;i++){
			if(arr[index]==arr[i])
				count++;
			else
				count--;
			if(count==0){
				index = i;
				count=1;
			}
		}
		return arr[index];
	}
	
	public static boolean isMajority(int[] arr,int mElement){
		int count = 0;
		for(int i=0;i<arr.length;i++){
			if(mElement == arr[i])
				count++;
		}
		if(count>=arr.length/2)
			return true;
		else
			return false;
		
	}
	
	public static void majority(int[] arr){
		int majorityElement = findMajority(arr);
		if(isMajority(arr,majorityElement)){
			System.out.println(majorityElement);
		}else{
			System.out.println("no majority element");
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 3, 3, 1, 3};
		majority(arr);
	}

}
