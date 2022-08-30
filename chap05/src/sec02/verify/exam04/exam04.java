package sec02.verify.exam04;

public class exam04 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = {1,5, 3, 8, 2};
		
		int i = 0;
		for (i = 0; i < array.length; i++) {
			if (array[i] > array[i+1] ){
				max = array[i];
				if ((i<3) && (array[i] - array[i+2] > 0)) {
					max = array[i];
					if ((i<2) && (array[i] - array[i+3] > 0)) {
						max = array[i];
						if ((i<1) && (array[i] - array[i+4] > 0)) {
							max = array[i];
						}else {							}
			}else {
				max = array[4];
				break;
				}
				}
			
		}
		
			System.out.println("max : " + max);
		

	}

		}
	
}

