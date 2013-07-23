package yourself.teach.chap02;

public class P02_09_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Float floatarray[] =
			{Float.valueOf(3.14f), Float.valueOf(3.1425f), Float.valueOf(3.141592653f), Float.valueOf(3.14354f),Float.valueOf(354624.3434f),
				new Float(353.464f)};
		
		System.out.println(floatarray.length);
		
		for(int i=0; i<floatarray.length; i++){
		System.out.println(floatarray[i]);
		}

	}

}
