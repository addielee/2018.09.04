class MultiArrayEx {
	//2차원 배열 생성
	int [] [] arr;

	public void arrayTest(){
		System.out.println("arr = " + arr); //null

		//arr = new int [3][4];
		arr = new int [] [] {     //열의 개수는 똑같을 필요 없음
				{1,3,5,7,9}, 
				{5,9,8}, 
				{2,4,6,8}
		};

		System.out.println("arr = " + arr);  //주소
		System.out.println("arr[0] = " + arr[0]);  //주소
		System.out.println("arr[0][0] = " + arr[0][0]);  //0(int니깐)

		System.out.println("arr.length = "+ arr.length); //행의 길이
		System.out.println("arr[0].length = "+arr[0].length); //0행의 열의 길이 


		//모든 배열방 출력
		System.out.println("***배열방 출력***");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

		System.out.println("***개선된 for***");
		for(int [] row : arr){
			for(int v : row){
				System.out.print(v+"\t");
			}
			System.out.println();
		}


		
	}



	public static void main(String[] args) {
		new MultiArrayEx().arrayTest();  
		
		//MultiArrayEx me = new MultiArrayEx();  -> me.arrayTest();    :이 두 문장을 하나로 합친 것, but 이렇게 한 번만 호출 가능
		//->한 번만 쓸 거라면 따로 객체 생성 안하고



	}
}
