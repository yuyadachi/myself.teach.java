package yourself.teach.chap01;

public class P01_16_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		byte myarray[][][] = {{{3,8,34},{2,35,126},{33,2,98}},{{2,4,5},{0,9,5},{11,111,32}},{{76,43,20},{67,40,50},{13,53,21}}};
		
		
		for (int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				for(int k=0; k<3; k++){
					System.out.println("myarray["+i+"]"+"["+j+"]"+"["+k+"]"+ "=" + myarray[i][j][k]);
				}
			}
			
		}

	}

}
