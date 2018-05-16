package com.test.java.poolThread;
/**
 * 产品
 * @Description 
 * @author xpp
 * @date 2017年8月28日 下午3:47:18
 */
public class Product {

	private String id;
	
	public Product(String id){
		this.id = id;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + "]";
	}
	
}
