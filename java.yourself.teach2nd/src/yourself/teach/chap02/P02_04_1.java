package yourself.teach.chap02;

public class P02_04_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int i = 16;
		Integer integer = Integer.valueOf(i);//⇒iの値を10進表現で返す
		String str = integer.toString();
		System.out.println(Integer.valueOf(str, 16)); //22 strという文字列を16進数で構文解析し、その値を10進表現にして返す
		System.out.println(Integer.valueOf(str));//16　strという文字列を10進数で解釈した時の値を返す
		
		System.out.println(Integer.toHexString(i));//10　iという整数を16進表現した値を返す
		
		

	}

}
