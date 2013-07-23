package yourself.teach.chap03;

public class P03_c_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int intarray[] = new int[10];
		
		for(int i=0; i>-10; i--){
			intarray[-i]=i-1;
		}
		
		for(int i=0; i<10; i++){
			System.out.println(intarray[i]); 
		}

	}

}
