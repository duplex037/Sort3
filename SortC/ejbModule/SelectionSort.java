class SelectionSortAlgorithm extends SortAlgorithm {

	void sort(int[] a) {
		int i, j, min;
		for (i = 0; i < a.length - 1; i++) {
			min = i;
			for (j = i + 1; j < a.length; j++)
				if (a[min] > a[j]){
					min = j;
					pause();
				}
			swap(a,min,i);
			pause();
		}
	}
	
	protected SelectionSortAlgorithm(AlgorithmAnimator animator) {
		super(animator);
	}

}
