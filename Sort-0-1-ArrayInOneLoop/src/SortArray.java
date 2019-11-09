
public class SortArray {

	public static void main(String[] args) {

		int a[] = { 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0 };

		int start = 0;
		int end = a.length - 1;

		while (start < end) {

			if (a[start] == 0) {
				start++;
			}
			else if(a[end] == 1)
			{
				end--;
			}
			else {
				a[start]=0;
				a[end]=1;
			}

		}
		
		for(int i=0 ;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
