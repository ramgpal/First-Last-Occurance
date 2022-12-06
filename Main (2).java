public class Main
{
    // Write A function to find first occurance of an element in an given array 
    public static int FirstOccurance(int arr[],int key,int i) {
        if(i==arr.length) {
            return -1;
        }
           if(arr[i]==key) {
               return i;
           } 
            
        
        return FirstOccurance(arr,key,i+1);
    }
    // Write A function to find last occurance of an element in an given array 
     public static int LastOccurance(int arr[],int key,int i) {
         if(i==arr.length) {
             return -1;
         }
        int LastIndex=LastOccurance(arr,key,i+1);
        if(LastIndex==-1 && arr[i]==key) {
            return i;
        }
         return LastIndex;
     }
	public static void main(String[] args) {
		int arr[]={8,3,6,9,5,10,2,5,3};
		int key=5,i=0;
		System.out.println(FirstOccurance(arr, key, i));
		System.out.println(LastOccurance(arr, key, i));
	}
}
