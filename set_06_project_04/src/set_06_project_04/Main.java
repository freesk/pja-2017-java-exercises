package set_06_project_04;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2,3,4,3,2,6,3,6,8,2,9 };
		int i = 0;
		int size = arr.length;
		int temp;
		boolean finished = false;
		String output = "";
		
		
		for(i = 0; i < size; i++)
			System.out.print(arr[i] + (i < size - 1 ? "," : "" ));

		while(!finished) {
			finished = true;
			for(i = 0; i < size - 1; i++) {
				if(arr[i] > arr[i+1]) {
					temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = temp;
					finished = false;
				}
			}
		}
		
		System.out.print("\n");
		
		for(i = 0; i < size; i++)
			System.out.print(arr[i] + (i < size - 1 ? "," : "" ));
		
		System.out.print("\n");
		
		int count = 0;
		
		for(i = 0; i < size; i++) {
			if(i < size - 1) {
				if(arr[i] != arr[i+1]) {
					output += (arr[i] + ",");
					count++;
				}
			} else {
				if(arr[i] != arr[i-1]) {
					output += (arr[i] + ",");
					count++;
				}
			}
		}
		
		System.out.println(output);
		System.out.println(count + " differnt numbers");
		
		
		
		
	}

}
