package net.pankaj.model;

import java.io.Serializable;
import java.sql.Date;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.opensymphony.xwork2.ActionSupport;
 

public class Contact extends ActionSupport implements Serializable{
    
    private static final long serialVersionUID = -8767337896773261247L;
 
    private String user_id;
    private String first_name;
    private String last_name;
    private String email_id;
    private String gender;
    private String role_id;
    private String manager_id;
    private Date dob;
    private int salary;
    private char is_active;
    private String username;
    private String password;
    private String status_id;
    private String status;
    private String task_assign_id;
    private String assign_to;
    private String task_id;
    private int estimated_hours;
    private int total_hours;
    private Date task_start_date;
    private Date task_end_date;
    private String task_name;
    private String role_name;
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRole_id() {
		return role_id;
	}
	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}
	public String getManager_id() {
		return manager_id;
	}
	public void setManager_id(String manager_id) {
		this.manager_id = manager_id;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public char getIs_active() {
		return is_active;
	}
	public void setIs_active(char is_active) {
		this.is_active = is_active;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatus_id() {
		return status_id;
	}
	public void setStatus_id(String status_id) {
		this.status_id = status_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTask_assign_id() {
		return task_assign_id;
	}
	public void setTask_assign_id(String task_assign_id) {
		this.task_assign_id = task_assign_id;
	}
	public String getAssign_to() {
		return assign_to;
	}
	public void setAssign_to(String assign_to) {
		this.assign_to = assign_to;
	}
	public String getTask_id() {
		return task_id;
	}
	public void setTask_id(String task_id) {
		this.task_id = task_id;
	}
	public int getEstimated_hours() {
		return estimated_hours;
	}
	public void setEstimated_hours(int estimated_hours) {
		this.estimated_hours = estimated_hours;
	}
	public int getTotal_hours() {
		return total_hours;
	}
	public void setTotal_hours(int total_hours) {
		this.total_hours = total_hours;
	}
	public Date getTask_start_date() {
		return task_start_date;
	}
	public void setTask_start_date(Date task_start_date) {
		this.task_start_date = task_start_date;
	}
	public Date getTask_end_date() {
		return task_end_date;
	}
	public void setTask_end_date(Date task_end_date) {
		this.task_end_date = task_end_date;
	}
	public String getTask_name() {
		return task_name;
	}
	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
        
}
