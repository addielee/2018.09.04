//TwoDmArrayExam.java

class TwoDmArray{
	//String을 저장하는 twoDmArray 배열선언
	String [][] twoDmArray = new String [10][];


	//메소드 make2DmArray
	public void make2DmArray(){
		//twoDmArray 배열에  값을 할당

		for(int i=0;i<twoDmArray.length;i++){
			for(int j=0;j<twoDmArray[i].length;j++){
				twoDmArray[i][j]=(i+1)+"동"+(j+1)+"호";

			}
		}System.out.println();
	}
	
		
	//메소드 print2DmArray
	//	twoDmArray 배열의 값을 주어진형식으로 출력
	public void print2DmArray(){
		System.out.print(twoDmArray[i][j]);
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
