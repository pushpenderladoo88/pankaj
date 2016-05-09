package net.pankaj.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.opensymphony.xwork2.ActionSupport;

public class Check extends ActionSupport {

   private String empid;
   private String role;

   public String execute() {
      String ret = ERROR;
      Connection conn = null;

      try {
         String URL = "jdbc:mysql://localhost:3306/manage";
         Class.forName("com.mysql.jdbc.Driver");
         conn = DriverManager.getConnection(URL, "root", "12345");
         String sql = "SELECT empid FROM manage WHERE";
         sql+=" empid = ? ";
         PreparedStatement ps = conn.prepareStatement(sql);
         ps.setString(1, empid);
         //ps.setString(2, role);
         ResultSet rs = ps.executeQuery();

         while (rs.next()) {
            empid = rs.getString(1);
            ret = SUCCESS;
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

   public String getEmpid() {
      return empid;
   }

   public void setEmpid(String empid) {
      this.empid = empid;
   }

   public String getRole() {
      return role;
   }

   public void setRole(String role) {
      this.role = role;
   }
}
