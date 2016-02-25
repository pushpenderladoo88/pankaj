<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contact Manager</title>
</head>
<body>
<h1>Contact Manager</h1>
<s:actionerror/>
 
<s:form action="add" method="post">
    <s:textfield name="contact.firstName" label="Firstname"/>
    <s:textfield name="contact.lastName" label="Lastname"/>
    <s:textfield name="contact.emailId" label="Email"/>
    <s:textfield name="contact.cellNo" label="Cell No."/>
    <s:textfield name="contact.website" label="Homepage"/>
    <s:textfield name="contact.birthDate" label="Birthdate"/>
    <s:submit value="Add Contact" align="center"/>
</s:form>
 
 
<h2>Contacts</h2>
<table width="100%" border="1">
<tr bgcolor="#B5A2E3">
    <th>Name</th>
    <th>Email</th>
    <th>Cell No.</th>
    <th>Birthdate</th>
    <th>Homepage</th>
    <th>Delete</th>
</tr>

<s:iterator value="contactList" var="contact">

    <tr bgcolor="#FF648C">
        <td><s:property value="lastName"/>, <s:property value="firstName"/> </td>
        <td><s:property value="emailId"/></td>
        <td><s:property value="cellNo"/></td>
        <td><s:property value="birthDate"/></td>
        <td><a href=""><s:property value="website"/></a></td>
        <td><a href="delete?id=<s:property value="id"/>">delete</a></td>
    </tr> 
  
</s:iterator>
 </table>

</body>
</html>
