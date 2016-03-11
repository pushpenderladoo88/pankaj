package net.pankaj.model;

import java.io.Serializable;
import java.sql.Date;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.opensymphony.xwork2.ActionSupport;
 
@Entity
@Table(name="Contacts")
public class Contact extends ActionSupport implements Serializable{
    
    private static final long serialVersionUID = -8767337896773261247L;
 
    private Long id;
    private String firstName;
    private String lastName;
    private String emailId;
    private String cellNo;
    private Date birthDate;
    private String website;
     
    private Date created;
 
    @Id
    @GeneratedValue
    @Column(name="id")
    public Long getId() {
        return id;
    }
    @Column(name="firstname")
    public String getFirstName() {
        return firstName;
    }
    @Column(name="lastname")
    public String getLastName() {
        return lastName;
    }
    @Column(name="email_id")
    public String getEmailId() {
        return emailId;
    }
    @Column(name="cell_no")
    public String getCellNo() {
        return cellNo;
    }
    @Column(name="birthdate")
    public Date getBirthDate() {
        return birthDate;
    }
    @Column(name="website")
    public String getWebsite() {
        return website;
    }
    @Column(name="created")
    public Date getCreated() {
        return created;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public void setCellNo(String cellNo) {
        this.cellNo = cellNo;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public void setCreated(Date created) {
        this.created = created;
    }
    public void setWebsite(String website) {
        this.website = website;
    }
    public void validate()
    {
       if (firstName == null || firstName.trim().equals(""))
       {
          addFieldError("firstName","The name is required");
       }
       if (lastName == null || lastName.trim().equals(""))
       {
          addFieldError("lastName","The name is required");
       }
       if (cellNo != "\\d+")
       {
          addFieldError("cellNo","Cell number cannot have any character");
       }
    }
}
