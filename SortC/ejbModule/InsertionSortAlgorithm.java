
class InsertionSortAlgorithm extends SortAlgorithm{

	void sort(int[] a) {
		
		int i, j;
		int temp;
		for (i = 1; i < a.length; i++) {
			temp = a[i]; 
			for (j = i - 1; j >= 0 && a[j] > temp; j--) {
				a[j + 1] = a[j];
				pause();
			}
			a[j + 1] = temp;
		}
	}
	 
	
	
	public InsertionSortAlgorithm(AlgorithmAnimator animator) {
		    super(animator); 
	}
}

	

