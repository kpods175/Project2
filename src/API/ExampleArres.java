package API;

public class ExampleArres {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		System.out.println(a[1]);
		for(int temp :a){
			System.out.println(temp);
		}
		
    int [] x = new int[5];
    
    x[2] = 12;
    x[3] = 10;
    
    for (int temp2 :x){
    	System.out.println(temp2);
    }
    String[] st = {"one","two","thre"};
    for(String temp3 : st)
    System.out.println(temp3);
    
    String [] stx = new String[5];
    stx[1] = "21";
    stx[3] = "hi";
    for(String temp4 : stx){
    	System.out.println(temp4);
    }
    
	}

}
