/**
학생의 정보를 저장하고 관리할 객체 = VO(Value Object) = DTO(Data Transfer Object)
*/

class Student{
	//외부에서 접근 불가(은닉)

	private String name; //이름
	private int age; //나이
	private String addr; //주소

	
	//생성자
	public Student(){}   //일단 기본생성자를 먼저 만들어 놓음,상속할 때 필요, 그 다음 오버로딩


	public Student(String name, int age){  //오버로딩 ex)주소는 선택사항일 때

		this.name=name;
		this.age=age;
	}


	public Student(String name, int age, String addr){   //값이 하나가 아니라 유연하게 계속 들어와야 해서 안에 parameter 넣음
		//데이터 초기화를 하고 싶어서 생성자

		this(name,age); //재사용성
		this.addr=addr;
	}


	//생성자로는 변경이 불가능하고 최초 밖에 실행이 안되기 때문에 getter,setter로 변경함
	// -> 결국 둘 다 필요



	//반드시 메소드를 통해서 접근할 수 있는 setXxx(), getXxx() 있어야 사용 가능.

	/**
		setXxx() : 리턴 void , 인수 필수 , public
		getXxx() : 리턴 필수,  인수 없음 , public
	*/

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}


	public void setAge(int age){
		if(age>0){
		this.age = age;
		}
	}
	public int getAge(){
		return age;
	}

	
	public void setAddr(String addr){
		this.addr = addr;
	}
	public String getAddr(){
		return addr;
	}
}
