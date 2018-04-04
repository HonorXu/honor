<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh_CN">
<meta charset="utf-8">
<%@ include file="../head.jsp"%>

<body class="gray-bg">
	<div class="wrapper wrapper-content ">
		<div class="col-sm-12">
			<div class="ibox">
				<div class="ibox-body">
					<div id="exampleToolbar" role="group">
						<button shiro:hasPermission="sys:role:add" type="button"
							class="btn btn-primary" onclick="add()">
							<i class="fa fa-plus" aria-hidden="true"></i>添加
						</button>
						<button shiro:hasPermission="sys:role:batchRemove" type="button"
							class="btn btn-danger" onclick="batchRemove()">
							<i class="fa fa-trash" aria-hidden="true"></i>删除
						</button>
					</div>
					<table id="exampleTable" data-mobile-responsive="true">
					</table>
				</div>
			</div>
		</div>
		<!--shiro控制bootstraptable行内按钮看见性 来自bootdo的创新方案 -->
		<div>
			<script type="text/javascript">
				var s_edit_h = 'hidden';
				var s_remove_h = 'hidden';
			</script>
		</div>
		<div shiro:hasPermission="sys:role:edit">
			<script type="text/javascript">
				s_edit_h = '';
			</script>
		</div>
		<div shiro:hasPermission="sys:role:remove">
			<script type="text/javascript">
				var s_remove_h = '';
			</script>
		</div>

	</div>
	<div th:include="include::footer"></div>
	<script type="text/javascript" src="/js/appjs/sys/role/role.js">
		
	</script>
</body>

</html>