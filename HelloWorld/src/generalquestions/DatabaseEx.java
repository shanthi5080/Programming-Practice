package generalquestions;

import java.sql.*;

public class DatabaseEx {
	
	
	 public static void main(String[] args)
	 throws SQLException {
	int ret_code;
	Connection conn = null;
	 try {
	  int i_empno[] = {1001, 1002, 7788};
	  String i_ename[] = {"JOHN","DAVID","ORATEST"};
	  String i_job[] = {"MANAGER","ANALYST","CLERK"};
	  int i_mgr[] = {7839, 1001, 1002};
	  String i_hiredate = "01-JAN-01";
	  float i_sal[] = {10000,6000, 4000};
	  float i_comm[] = {2000,1000,500};
	  int i_deptno = 10;
	  //Load and register Oracle driver
	  DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	 //Establish a connection

	 conn = DriverManager.getConnection("jdbc:oracle:thin:@training:1521:Oracle", "oratest", "oratest");
	 

	 String sql1 = "SELECT empno FROM emp WHERE empno = ?" ;
	 String sql2 = "INSERT INTO emp VALUES (?,?,?,?,?,?,?,?)";

	 PreparedStatement pstmt1 = conn.prepareStatement(sql1);
	 PreparedStatement pstmt2 = conn.prepareStatement(sql2);
	 for (int idx=0;idx<3;idx++)
	 {
	  pstmt1.setInt(1, i_empno[idx]);
	  ResultSet rset = pstmt1.executeQuery();
	  if (rset.next()) {
	   System.out.println("The employee "
	     +i_empno[idx]+" already exists.");
	   rset.close();
	   }
	  else
	   {
	   pstmt2.setInt(1, i_empno[idx]);
	   pstmt2.setString(2, i_ename[idx]);
	   pstmt2.setString(3, i_job[idx]);
	   pstmt2.setInt(4, i_mgr[idx]);
	   pstmt2.setString(5, i_hiredate);
	   pstmt2.setFloat(6, i_sal[idx]);
	   pstmt2.setFloat(7, i_comm[idx]);
	   pstmt2.setInt(8, i_deptno);
	   pstmt2.executeUpdate(); }
	  } // End of for loop
	  pstmt1.close();
	  pstmt2.close();
	  conn.close();
	  } catch (SQLException e) {ret_code = e.getErrorCode(); 
	   System.err.println(ret_code + e.getMessage()); conn.close();}
	 }
	}
	


