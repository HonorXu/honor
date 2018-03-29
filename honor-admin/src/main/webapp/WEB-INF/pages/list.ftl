<!DOCTYPE html>

<html lang="en">

<body>
<#list list as book>

title: ${book.title} <br>
author: ${book.author} <br>
typeId: ${book.typeId}<br>
</#list>
<p>======================</p>
${map.id}---->${map.name}
</body>
</html>