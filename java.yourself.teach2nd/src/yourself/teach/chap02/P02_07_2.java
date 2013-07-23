package yourself.teach.chap02;

public class P02_07_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String str1 = "17";//8進表記は不要
		String str2 = "0f";//16進表記は不要
		String str3 = "15";
		
		short sh1 = Short.parseShort(str1, 8);
		short sh2 = Short.parseShort(str2, 16);
		short sh3 = Short.parseShort(str3, 10);
		
		System.out.println(sh1+sh2+sh3);
				
		
		
		

	}

}
