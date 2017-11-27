<%@ page language="java" import="java.util.*" pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>注册页面</title>
    
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">    
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->

  </head>
  
  <body>
  <form action="regist.do" method="post">
    <table>
       <tr>
           <td>用户名：</td>
           <td><input type="text" name="username"/></td>
       </tr>
       <tr>
           <td>年龄：</td>
           <td><input type="text" name="age"/></td>
       </tr>
        <tr>
           <td>收入：</td>
           <td><input type="text" name="income"/></td>
       </tr>
        <tr>
           <td>兴趣：</td>
           <td><input type="checkbox" name="interests" value="看书"/>看书
               <input type="checkbox" name="interests" value="上网"/>上网
               <input type="checkbox" name="interests" value="唱歌"/>唱歌
               <input type="checkbox" name="interests" value="运动"/>运动
               <input type="checkbox" name="interests" value="散步"/>散步
           </td>
       </tr>
       <tr>
           <td>是否结婚：</td>
           <td><input type="radio" name="married" value="true" checked="checked"/>是
               <input type="radio" name="married" value="false" />否
           </td>
       </tr>
       <tr>
                <td>list地址1：</td>
                <td><input type="text" name="list[0].addressListName"/></td>
            </tr>
            <tr>
                <td>list地址2：</td>
                <td><input type="text" name="list[1].addressListName"/></td>
            </tr>
            
             <tr>
                <td>set地址1：</td>
                <td><input type="text" name="set[0].addressSetName"/></td>
            </tr>
            <tr>
                <td>set地址2：</td>
                <td><input type="text" name="set[1].addressSetName"/></td>
            </tr> 
            <tr>
                <td>map地址1：</td>
                <td><input type="text" name="map['a0'].addressMapName"/></td>
            </tr>
            <tr>
                <td>map地址2：</td>
                <td><input type="text" name="map['a1'].addressMapName"/></td>
            </tr>
            <tr>
                <td>地址：</td>
                <td><input type="text" name="address.addressName"/></td>
            </tr>
       <tr>
           <td colspan="2"> <input type="submit" value="注册"/> </td>
       </tr>
    </table>
  </form>
  </body>
</html>