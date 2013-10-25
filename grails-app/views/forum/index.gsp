<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title>Forum</title>
  <meta name="layout" content="main">
  <r:require modules="bootstrap"/>
</head>
<body>
    <div class="categories">
        <g:each in="${groups}" var="group" status="index">
            <g:render template="/helpers/category" model="[group: group]" />
        </g:each>
    </div>
</body>
</html>