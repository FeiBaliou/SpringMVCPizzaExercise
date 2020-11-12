<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Choose Your Pizza</h1>
        
        <form:form action="${pageContext.request.contextPath}/order" 
                   method="POST"
                   modelAttribute="order">
            <h4>Choose bread size:</h4>
            <div>
                <form:radiobuttons path="pizza.breadSize" items="${sizes}" itemLabel="name" itemValue="id"/>
            </div>
            <h4>Choose ingredients:</h4>
            <div>
                <form:checkboxes path="pizza.ingredientList" items="${ingredients}" itemLabel="name" itemValue="id"/>
                <%--<c:forEach items="${ingredients}" var="ingr">
                    <input type="checkbox" name="ingredientList" value="${ingr}"/>${ingr.name}
                    <br/>
                </c:forEach>--%>
            </div>
            <h4>Choose payment method:</h4>
            <div>
                <form:select path="payment" items="${payments}" itemLabel="name" itemValue="id" />
            </div>
            <h4>Your details:</h4>
            <div>
                Name:<form:input path="customer.name"/>
                <br/>
                Age:<form:input path="customer.age"/>
                <br/>
                <input type="submit" value="Submit"/>
            </div>
        </form:form>
    </body>
</html>
