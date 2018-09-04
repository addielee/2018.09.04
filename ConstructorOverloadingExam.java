class Puppy3{
	/*String 타입 전역 변수 선언
		int 타입 전역 변수 선언*/
		
	String str;
	int i;

	/*인수가 없는 생성자작성
		String 타입 전역변수에 "메리" 할당
		"puplic Puppy3()호출되었습니다"출력
		전역변수 출력
	*/

	public Puppy3(){
		str="메리";
		System.out.println("\"public Puppy3()호출되었습니다.\"");
		System.out.println(this.str);
		System.out.println(this.i);
		System.out.println();
	}
	
	
	/*String 타입의 인수 1개를 받는 생성자작성
		String 타입 전역변수에 인수 할당
		"puplic Puppy3()호출되었습니다"출력
		전역변수 출력
	*/		

	public Puppy3(String str1){
		this.str=str1;  //만약 str1이 아니라 str이라면 이름이 같으니깐 반드시 전역변수를 this로 써야 함
		System.out.println("\"public Puppy3(String str1)호출되었습니다.\"");
		System.out.println(this.str);
		System.out.println(this.i);
		System.out.println();
	}
	
	/*String 타입의 인수 2개를 받는 생성자작성
		인수2개를 하나의 String으로 만들어
		String 타입의 인수 1개를 받는 생성자에게 인수로 주며 호출
		"puplic Puppy3()호출되었습니다"출력
	*/		

	public Puppy3(String str2, String str3){
		this(str2+str3);
		System.out.println("\"public Puppy3(String str2, String str3)호출되었습니다.\"");
		System.out.println();
	}
		
	/*boolean 타입의 인수 1개를 받는 생성자작성
		인수를 "쫑"과 붙여 하나의 String으로 만들어
		String 타입의 인수 1개를 받는 생성자에게 인수로 주며 호출
		"puplic Puppy3()호출되었습니다"  출력
	*/
	public Puppy3(boolean boo){
		this(boo+"쫑");  //생성자 호출할 땐 첫번째 줄에 this로
		System.out.println("\"public Puppy3(boolean boo)호출되었습니다.\"");
		System.out.println();
	}
	
	/*char 타입의 인수 1개를 받는 생성자작성
			인수가 없는 생성자를 호출하고
			인수로 받은 data를 int타입 전역변수에 할당	
			"puplic Puppy3()호출되었습니다"출력
			int형 전역변수출력
	*/			
	public Puppy3(char ch){
		this();  //기본생성자 호출
		this.i = ch;  //char는 2바이트 i는 4바이트라 캐스팅 안하고 그냥 들어감
		System.out.println("\"public Puppy3(char ch)호출되었습니다.\"");
		System.out.println(this.i);
		System.out.println();
	}
	
	
	/*메소드 printMemberVariable
	리턴 없음
	전역변수를 출력
	*/	
	public void printMemberVariable(){
		System.out.println(this.str);
		System.out.println(this.i);
		System.out.println();
	}
}

class ConstructorOverloadingExam{
		//메인메소드에서
		public static void main(String [] args){

			//Puppy3 클래스의 각 생성자를 한번씩 이용해 객체 5개 생성
			//각 객체는 Pupp3 똑같이 생성되지만 호출되는 생성자가 다를 뿐

			Puppy3 p = new Puppy3(); //인수없는 생성자 호출
			System.out.println("----------");

			Puppy3 p2 = new Puppy3("ddd");  //String 변수 있는 생성자 호출

			Puppy3 p3 = new Puppy3("eee","fff");
			 
			Puppy3 p4 = new Puppy3(true);
			
			Puppy3 p5 = new Puppy3('A');
			
			
		//각 객체의 printMemberVariable메소드를 한번씩 호출
			p.printMemberVariable();
			p2.printMemberVariable();
			p3.printMemberVariable();
			p4.printMemberVariable();
			p5.printMemberVariable();
	}
}
