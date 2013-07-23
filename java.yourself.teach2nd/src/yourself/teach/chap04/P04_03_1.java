package yourself.teach.chap04;

public class P04_03_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int arraylength = args.length;
		int sum = 0;
		int i = 0;
		
		while(i < arraylength){
			
			sum = sum + Integer.valueOf(args[i]).intValue();
			i++;
		}

		System.out.println(sum);
	}

}
