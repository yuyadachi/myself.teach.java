package yourself.teach.chap03;

public class P03_02_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		double d1 = Double.valueOf(args[0]).doubleValue();
		double d2 = Double.valueOf(args[1]).doubleValue();
		
		if(d2 == 0){
			System.out.println("0では割れません");
		}else{
			System.out.println(d1/d2);
		}

	}

}
