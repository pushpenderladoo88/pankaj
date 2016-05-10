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
    private String id; 
 
    private ContactManager contactManager;
 
    public ContactAction() {
        contactManager = new ContactManager();
    }
 
    public String execute() {
        this.contactList = contactManager.list();
        System.out.println("execute called");
        return SUCCESS;
    }
    
 public String checkEmployee() {
	 Check checkUser = new Check();
<<<<<<< HEAD
	 System.out.println("id is "+ id);
	 String userRole = checkUser.checkUserRole(id);
=======
	 String userRole = checkUser.checkUserRole(userId);
>>>>>>> refs/remotes/origin/master
			 if(userRole.equalsIgnoreCase("MANAGER")){
				 return "register";
			 }else{
				 return "profile";
			 }
 }
      
    public String signup() throws Exception{
    	
        return "check";
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
 
    public String getId() {
        return id;
    }
 
    public void setId(String id) {
        this.id = id;
    }

	
    
}
