
public class SortExample {

	public static void main(String[] args) {
		int [] arr = new int[100000];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*arr.length)+1;			
		}
		//시작 시간 저장
		long start = System.currentTimeMillis();
		
		//void로 하면 return 안써도됨
		//Bubble sort 현재값, 이전값 두개씩 비교해나감. i는 j가 한번 다 돈 후 증가용으로 설정.
		for(int i=0; i<arr.length; i++) { 
			for(int j = 1; j<arr.length; j++) {
				if(arr[j-1]>arr[j]) {
					int temp = 0;
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}				
			}
		}
				
				
		//select sort 고정된 i값과 계속 증가하는 j를 비교해서 교환. 
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[j] < arr[i]) {
					int temp = 0;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;					
				}
			}			
		}
		
				
		//insert sort
		for(int i = 0; i<arr.length; i++) {
			int j = i;
			while(j>0 && arr[j-1]>arr[j]) {
				int temp = 0;
				temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
		
		//끝나는 시간 저장
		long end = System.currentTimeMillis();
		
		//출력
		for(int i = 0; i<arr.length; i++) {
			System.out.printf("%5d", arr[i]);
			if(i%20 == 19)
				{System.out.println();}
		}
		
		//초단위 환산
		System.out.println("\n실행 시간 : " + (end-start)/1000.0);

	}

}
