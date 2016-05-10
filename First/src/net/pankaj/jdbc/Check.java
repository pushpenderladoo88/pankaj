package net.pankaj.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.opensymphony.xwork2.ActionSupport;

public class Check extends ActionSupport {

   
   private String role;

   public String checkUserRole(String userId ) {
	  String empRole;
      String ret = ERROR;
      Connection conn = null;

      try {
         String URL = "jdbc:mysql://localhost:3306/manage";
         Class.forName("com.mysql.jdbc.Driver");
         conn = DriverManager.getConnection(URL, "root", "12345");
         String sql = "SELECT A.ROLE_NAME FROM role_tbl A, user_tbl B WHERE B.USER_ID = ? AND A.ROLE_ID = B.ROLE_ID";
         //sql+=" empid = ? ";
         PreparedStatement ps = conn.prepareStatement(sql);
         ps.setString(1, userId);
         //ps.setString(2, role);
         ResultSet rs = ps.executeQuery();

         while (rs.next()) {
            empRole = rs.getString("ROLE_NAME");
            ret = empRole;
         }
      } catch (Exception e) {
         ret = ERROR;
      } finally { 
         if (conn != null) {
            try {
               conn.close();
            } catch (Exception e) {
            }
         }
      }
      return ret;
   }

   public String getEmpRole() {
      return empRole;
   }

   public void setEmpRole(String empRole) {
      this.empRole = empRole;
   }

   public String getRole() {
      return role;
   }

   public void setRole(String role) {
      this.role = role;
   }
}
