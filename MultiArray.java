class MultiArray{
//정수형 2차원 배열 8*9
	
	int [] [] gugu = new int [8][9];

//메소드이름 :array99

	public void array99(){

		for(int i=0;i<gugu.length;i++){
			for(int j=0;j<gugu[i].length;j++){
				//값 변경
				gugu[i][j]=(i+2)*(j+1);  //배열방에 담음
				System.out.print(gugu[i][j]+"\t");
			}
			System.out.println();
		}
	}
	//for loop 를 사용하여 
	//배열에 곱한 (구구단)결과저장
	//배열에 결과를 꺼내출력
}
public class MemoryApart{
//main메소드에서 
//MultiArray객체의 array99메소드호출
	public static void main(String [] args){
		new MultiArray().array99();
	}
}

