package yourself.teach.chap04;

public class P04_02_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int intargs = Integer.valueOf(args[0]).intValue();
		
		for(int i=intargs; i>=1; i--){
			System.out.println(i);
			if(i==1){
				System.out.println("\u0007");
			}
		}

	}

}
