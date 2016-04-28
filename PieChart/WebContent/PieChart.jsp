<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
        function refreshPage() 
        {
                document.forms.formId.submit();
        }
</script>
</head>
<body>
 <h3>Pie Chart</h3>
 
        <form id="formId">
           <input type="button" onclick="refreshPage()" value="Refresh Page" />
           <br /> <img src="displayChart" />
        </form>

</body>
</html>