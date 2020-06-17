
public class SortExample {

	public static void main(String[] args) {
		int [] arr = new int[100000];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*arr.length)+1;			
		}
		//���� �ð� ����
		long start = System.currentTimeMillis();
		
		//void�� �ϸ� return �Ƚᵵ��
		//Bubble sort ���簪, ������ �ΰ��� ���س���. i�� j�� �ѹ� �� �� �� ���������� ����.
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
				
				
		//select sort ������ i���� ��� �����ϴ� j�� ���ؼ� ��ȯ. 
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
		
		//������ �ð� ����
		long end = System.currentTimeMillis();
		
		//���
		for(int i = 0; i<arr.length; i++) {
			System.out.printf("%5d", arr[i]);
			if(i%20 == 19)
				{System.out.println();}
		}
		
		//�ʴ��� ȯ��
		System.out.println("\n���� �ð� : " + (end-start)/1000.0);

	}

}
