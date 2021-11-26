<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <link rel="stylesheet" href="../static/css/base.css">
    <link rel="stylesheet" href="../static/css/inner.css">
    <link rel="stylesheet" href="../static/fonts/iconfont.css">
    <link rel="shortcut icon" href="../static/img/bitbug_favicon.ico">

</head>

<body>

	<%@ include file="/common-bars/topbar.jsp" %>
	
    <div class="main">
    
   		<%@ include file="/common-bars/studentsidebar.jsp" %>
   	
   	
        <div class="fineright">
        
			<div class="message">
				 <c:if test="${fineMoney != null}">
               		 还需还款金额${fineMoney}元 若逾期工作人员将会电话催促!

               		 <div class="scare"><img alt="" src="../static/img/scare.jpg"></div>
		        </c:if>
		        <c:if test="${fineMessage != null}">

               		 <div class="scare"><img alt="" src="../static/img/happy.jpg"></div>
		        </c:if>
			</div>
			
			<div class="operation">若对工作人员不满意可点击举报!<img alt="" src="../static/img/happy.jpg"></div>
			<a class="btn-report" href="#">举报</a>
		
        </div>


        <div class="fineright">

        </div>
        
        <div class="ok">点击刷新页面<a class="btn" href="/bookmanagement/log/payForFine">刷新</a></div>
        
    </div>
</body>
</html>