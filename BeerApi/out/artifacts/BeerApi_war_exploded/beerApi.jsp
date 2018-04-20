<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: wilder
  Date: 19/04/18
  Time: 19:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="header.jsp" />



<div class="container">
    <div class="row">
<c:forEach items="${beer}" var="beer">
    <div class="col-md">
        <div class="list-group">
        <button type="button" class="list-group-item list-group-item-action active bg-dark"data-toggle="tooltip" data-placement="bottom" title="${beer.description}">
                ${beer.name}
        </button>
        <button type="button" class="list-group-item  list-group-item-action"><img src=${beer.beerUrls} data-toggle="tooltip" data-placement="bottom" title="${beer.description}">
        </button>
    </div>
    </div>
</c:forEach>
    </div>
</div>
</body>
</html>
