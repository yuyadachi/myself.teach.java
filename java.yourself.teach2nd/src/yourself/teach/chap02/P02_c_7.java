package yourself.teach.chap02;

public class P02_c_7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String str = args[0];
		double theta = Double.valueOf(str).doubleValue();
		
		double sin = Math.sin(theta*Math.PI/180);
		double cos = Math.cos(theta*Math.PI/180);
		double tan = Math.tan(theta*Math.PI/180);
		
		System.out.println(sin);
		System.out.println(cos);
		System.out.println(tan);
		
		
				

	}

}
