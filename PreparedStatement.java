package com.jbk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStatement {
	public void Insert() 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1184","root","root");
			
			Statement s = c.createStatement();
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Your ID :");
			int id = sc.nextInt();
			
			System.out.println("Enter Your Name:");
			String name = sc.next();
			
			System.out.println("Enter Your City:");
			String city = sc.next();

			System.out.println("Enter your age:");
			int age=sc.nextInt();
			
			
			String sql = "INSERT INTO student (sid,sname,city) VALUES (" + id + ", '" + name + "', '" + city + "'+age+");

			int i = s.executeUpdate(sql);
			
			System.out.println(" DATA INSERTED ");
			
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}

	
	public void Update() 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1184","root","root");
			
			Statement s = c.createStatement();
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Your Name:");
			String name = sc.next();
			
			System.out.println("Enter Your City:");
			String city = sc.next();
			
			System.out.println("Enter Your ID :");
			int id = sc.nextInt();

			System.out.println("Enter your age:");
			int age=sc.nextInt();
			
			
			String sql = "UPDATE student SET name = '" + name + "', city = '" + city + "' WHERE id = " + id;


			int i = s.executeUpdate(sql);
			
			System.out.println("DATA UPDATED");
			
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}
	
	public void Delete() 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1184","root","root");
			
			Statement s = c.createStatement();
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Your ID :");
			int id = sc.nextInt();
			
			System.out.println("Enter your age:");
			int age=sc.nextInt();
			
			String sql = "DELETE FROM student  WHERE id = " + id;
			
			int i = s.executeUpdate(sql);
			
			System.out.println("DATA DELETED");
			
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}
	public void Display() 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1184","root","root");
			
			Statement s = c.createStatement();
			
			ResultSet rs = s.executeQuery("select * from student11");
			

			int i = s.executeUpdate(sql);
			while(rs.next()) {
				
				int id =rs.getInt(1);
				String name=rs.getString(2);
				String city=rs.getString(3);
				int age=rs.getInt(4);
				
				System.out.println(" ID:"+id+" Name:"+name+" City:"+city+"age:"+age);
			}
		}
		catch(Exception e )
		{
			e.getStackTrace();
		}
		
	}
		

}
