package deepclone;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member original = new Member("ȫ�浿", 12, new int[] {90, 90}, new Car("�ҳ�Ÿ"));
		
		Member cloned = original.getMember();
		cloned.scores[0] = 100;
		cloned.car.model = "�׷���";
		
		System.out.println("[���� ��ü�� �ʵ� ��]");
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
		System.out.println("[���� ��ü�� �ʵ尪");
		
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
