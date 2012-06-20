<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Login</title>
	<!-- <link href="<c:url value="/resources/css/form.css" />" rel="stylesheet"  type="text/css" />  -->
	<link  href="/springmvc-1<s:theme code='styleSheet'/>" rel="stylesheet"  type="text/css" />
	<script type="text/javascript" src="<c:url value="/resources/jquery/1.6/jquery.js" />"></script>
</head>
<body>
	<br/><br/><br/><br/><br/><br/><br/>
		<form:form id="form" method="post" modelAttribute="loginBean" cssClass="cleanform" action="/springmvc-1/login">
			<!--<form:errors path="*"/>-->
		  	<fieldset class="cleanform">
		  		<legend>Login Info</legend>
		  		<table >
		  			<tr>
		  				<td>
		  					<form:label path="userId" cssClass="userId" cssErrorClass="userIdError">
		  					<s:message code="userId" text="User Id"></s:message> 
		 					</form:label>
		  				</td>
		  				<td>
		  					<form:input path="userId" cssClass="userId" cssErrorClass="userIdError"/>
		  				</td>
		  				<td>
		  					<form:errors path="userId"/>
		  				</td>
		  			</tr>
		  			<tr>
		  				<td>
		  					<form:label path="password">
		  						<s:message code="password" text="Password"></s:message>
		 					</form:label>
		  				</td>
		  				<td>
			  				<form:password path="password" />
		  				</td>
			  				<td>
			  				<form:errors path="password"/>
		  				</td>
		  			</tr>

		  			<tr>
		  				<td>
		  					<form:label path="server">
		  						<s:message code="server" text="Server"></s:message> 
		 					</form:label>
		  				</td>
		  				<td>
		  					<form:input path="server" />
		  				</td>
		  				<td>
		  					<form:errors path="server"/>
		  				</td>
		  			</tr>

		  			<tr>
		  				<td>
		  					<form:label path="database">
		  						<s:message code="database" text="Database"></s:message>
		  					</form:label>
		  				</td>
		  				<td>
		  					<form:input path="database" />
		  				</td>
		  				<td>
		  					<form:errors path="database"/>
		  				</td>
		  			</tr>

		  			<tr>
		  				<td>
		  					<form:label path="connection">
		  						<s:message code="connection" text="Connection"></s:message> 
		  					</form:label>
		  				</td>
		  				<td>
							<form:input path="connection" />		  				
		  				</td>
		  				<td>
		  					<form:errors path="connection"/>
		  				</td>
		  			</tr>
		  		</table>
				<!--<form:checkbox path="autoLogin" label="Auto Login " />-->	
				
		  	</fieldset>
			<p><button type="submit">Submit</button></p>
		</form:form>
		<script type="text/javascript">
			$(document).ready(function() {
				/*$("#form").submit(function() {  
					$.post($(this).attr("action"), $(this).serialize(), function(html) {
						$("#formsContent").replaceWith(html);
						$('html, body').animate({ scrollTop: $("#message").offset().top }, 500);
					});
					return false;  
				});	*/		
			});
		</script>
</body>
</html>