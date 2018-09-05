//TwoDmArrayExam.java
//
class TwoDmArray{
	//String을 저장하는 twoDmArray 배열선언
	String [][] twoDmArray = new String [10][];


	//메소드 make2DmArray
	public void make2DmArray(){
		//twoDmArray 배열에  값을 할당

		for(int i=0;i<twoDmArray.length;i++){	//10행
			twoDmArray[i] = new String[i+1];					//->아직 열 생성 안 함 NullPointer오류, 이 문장이 있어서 생성
			for(int j=0;j<twoDmArray[i].length;j++){
				twoDmArray[i][j]=(i+1)+"동"+(j+1)+"호";
			}
		}//System.out.println();
	}
	
		
	//메소드 print2DmArray
	//	twoDmArray 배열의 값을 주어진형식으로 출력
	/**


	String space="";
	for(){   //10행
		System.out.print(space);   //한 바퀴 돌고난 뒤에 space 누적
		for(){    /동호

		}
		System.out.println();
		space+="	";
	}
	*/
	public void print2DmArray(){
		String space="";

		for(int j=0; j<twoDmArray.length; j++){  //10행      i를 고정시킬 거라서 j를 먼저
			System.out.print(space);
			for(int i=j;i<twoDmArray.length; i++){    //j는 0 다음 1로 올라가니깐 i를 j와 같게 시작, i=0으로 시작하면 다시 0번째부터 시작해서 그림 나오지 않음
				System.out.print(twoDmArray[i][j]+"\t"); //00 10 20 30 -> 11 21 31 41 -> 22 32 42 52
			}
			space+="\t\t";
			System.out.println();
		}
	}
		
}

public class TwoDmArrayExam{
	//main메소드에서
	public static void main(String [] args){

		//TwoDmArray객체생성
		TwoDmArray two = new TwoDmArray();
		
		//TwoDmArray객체의 make2DmArray메소드 호출
		two.make2DmArray();
		
		//TwoDmArray객체의 print2DmArray메소드 호출
		two.print2DmArray();
		
	}
}
