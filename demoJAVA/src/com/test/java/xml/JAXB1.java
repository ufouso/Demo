package com.test.java.xml;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 测试jaxb
 * @author xpp
 *
 */
public class JAXB1 {
	
	public static void main(String[] args) {
		List<Noo> list = new ArrayList<Noo>();
		Noo no1 = new Noo();
		no1.setId("11");
		no1.setName("张三");
		Noo no2 = new Noo();
		no2.setId("22");
		no2.setName("李四");
		list.add(no1);
		list.add(no2);
		
		NO1 n = new NO1();
		n.setId("1");
		n.setName("Jack");
		n.setAge("12");
		n.setStarge("10");
		n.setList(list);
		
		try {
			JAXBContext jc = JAXBContext.newInstance(n.getClass());
			Marshaller marshaller = jc.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			StringWriter sw = new StringWriter();
			marshaller.marshal(n, sw);
			System.out.println(sw.toString());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}

//指定由java对象生成xml文件时，对java对象的属性访问
@XmlAccessorType(XmlAccessType.FIELD)
//class的类注解，在使用propOrder的属性时，必须列举出对象中全部的属性，否则会报错
//将java类或者枚举类型映射到xml模型的类型
@XmlType(name="faker",propOrder= {"id","name","age","starge","list"})
//跟元素
@XmlRootElement

//将对象转xml元素时，对xml元素进行排序，它有两个属性值分别为：
//AccessorOrder.ALPHABETICAL：对生成的xml元素按字母书序排序
//XmlAccessOrder.UNDEFINED:不排序
//@XmlAccessorOrder

class NO1{
	
	@XmlElement(name="ID")
	private String id;
	
	@XmlElement(name="NAME")
	private String name;
	
	//将java对象的属性映射为xml的节点，通过name生成xml对象的显示名称
	@XmlElement(name="AGE")
	private String age;
	
	//将java对象的属性映射到xml的属性，通过name生成xml的指定别名
	@XmlAttribute(name="Stt")
	private String starge;
	
	@XmlElementWrapper(name="myList")
//	@XmlElement(name="noo")
	private List<Noo> list;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getStarge() {
		return starge;
	}

	public void setStarge(String starge) {
		this.starge = starge;
	}

	public List<Noo> getList() {
		return list;
	}

	public void setList(List<Noo> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "NO1 [id=" + id + ", name=" + name + ", age=" + age + ", starge=" + starge + ", list=" + list + "]";
	}
	
}

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
@XmlRootElement(name="Noo")
class Noo{
	
	@XmlElement(name="noId")
	private String id;
	
	@XmlElement(name="noName")
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}