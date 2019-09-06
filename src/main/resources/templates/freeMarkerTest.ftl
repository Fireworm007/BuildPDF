<html>
<head>
    <title>freeMarkerTest</title>
</head>
<body>
<#--<div>-->
<#--    Hello,${name}-->
<#--</div>-->

<#--<#list  strList  as  item>-->
<#--    ${item!}<br/>-->
<#--    <table border="表格">-->
<#--        <tr>-->
<#--            <td>Row 1, cell 1</td>-->
<#--            <td>Row 1, cell 2</td>-->
<#--        </tr>-->
<#--    </table>-->
<#--</#list>-->
<#list  pdfList  as  item>
    ${item!}<br/>
    <table border="表格">
        <tr>
            <td>${item.title}</td>
            <td>${item.sourceInfo}</td>
            <td>${item.period}</td>
        </tr>
    </table>
</#list>
</body>
</html>