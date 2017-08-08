package com.model;

public class LearnGetterandSetter {

	/**
	 * @param args
	 */

	private int id;
	private String name;
	//method
	public void setName(String name)
	{
		this.name= name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public int getId()
	{
		return id;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating object
		LearnGetterandSetter obj = new LearnGetterandSetter();
		
		//calling methods
		obj.setId(100);
		obj.setName("XXX");
		
		System.out.println(obj.getId());
		System.out.println(obj.getName());

	}

}
