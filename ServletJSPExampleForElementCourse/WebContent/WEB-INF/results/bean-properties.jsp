<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
<HEAD><TITLE>Accessing Bean Properties</TITLE>
<LINK REL=STYLESHEET
      HREF="./css/JSP-Styles.css"
      TYPE="text/css">
</HEAD>
<BODY>
<TABLE BORDER=5 ALIGN="CENTER">
  <TR><TH CLASS="TITLE">
  Accessing Bean Properties
</TABLE>
<P>
<UL>
  <LI><B>First Name:</B> ${employee.name.firstName}
  <LI><B>Last Name:</B> ${employee.name.lastName}
  <LI><B>Company Name:</B> ${employee.company.companyName}
  <LI><B>Company Business:</B> ${employee.company.business}
</UL>
</BODY></HTML>