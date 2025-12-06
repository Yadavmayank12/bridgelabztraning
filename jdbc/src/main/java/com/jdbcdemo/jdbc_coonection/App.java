package com.jdbcdemo.jdbc_coonection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class App
{
private static final String URL="jdbc:mysql://localhost:3306/testtdb";    
private static final String UR="root";
private static final String pass="Root";

public static Connection conn;

public static void main( String[] args ) throws Exception
{
//System.out.println( "Hello World!" );
   conn=DriverManager.getConnection(URL, UR, pass);
   System.out.println("Database connection created...");
   Statement st = conn.createStatement();
// 1️⃣ CREATE TABLE
String createTable =
"CREATE TABLE IF NOT EXISTS studentdata (" +
"id INT PRIMARY KEY AUTO_INCREMENT, " +
"name VARCHAR(100), " +
"email VARCHAR(100), " +
"age INT" +
")";

st.executeUpdate(createTable);//

System.out.println("Table 'students' created.");

// 2️⃣ INSERT DATA
String insertData =
"INSERT INTO students (name, email, age) VALUES " +
"('Tejas ', 'Tejas@example.com', 22), " +
"('Rani', 'rani@example.com', 20), " +
"('Madu', 'Madu@example.com', 23)";

st.executeUpdate(insertData);//

System.out.println("Data inserted.");

// 3️⃣ READ DATA (SELECT)
String readQuery = "SELECT * FROM students";

ResultSet rs = st.executeQuery(readQuery);
System.out.println("\n--- Student Records ---");
while (rs.next()) {
int id = rs.getInt("id");
String name = rs.getString("name");
String email = rs.getString("email");
int age = rs.getInt("age");

System.out.println(id + " | " + name + " | " + email + " | " + age);
}
rs.close();
st.close();
   
}

}
