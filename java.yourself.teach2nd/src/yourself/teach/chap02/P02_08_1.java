package yourself.teach.chap02;

public class P02_08_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		StringBuffer sb = new StringBuffer("abcde");
		sb.append("fghijk");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		String str = "01234";
		System.out.println(sb.insert(0, str));
		
		System.out.println(sb.reverse());

	}

}
