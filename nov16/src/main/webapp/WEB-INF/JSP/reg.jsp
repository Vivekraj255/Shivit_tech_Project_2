<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">

$(document).ready(function(){
	
	$("#stcode").change(function(){
		 alert("hi");
		$.ajax({
		    url : "distList?stCode="+$("#stcode").val(),
		    type: "GET",
		    success: function(data)
		    {
		        console.log(data);
		        $("#dCode").empty();
		        
		        for(var i=0; i<data.length; i++ ){
		        	$("#dCode").append("<option value="+data[i].distCode+">"+data[i].distName+"</option>");
		        }
		    },
		    error: function (errorThrown)
		    {
		    	console.log(errorThrown);
		 
		    }
		   });
		 
	});
	
});

</script>






</head>
<body>
  
  
  <body>
<f:form action="RegSave" modelAttribute="ok" method="get">
<table border="4" bgcolor="cyan">



<tr><td>Field Name</td><td><f:input path="field_name"/></td></tr>
<tr><td>Module Name</td><td><f:input path="module_id"/></td></tr>

<tr><td><input type="submit"></td><td><a href=view>View</a></td><td><a href=s>titu</a></td></tr>




</table>


</f:form>
</body>
</html>