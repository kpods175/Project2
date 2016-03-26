package API;

public class TwoDimArrey {

	public static void main(String[] args) {
		
		
		//              4 rows    -  3 colum
		int[][] twodim = new int[4][4];
twodim[2][1] = 10;
int temp = 10;
	for(int i = 0; i<4; i++){
		for(int a = 0; a <4 ; a++)
		{
			twodim[i][a] = temp;
			temp += 10;
		System.out.print(twodim[i][a]+" ");
		}
	System.out.println();
	
	}
	
	}
	
	
	

}
