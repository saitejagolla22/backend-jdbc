import java.sql.*;
import java.util.*;

class Student_info
{ 
public static void main(String args[])
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("Loaded");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC82","IPC82");
System.out.println("Established");
Statement sct=con.createStatement();
//String sql="CREATE TABLE STUDENTS_INFO(id INT PRIMARY KEY,NAME VARCHAR(20),address VARCHAR(20),email VARCHAR(20) unique)";
//sct.executeUpdate(sql);
//String st1="INSERT INTO STUDENTS_INFO VALUES(582,'SAI TEJA','EDARA','saiteja22@gmail.com')";
//sct.executeUpdate(st1);
//String st2="INSERT INTO STUDENTS_INFO VALUES(583,'RAVI TEJA','DACHEPALLI','raviteja12@gmail.com')";
//sct.executeUpdate(st2);
//String st3="INSERT INTO STUDENTS_INFO VALUES(587,'MARUTHI','ACHEMPETA','jmsskumar@gmail.com')";
//sct.executeUpdate(st3);
//String st4="INSERT INTO STUDENTS_INFO VALUES(516,'MANOHAR','VIJAYAWADA','manohar20@gmail.com')";
//sct.executeUpdate(st4);
//String st5="INSERT INTO STUDENTS_INFO VALUES(517,'MAHINDRA','PRAKASAM','mahindra20@gmail.com')";
//sct.executeUpdate(st5);
Scanner s=new Scanner(System.in);
System.out.println("Enter your employee id:");
int id=s.nextInt();

String sql="select * from STUDENTS_INFO";
ResultSet rs=sct.executeQuery(sql);
boolean result=false;

while(rs.next())
{
if(id==rs.getInt(1))
{
System.out.println("You are valid user");
System.out.println("Hello "+rs.getString(2));
System.out.println("Ur address is "+rs.getString(3));
System.out.println("ur mail is "+rs.getString(4));
result=true;
break;
}
}
if(result==false)
System.out.println("Invalid User");
}
catch(Exception e)
{
System.out.println(e);
}
}
}

