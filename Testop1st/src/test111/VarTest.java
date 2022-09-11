package test111;

public class VarTest {

	public static void main(String[] args) {
		int a=2;
		int b=2;
		for(int z=0 ;z<5 ;z++){
			if((a++>2) && (b++>2)){
				++a;
			}
		}
		System.out.println("a " +a+ " b "+ b);
	}

}
