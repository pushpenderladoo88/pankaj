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

    private String userId;
    private String firstName;
    private String last_Name;
    private String emailId;
    private String gender;
    private String roleId;
    private String managerId;
    private Date dob;
    private int salary;
    private char isActive;
    private String userame;
    private String password;
    private String statusId;
    private String status;
    private String taskAssignId;
    private String assignTo;
    private String taskId;
    private int estimatedHours;
    private int totalHours;
    private Date taskStartDate;
    private Date taskEndDate;
    private String taskName;
    private String roleName;
	public String getUserId() {
		return userId;

	public void setUserId(String userId) {
		this.userId = userId;

	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
<<<<<<< HEAD
	public String getLast_Name() {
		return last_Name;
=======
	public String getLast_name() {
		return last_name;
>>>>>>> refs/remotes/origin/master
	}
<<<<<<< HEAD
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
=======
	public void setLast_name(String last_name) {
		this.last_name = last_name;
>>>>>>> refs/remotes/origin/master
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
<<<<<<< HEAD
	public String getRoleId() {
		return roleId;
=======
	public String getRole_id() {
		return role_id;
>>>>>>> refs/remotes/origin/master
	}
<<<<<<< HEAD
	public void setRoleId(String roleId) {
		this.roleId = roleId;
=======
	public void setRole_id(String role_id) {
		this.role_id = role_id;
>>>>>>> refs/remotes/origin/master
	}
<<<<<<< HEAD
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
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
	public char getIsActive() {
		return isActive;
	}
	public void setIsActive(char isActive) {
		this.isActive = isActive;
	}
	public String getUserame() {
		return userame;
	}
	public void setUserame(String userame) {
		this.userame = userame;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatusId() {
		return statusId;
	}
	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTaskAssignId() {
		return taskAssignId;
	}
	public void setTaskAssignId(String taskAssignId) {
		this.taskAssignId = taskAssignId;
	}
	public String getAssignTo() {
		return assignTo;
	}
	public void setAssignTo(String assignTo) {
		this.assignTo = assignTo;
	}
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public int getEstimatedHours() {
		return estimatedHours;
	}
	public void setEstimatedHours(int estimatedHours) {
		this.estimatedHours = estimatedHours;
	}
	public int getTotalHours() {
		return totalHours;
	}
	public void setTotalHours(int totalHours) {
		this.totalHours = totalHours;
	}
	public Date getTaskStartDate() {
		return taskStartDate;
	}
	public void setTaskStartDate(Date taskStartDate) {
		this.taskStartDate = taskStartDate;
	}
	public Date getTaskEndDate() {
		return taskEndDate;
	}
	public void setTaskEndDate(Date taskEndDate) {
		this.taskEndDate = taskEndDate;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
=======
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
        
>>>>>>> refs/remotes/origin/master
}
