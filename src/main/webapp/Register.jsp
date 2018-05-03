<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>User Register Page</title>
</head>
<body>

<s:form action="register">
    <%--注意：这里的"userForm.userName"是与Register.java中的userForm挂起来的，通过Register.jsp，将用户输入传递给userForm,然后再通过userManagerImpl将userForm的内容拷贝给user，再由baseDao进行存储--%>
    <s:textfield name="userForm.userName" label="用户名"></s:textfield>
    <s:password name="userForm.password" label="密码"></s:password>
    <s:select list="#{'1':'男','0':'女'}" listKey="key" listValue="value"
              name="userForm.gender" label="性别" value="1"></s:select>
    <s:submit value="注册"></s:submit>
</s:form>

</body>
</html>