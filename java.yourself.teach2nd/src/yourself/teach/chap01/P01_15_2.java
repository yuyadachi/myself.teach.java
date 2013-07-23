package yourself.teach.chap01;

public class P01_15_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		double myarray[] = new double[4];
		double sum = 0;
		double ave = 0;
		
		myarray[0] = 6.5;
		myarray[1] = 7.5;
		myarray[2] = 8.5;
		myarray[3] = 9.5;
		
		for(int i=0; i<4; i++){
			
		sum = sum + myarray[i];
		ave = sum/(i+1);
		}
		
		System.out.println(ave);
		
	}

}
