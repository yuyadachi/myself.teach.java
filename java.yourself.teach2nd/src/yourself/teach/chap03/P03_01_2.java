package yourself.teach.chap03;

public class P03_01_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int i = Integer.valueOf(args[0]).intValue();
		String str = args[1];
		
		if(str.equals("meters")){
			System.out.println(i + "メートルは" + i*3.28 + "フィートです");
		}else if(str.equals("feet")){
			System.out.println(i + "フィートは" + i/3.28 + "メートルです");
		}else{
			System.out.println("単位を認識出来ません");
		}
	}

}
