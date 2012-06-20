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
		<form:form id="form" method="post" modelAttribute="checkBoxesBean" cssClass="cleanform" action="/springmvc-1/view/checkboxsubmit">
			<!--<form:errors path="*"/>-->
		  	<fieldset class="cleanform">
		  		<legend>Checkboxes</legend>
		  		<table >
		  			<tr>
		  				<td>
		  					<form:label path="subscribe" cssClass="subscribe" cssErrorClass="subscribeError">
		  					<s:message code="subscribe" text="Subscribe?"></s:message> 
		 					</form:label>
		  				</td>
		  				<td>
		  					<form:checkbox path="subscribe"/>
		  				</td>
		  				<td>
		  					<form:errors path="subscribe"/>
		  				</td>
		  			</tr>
		  			<tr>
		  				<td>
		  					<form:label path="interests">
		  						<s:message code="interests" text="Interests"></s:message>
		 					</form:label>
		  				</td>
		  				<td>
			  				Cricket: <form:checkbox path="interests" value="Cricket"/>
			  				Valleyball: <form:checkbox path="interests" value="Valleyball"/>
			  				Football: <form:checkbox path="interests" value="Football"/>
		  				</td>
			  				<td>
			  				<form:errors path="interests"/>
		  				</td>
		  			</tr>
					<!--<tr>
		  				<td>
		  					<form:label path="interests">
		  						<s:message code="interests" text="Interests"></s:message>
		 					</form:label>
		  				</td>
		  				<td>
			  				<form:checkboxes path="interestsMap" items="${checkBoxesBean.interestsMap}" />
		  				</td>
			  				<td>
			  				<form:errors path="interestsMap"/>
		  				</td>
		  			</tr>-->
		  			<!--<tr>
		  				<td>
		  					<form:label path="interests">
		  						<s:message code="interests" text="Interests"></s:message>
		 					</form:label>
		  				</td>
		  				<td>
			  				<form:radiobuttons path="interestsMap" items="${checkBoxesBean.interestsMap}" />
		  				</td>
			  				<td>
			  				<form:errors path="interestsMap"/>
		  				</td>
		  			</tr>-->
		  			<!-- forms:select-->
		  			<tr>
		  				<td>
		  					<form:label path="interests">
		  						<s:message code="interests" text="Interests"></s:message> 
		 					</form:label>
		  				</td>
		  				<td>
		  					<form:select path="interests" items="${checkBoxesBean.interests}"/>
		  				</td>
		  				<td>
		  					<form:errors path="interests"/>
		  				</td>
		  			</tr>
		  			<!-- forms:select and form:option-->
		  			<tr>
		  				<td>
		  					<form:label path="interests">
		  						<s:message code="interests" text="Interests"></s:message> 
		 					</form:label>
		  				</td>
		  				<td>
		  					<form:select path="interests">
		  						<form:option value="Football"></form:option>
		  						<form:option value="Cricket"></form:option>
		  						<form:option value="Velloy Ball"></form:option>
		  					</form:select>
		  				</td>
		  				<td>
		  					<form:errors path="interests"/>
		  				</td>
		  			</tr>
		  			<!-- forms:select and form:options-->
		  			<tr>
		  				<td>
		  					<form:label path="interests">
		  						<s:message code="interests" text="Interests"></s:message> 
		 					</form:label>
		  				</td>
		  				<td>
		  					<form:select path="interests">
		  						<form:options items="${checkBoxesBean.interests}"></form:options>
		  					</form:select>
		  				</td>
		  				<td>
		  					<form:errors path="interests"/>
		  				</td>
		  			</tr>
		  			<tr>
		  				<td>
		  					<form:label path="user">
		  						<s:message code="user" text="User"></s:message> 
		 					</form:label>
		  				</td>
		  				<td>
		  					<form:input path="user" value="firstName-lastName" />
		  				</td>
		  				<td>
		  					<form:errors path="user"/>
		  				</td>
		  			</tr>
		  		</table>				
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