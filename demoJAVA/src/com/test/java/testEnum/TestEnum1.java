package com.test.java.testEnum;

/**
 * 常用的枚举类型.
 * @Description 
 * @author xpp
 * @date 2017年9月5日 下午4:59:12
 */
public class TestEnum1 {
	
	private enum CarColor{
		YELLOW("Y"), 
		PINK("P"),
		GREEN("G");

		private String typeName;
		//此处相当于初始化了枚举类型yellow("Y")
		CarColor(String typeName){
			this.typeName = typeName;
		}
		
		private String getTypeName(){
			return this.typeName;
		}
		
		public static CarColor findColorType(String typeName){
			for(CarColor cc : CarColor.values()){
				if(cc.getTypeName().equals(typeName)){
					return cc;
				}
			}
			return null;
		}
	}
	
	public static void main(String[] args) {
		String typeName = "P";
		CarColor cc = CarColor.findColorType(typeName);
		System.out.println(cc);
		System.out.println(cc.getTypeName());
	}
}
