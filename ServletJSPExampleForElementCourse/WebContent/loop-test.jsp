<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
<HEAD>
<TITLE>Loop Test</TITLE>
<LINK REL=STYLESHEET
      HREF="JSP-Styles.css"
      TYPE="text/css">
</HEAD>
<BODY>
<H1>Loop Test</H1>
<P></P>
<%@ taglib uri="/WEB-INF/tlds/csajsp-taglib-adv.tld"
           prefix="csajsp" %>
<CENTER>
<% String[] test = {"a", "b", "c", "d", "e"};
   request.setAttribute("test", test);
%>
<csajsp:forEach items="${test}" var="entry">
  <H2>${entry}</H2>
</csajsp:forEach>
</CENTER>
</BODY></HTML>