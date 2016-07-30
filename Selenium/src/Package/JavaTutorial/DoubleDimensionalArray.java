package Package.JavaTutorial;

public class DoubleDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] DoubleDimension=new int[2][3];
		DoubleDimension[0][0]=4;
		DoubleDimension[0][1]=5;
		DoubleDimension[0][2]=6;
		DoubleDimension[1][0]=7;
		DoubleDimension[1][1]=8;
		DoubleDimension[1][2]=9;
		
		for(int i=0;i<DoubleDimension.length;i++)
			
		{
			System.out.println(DoubleDimension.length);
			for(int j=0;j<DoubleDimension[i].length;j++)
			{
				System.out.println(DoubleDimension[i].length);
				
				System.out.println(DoubleDimension[i][j]);
			}
		}
		
	}

}
