// Question1

class Sorting {
	
	//int arr[] = new arr[5]; 
	//int arr[] = {1,2,4,5,3};

    void insertionsort(int arr[]){
	    int n = arr.lenght;
		
		for (int i=1; i<=n-1; i++)
		{
		    int key = arr[i];
			int j = i-1;
			
			while (j>=0 && arr[j]>key){
			    arr[j+1] = arr[j];
				j--;
			}
		arr[j+1] = key ;
		}
	
	}
	void display (int arr[]){
		for (int 1=0;i<=n;i++){
			System.out.oprintln(arr[]+"");
		}
	}


}