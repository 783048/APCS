package arraysLabs;

public class OddsAndEvens {
	public static int[] odds(int[] array){
		int count = 0;
		for(int i = 0; i<array.length; i++)
			if(array[i] % 2 == 1)
				count++;
		int[] temp = new int[count];
		count = 0;
		for(int i = 0; i < array.length; i++)
			if(array[i] % 2 == 1){
				temp[count] = array[i];
				count++;
			}
		return temp;
	}
	public static int[] evens(int[] array){
		int count = 0;
		for(int i = 0; i<array.length; i++)
			if(array[i] % 2 == 0)
				count++;
		int[] temp = new int[count];
		count = 0;
		for(int i = 0; i < array.length; i++)
			if(array[i] % 2 == 0){
				temp[count] = array[i];
				count++;
			}
		return temp;
		
	}

}
