package algorithm1;

public class get4liter {
	public static void main(String[] args) {
		// 양동이 3L와 5L가 있다.
		// 4L의 물을 구하는 방법은?
		
		int a,b;
		a = 3;
		
		
		// 첫번째 방법
		// 1단계. 3L의 물을 5L통에 붓는다.
		b = 0; // 빈 5L 양동이라고 가정한다.
		b += a; // 빈 5L 양동이는 3L가 된다.
		
		// 2단계. 5L 양동이에 2L가 더 들어갈 수 있다.
		b = a+(b-a);	// 3L + 2L
		
		// 3단계. 3L짜리 양동이는 1L가 남는다.
		a -= 2;
		
		// 4단계. 5L 양동이에 있는 물을 버린다.
		b = 0;
		
		// 5단계. 1L가 담겨있는 3L짜리 양동이를 5L 양동이에 붓는다.
		b += a;
		a = 0;
		
		// 6단계. 다시 3L 양동이를 가득 채워 5L 양동이에 부어준다.
		a += 3;
		b += a;
		
		a -= 3;
		
		
		
		
		
	}

}
