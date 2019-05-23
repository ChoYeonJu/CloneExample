package deepclone;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member original = new Member("홍길동", 12, new int[] {90, 90}, new Car("소나타"));
		
		Member cloned = original.getMember();
		cloned.scores[0] = 100;
		cloned.car.model = "그랜져";
		
		System.out.println("[복제 객체의 필드 값]");
		System.out.println(cloned.name);
		System.out.println(cloned.age);
		System.out.println();
		
		for(int i = 0; i<cloned.scores.length; i++) {
			System.out.println(cloned.scores[i]);
			System.out.println((i==(cloned.scores.length-1))?"":",");
		}
		System.out.println("}");
		System.out.println(cloned.car.model);
		
		System.out.println();
		System.out.println("[원본 객체의 필드값");
		
		System.out.println(original.name);
		System.out.println(original.age);
		
		for(int i = 0; i<original.scores.length; i++) {
			System.out.println(original.scores[i]);
			System.out.println((i==(original.scores.length-1))?"":",");
		}
		
		System.out.println("}");
		System.out.println(original.car.model);

	}

}
