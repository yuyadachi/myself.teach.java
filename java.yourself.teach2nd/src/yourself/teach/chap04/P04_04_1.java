package yourself.teach.chap04;

public class P04_04_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int farray[] = new int[15];
		farray[0] = 1;
		farray[1] = 1;
		int count = 2;
		
		System.out.println(farray[0]);
		System.out.println(farray[1]);
		
		do{
			farray[count]= farray[count-1]+farray[count-2];
			System.out.println(farray[count]);
			count++;
			
		}while(count < farray.length);
		
		System.out.println();
		
		int counter = 0;
	    int i = 0;
	    int j = 1;
	    do {
	      System.out.print(j + " ");
	      int k = i + j; // 2つの値の和
	      i = j; // 直前の値として代入
	      j = k;
	    } while(++counter < 15); // 15個表示するまでループ
	    System.out.println("");
		
	}

}
