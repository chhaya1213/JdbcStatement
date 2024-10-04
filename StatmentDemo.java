package com.jbk;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StatmentDemo {
	public void insertData() throws Exception 
	{
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1184","root","root");
			Statement s=c.createStatement();
			s.executeUpdate("insert into student(id,name,city,age) values(112,'rajesh',Amravati,23)");
			System.out.println("data inserted");
			
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		
		
	}
	public void Update() throws Exception 
	{
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1184","root","root");
			Statement s=c.createStatement();
			s.executeUpdate("update student set name = 'Laxmi' where id = 101");
			System.out.println("DATA UPATED.");
			
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		
		
	}
	
	public void Delete() throws Exception 
	{
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1184","root","root");			Statement s=c.createStatement();
			Statement S=c.createStatement();
			S.executeUpdate("delete from student where id = 101");
			System.out.println("Data Deleted");
			
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		
		
	}
	public void Display() throws Exception 
	{
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1184","root","root");
			Statement s=c.createStatement();
			ResultSet rs = s.executeQuery("select * from student11");
			
			while(rs.next()) 
			{
				int id =rs.getInt(1);
				String name= rs.getString(2);
				String city = rs.getString(3);	
				int age=rs.getInt(4);
				System.out.println("sid:"+id+"\nsName:"+name+"\nCity:"+city+"\nage:"+age);
			}
			
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}		
	}

}
