<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>freeMarkerTest</title>
    <style>
        @page {
            size: 210mm 290mm;
            /*padding: 16px 25px 0px 28px;*/
        }
        table,td,th,tr{
            border: 1px solid black;
        }
        table{
            border-collapse: collapse;
            width: 100%;
            max-width: 960px;
            font-family: SimSun;
        }
        td {
            /*height: 52px;*/
        }
        th{
            background-color:#1d625c;
            height: 52px;
        }
        .item_title{
            /*width: 557px;*/
            width: 75%;
        }
        .source_info{
            /*width: 60px;*/
            width: 8%;
        }
        .period{
            /*width:120px;*/
            width: 16%;
        }
        .spacing_bar{
            width: 739px;
            height: 19px;
        }
    </style>
</head>
<body>

<div>
<#list  pdfList  as  item>
    <table cellspacing="0">
        <tr>
            <th class="item_title">Firstname</th>
            <th class="source_info">Lastname</th>
            <th class="period">Savings</th>
        </tr>
        <tr>
            <td>${item.title}<br/></td>
            <td>${item.sourceInfo}<br/></td>
            <td>${item.period}<br/></td>
        </tr>
    </table>
    <div class="spacing_bar"></div>
</#list>
</div>
</body>
</html>