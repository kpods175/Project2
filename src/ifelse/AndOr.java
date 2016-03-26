package ifelse;

public class AndOr {

	public static void main(String[] args) {
		
		int x ,z;
		x= -10;
		z = -10;
		if(x > 0 && z > 0){
			System.out.println("Both nums are positve");
		}else if(x > 0 || z > 0){
			System.out.println("At least one is positeve num");
		}else{
			System.out.println("bott are negative");
		}
		
		
		
	}

}
