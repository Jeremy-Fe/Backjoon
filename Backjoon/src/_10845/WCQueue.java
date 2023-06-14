package _10845;

public class WCQueue {
	// 스택은 LIFO 이기 때문에 size 가 인덱스가 될 수 있었지만,
	// 큐는 FIFO 이기 때문에 저장된 값을 제외할때는 제일 앞의 값을 제외 시킨다.
	// 하지만 주의할 건 그렇다고 0 인덱스를 제외 시키면 안된다. 배열은 값을 제외시키는 개념이 없기 때문에 
	// 0 인덱스 값을 제외 시켰는데 다음 값을 또 제외 시키려면 0 인덱스는 실제론 지워진 것이 아니라 그렇게 출력만 했기 때문에	
	// 0 인덱스 다음인 1 인덱스 값을 출력해야한다. 그걸 체크하기위한 first 변수이다.
	// last 는 back 이 입력 되었을때 마지막 인덱스에 저장된 값을 출력하기위한 변수이지만 스택문제의 size 처럼 해도 된다.
	
	int[] que = new int[10001];
	int first = 0;
	int last = 0;
	
	public void push(int X) {
		que[last] = X;
		last++;
	}
	
	public int pop() {
		if(last - first == 0) {
			return -1;
		}else {
			int P = que[first];
			first++;
			return P;
		}
	}
	
	public int size() {
		return last - first;
	}
	
	public int empty() {
		if(last - first == 0) {
			return 1;
		}else {
			return 0;
		}
	}
	
	public int front() {
		if(last - first == 0) {
			return -1;
		}else {
			int F = que[first];
			return F;
		}
	}
	
	public int back() {
		if(last - first == 0) {
			return -1;
		}else {
			int B = que[last - 1];
			return B;
		}
	}
}
