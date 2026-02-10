package com.app1.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app1.model.Students;

public class StudentsDAO {
	//DB connection
	private static Connection getConnection() {
		Connection con =null;
		
		//loading the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded successfully");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root");
		
			System.out.println("connected to Database successfully");
		
		} catch (ClassNotFoundException e) {
			System.out.println("jdbc driver not found");
			e.printStackTrace();
			
		}catch(SQLException e) {
			System.out.println("sql exception during connection");
			e.printStackTrace();
			}
		return con;
	}
	
	//method -insert or add student
	public static int addStudent(Students s) {
		int result=0;
		
		Connection con=getConnection();
		
		if(con==null) {
			System.out.println("database connection is null, cannot proceed");
		return 0;
		}
		
		try {
			PreparedStatement ps = con.prepareStatement("INSERT INTO students(name,email,course) VALUES(?,?,?)");
			ps.setString(1, s.getName());
			ps.setString(2, s.getEmail());
			ps.setString(3, s.getCourse());
			
			//execute the update
			result=ps.executeUpdate();//1 if success
			con.close();
		
		} catch (SQLException e) {
			System.out.println("sql error during student insert");
			e.printStackTrace();
		}
		return result;
	}
	
	

	//method -get all students (view)
	
	public static List<Students> getAllStudents(){
		List<Students> list = new ArrayList<>();
		
		try {
			Connection con=getConnection();
			PreparedStatement ps =con.prepareStatement("SELECT * FROM students");
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				Students s = new Students(
					rs.getInt("id"),
					rs.getString("name"),
					rs.getString("email"),
					rs.getString("course")
				);
				list.add(s);
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	//method -delete student
	public static int deleteStudent(int id) {
		int result = 0;
		
		Connection con = getConnection();
		try {
			PreparedStatement ps=con.prepareStatement("DELETE FROM students WHERE id=?");
			ps.setInt(1, id);
			
			result=ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return result;
	}
	
	//method -get student by id 
	public static Students getStudentById(int id) {
		Students s=null;
		
		Connection con=getConnection();
		try {
			PreparedStatement ps=con.prepareStatement("SELECT * FROM students WHERE id=?");
			ps.setInt(1, id);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				s=new Students(
						rs.getInt("id"),
						rs.getString("name"),
						rs.getString("email"),
						rs.getString("course")
						);
			}
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return s;
	}
	
	//method -update student
	public static int updateStudent(Students s) {
		int result=0;
		
		Connection con=getConnection();
		try {
			PreparedStatement ps =con.prepareStatement("UPDATE students SET name=?, email=?, course=? WHERE id=?");
		
			ps.setString(1, s.getName());
			ps.setString(2, s.getEmail());
			ps.setString(3, s.getCourse());
			ps.setInt(4, s.getId());
			
			result=ps.executeUpdate();
			con.close();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
