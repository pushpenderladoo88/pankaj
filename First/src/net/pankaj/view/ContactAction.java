package net.pankaj.view;

import java.util.List;

import net.pankaj.controller.ContactManager;
import net.pankaj.jdbc.Check;
import net.pankaj.model.Contact;
 
import com.opensymphony.xwork2.ActionSupport;
 
 
public class ContactAction extends ActionSupport {
 
    private static final long serialVersionUID = 9149826260758390091L;
    private Contact contact;
    private List<Contact> contactList;
    private Long id;
 
    private ContactManager contactManager;
 
    public ContactAction() {
        contactManager = new ContactManager();
    }
 
    public String execute() {
        this.contactList = contactManager.list();
        System.out.println("execute called");
        return SUCCESS;
    }
    
 public string checkEmployee() {
	 Check checkUser = new Check();
	 //acti
	 String userRole = checkUser.checkUserRole(userId)
			 if(userRole.equalsIgnoreCase("MANAGER")){
				 return "register";
			 }else{
				 return "registerError";
			 }
 }
      
    public String signup() throws Exception{
    	
        return "check";
    }
 
    public String delete() {
        contactManager.delete(getId());
        return SUCCESS;
    }
   
    public String update(){
    	try{
    	contactManager.update(getContact());
    	}
    	catch (Exception e){
    		e.printStackTrace();
    	}
    	return SUCCESS;
    }
    public Contact getContact() {
        return contact;
    }
 
    public List<Contact> getContactList() {
        return contactList;
    }
 
    public void setContact(Contact contact) {
        this.contact = contact;
    }
 
    public void setContactList(List<Contact> contactsList) {
        this.contactList = contactsList;
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
    
    
}