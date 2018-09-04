/**
작성일:18.09.03
작성자:이원경
작성내용:정렬(선택정렬)
*/


class Example090301 {
	public static void main(String[] args) { //선택정렬
		int arr [] = {5,7,1,2,4,3,8,9,6,10};
		int bye;

		//System.out.println(Arrays.toString("정렬 전 = "+arr));

		//내 과제

		for(int i=0;i<arr.length;i++){

			for(int j=(i+1);j<arr.length;j++){

				if(arr[i]>arr[j]){    // < 이면 내림차순

					bye=arr[i]; //bye에 arr[i] 값 담아두기
					arr[i]=arr[j]; //arr[i]자리에 arr[j]값 대체
					arr[j]=bye; //arr[j] 자리에 arr[i] 값 대체

				}
			}
		}

		/**
		//버블정렬방식 : 인접해 있는 데이터를 비교해서 큰 값을 오른쪽 배치
		int temp=0; //임시 공간 변수
		for(int a=0;a<arr.length-1;a++){ //9번...
			for(int i=0;i<arr.length-1; i++){ //9
				if(arr[i]>arr[i+1]){ //0 1, 1 2, 2 3
					temp = arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
		*/
		
		//System.out.println(Arrays.toString("정렬 후 = "+arr)); //배열방의 모든 값을 콤마를 기분으로 출력하는 메소드 Arrays(import 해야 함: import.java.util.Arrays;)

		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
