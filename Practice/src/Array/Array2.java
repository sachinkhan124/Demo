package Array;

public class Array2 {

	public static void main(String[] args) {
		int[][] a= {{2,3,4,6},{3,8,4,0},{2,5,7,3}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println(a[i][j]);
			}
		}
         System.out.println();
	}

}
