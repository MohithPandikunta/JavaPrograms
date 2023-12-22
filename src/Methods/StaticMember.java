package Methods;

public class StaticMember {
	static {
		System.out.println("block-2");
	}
	static int a=10;

	public static void main(String[] args) {
		System.out.println(StaticMember.a);
		StaticMember.test();
	}
	public static void test()
	{
		System.out.println("test() method");
	}
	static {
		System.out.println("block-1");
	}

}
