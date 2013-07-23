package yourself.teach.chap02;

public class P02_t_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String str = args[0];
		
		
		Boolean bool = new Boolean(str);
		Character chara = new Character(str.charAt(0));
		Byte byt = new Byte(str);
		Short shor = new Short(str);
		Integer inte = new Integer(str);
		Long lon = new Long(str);
		Float flo = new Float(str);
		
		System.out.println(bool.toString());
		System.out.println(chara.toString());
		System.out.println(byt.toString());
		shor.toString();
		inte.toString();
		lon.toString();
		flo.toString();
		
		
	}

}
