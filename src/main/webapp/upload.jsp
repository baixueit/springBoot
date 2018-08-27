<%@page contentType = "text/html; charset = UTF-8" pageEncoding = "UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html>
<body>
    <form method = "post" enctype="multipart/form-data" action = "${pageContext.request.contextPath}/file/upload">
        <input type = "file" name = "file" />
        <input type = "submit" value ="submit" />
    </form>
</body>
</html>
