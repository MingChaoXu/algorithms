package sort;

public class ShellSort extends Sort{
	@SuppressWarnings("rawtypes")
	public static void sort(Comparable[] a){
		int N = a.length ;
		int h = 1 ;
		while( h < N / 3 ) h = 3 * h + 1 ;
		while( h >= 1 ){
			for(int i = h ; i < N ; i ++){
				for(int j = i ; j >= h && less(a[j - h] , a[j]) ; j -= h){
					exch(a, j, j - h);
				}
			}
			h /= 3 ;
		}
	}
}
