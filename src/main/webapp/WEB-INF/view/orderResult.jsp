<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Thank you, you ordered a nice Pizza</h1>
        <p>
            Size: ${order.pizza.breadSize.name}
        </p>
        <p>
            Ingredients: 
        <ul>
            <c:forEach items="${order.pizza.ingredientList}" var="ingredient">
                <li>${ingredient.name}</li>
            </c:forEach>
        </ul>
        </p>
        <p>
            Payment: ${order.payment.name}
        </p>
        <p>
            Name: ${order.customer.name}
        </p>
        <p>
            Age: ${order.customer.age}
        </p>
        <h3>Thank you!!</h3>
    </body>
</html>
