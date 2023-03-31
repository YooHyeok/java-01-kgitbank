package loop_;
//기록하는것
public class PrimeNumber_Example {

	public static void main(String[] args) {
		for(int i = 1; i <= 100; ++i) {
			int count = 0; //나누어 떨어지는 횟수를 기록.(기록 하는 이유는 count가 2라는게 소수)
			for(int j = 1; j <= i; ++j) { //j의 범위는 1부터 i까지 //2부터 시작.
							//j는 i와같다는 조건을 다는 이유를 서술해라: (숙제)
				if (i % j == 0) { //i의 약수가 2개일때 소수(i는 1과 자기 자신으로만 나뉠수있는 수)
					
					count++;//나누어 떨어지는 횟수를 기록.(기록 하는 이유는 count가 2라는게 소수)
				}
			}
			if (count == 2) {
				System.out.print(i+" ");
		
			}
		}
	}

}
