
public class FinalizeExample {
//객체가 소멸되기 전에 마지막으로 사용했던 자원을 닫고 싶거나 중요한 데이터를 저장하고 싶을때 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Counter counter = null;
		
		for(int i = 1; i<=50; i++) {
			counter = new Counter(i);
			
			counter = null;
			
			System.gc();     //garbagecollector
		}

	}

}
