package yourself.teach.chap02;

public class P02_03_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String str = "345,677,346645,646464,11224";
		int count = 3;
		
		String[] strarray = str.split(",");
		System.out.println(strarray[count-1]);

	}

}
