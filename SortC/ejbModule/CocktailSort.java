
class CocktailSortAlgorithm extends SortAlgorithm{
	void sort(int[] a) {
		int i, left = 0, right = a.length - 1;
		while (left < right) {
			for (i = left; i < right; i++)
				if (a[i] > a[i + 1]) {
					swap(a,i,i+1);
					pause();
				}
			right--;
			for (i = right; i > left; i--)
				if (a[i - 1] > a[i]) {
					swap(a,i,i-1);
					pause();
				}
			left++;
		}
	}
	
	public CocktailSortAlgorithm(AlgorithmAnimator animator) {
		    super(animator); 
		  }
}
