package yourself.teach.chap03;

public class P03_04_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int i = Integer.valueOf(args[0]).intValue();
		System.out.println(i + "の因数は");
		
		for(int j=2; j<i; j++){
			if((i%j) == 0){
				System.out.println(j);
			}
		}
	}

}
