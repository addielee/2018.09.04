class Electronics{
	   // Field, 생성자, setXxx(), getXxx()

	   private int modelNo;
	   private String modelName;
	   private int modelPrice;
	   private String modelDetail;

	   Electronics(){
	   }
	   Electronics(int modelNo,String modelName){
		   this.modelNo=modelNo;
		   this.modelName=modelName;
	   }
	   Electronics(int modelNo, String modelName, int modelPrice, String modelDetail){
		   this(modelNo,modelName); //생성자 호출
		   this.modelPrice=modelPrice;
		   this.modelDetail=modelDetail;
	   }

	  
	  public void setModelNo(int modelNo){
	  }
}
