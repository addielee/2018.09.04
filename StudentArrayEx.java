/**

학생의 정보를 저장하고 관리할 객체 = VO(Value Object) = DTO(Data Transfer Object)

class Student{          ->Student는 배열이 아님!
	String name; //이름
	int age; //나이
	String addr; //주소
}
*/


class StudentArrayEx {
	
	Student [] stArr = new Student [5];

		
		/**
		   Student 객체를 생성해서 배열에 추가하는 메소드
		*/

	public void addStudent(String [] [] data){  //
		for(int i=0; i<stArr.length;i++){
			stArr[i] = /**new Student ();

			stArr[i].name = data[i][0];
			stArr[i].age = Integer.parseInt(data[i][1]);
			stArr[i].addr = data[i][2];*/ //여기까지 일을 create가 담당
				      
			            this.create(data [i]); //data 한 행을 꺼냄
		}
	}

		/**
		   Student 객체를 생성하고 값을 초기화한 객체를 리턴하는 메소드 작성.
		*/	
		


		private Student create(String [] row){  //Student 객체를 리턴 , 생성할 때 한 행만 필요
			Student st = new Student(row[0],Integer.parseInt(row[1]),row[2]); 
			
			//여기서 Student는 배열이 아니기 때문에 name,age,addr에 [] 붙이지 않음

			//st.setName(row[0]);  //row 1차원 배열의 0번째 
			//st.setAge(Integer.parseInt(row[1]));
			//st.setAddr(row[2]);

			return st;
		}

		/**
		System.out.println(data);  //주소값
		System.out.println(data[0]); //행의 주소값
		System.out.println(data[0][0]); //값
		*/

		/**
		   Student 타입 배열방의 모든 정보를 출력하는 메소드
		*/
	public void print(){
		System.out.println("**학생의 정보**\n");
		for(int i=0; i<stArr.length;i++){
		   System.out.println(stArr[i].getName() + "\t" + stArr[i].getAge() + "\t" + stArr[i].getAddr());
		}

		System.out.println("\n**개선된 for문 변경**\n");
		for(Student st:stArr){   //stArr은 Student 타입, stArr 0번째 것 뽑으면 Student 타입이 나옴
			System.out.println(st.getName()+"\t"+st.getAge()+"\t"+st.getAddr()); //여기서는 배열 아님
		}
	}


	public static void main(String[] args){
		//학생의 초기 데이터 준비 - 2차원 배열
		String [] [] data = new String [] [] {
			{"장희정","45","서울"}, //0행
			{"이효리","30","대구"}, //1행
			{"김희선","25","부산"}, //2행
			{"유재석","26","서울"}, //3행
			{"빅뱅","20","대전"} //4행
		};

		//추가메소드 호출
		StudentArrayEx se =new StudentArrayEx();
		se.addStudent(data);
		se.print();

		
	}

}
 //data[3][2] = "서울"
