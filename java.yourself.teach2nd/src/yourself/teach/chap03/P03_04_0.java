package yourself.teach.chap03;

public class P03_04_0 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int num = Integer.parseInt(args[0]);
		
		if(num <= 1){
			System.out.println("The number is not prime.");
		}else{
			
			boolean prime = true;
			for(int i=2;i<=num/2; i++){
				if((num%i) == 0){
					prime = false;
				}
			}
			
			if(prime == true){
				System.out.println("The number is prime.");
			}
			else {
				System.out.println("Ther number is not prime.");
			}
		}

	}

}
