<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- import CSS -->
<link rel="stylesheet"
	href="https://unpkg.com/element-ui/lib/theme-chalk/index.css">
</head>
<body>
	<div id="app">
	
		<el-container style="height: 1000px; border: 1px solid #eee">
		  <el-aside width="200px" style="background-color: rgb(238, 241, 246)">
		    <el-menu :default-openeds="['1', '3']">
		      <el-submenu index="1">
		        <template slot="title"><i class="el-icon-message"></i>导航一</template>
		        <el-menu-item-group>
		          <template slot="title">分组一</template>
		          <el-menu-item index="1-1">选项1</el-menu-item>
		          <el-menu-item index="1-2">选项2</el-menu-item>
		        </el-menu-item-group>
		        <el-menu-item-group title="分组2">
		          <el-menu-item index="1-3">选项3</el-menu-item>
		        </el-menu-item-group>
		        <el-submenu index="1-4">
		          <template slot="title">选项4</template>
		          <el-menu-item index="1-4-1">选项4-1</el-menu-item>
		        </el-submenu>
		      </el-submenu>
		      <el-submenu index="2">
		        <template slot="title"><i class="el-icon-menu"></i>导航二</template>
		        <el-menu-item-group>
		          <template slot="title">分组一</template>
		          <el-menu-item index="2-1">选项1</el-menu-item>
		          <el-menu-item index="2-2">选项2</el-menu-item>
		        </el-menu-item-group>
		        <el-menu-item-group title="分组2">
		          <el-menu-item index="2-3">选项3</el-menu-item>
		        </el-menu-item-group>
		        <el-submenu index="2-4">
		          <template slot="title">选项4</template>
		          <el-menu-item index="2-4-1">选项4-1</el-menu-item>
		        </el-submenu>
		      </el-submenu>
		      <el-submenu index="3">
		        <template slot="title"><i class="el-icon-setting"></i>导航三</template>
		        <el-menu-item-group>
		          <template slot="title">分组一</template>
		          <el-menu-item index="3-1">选项1</el-menu-item>
		          <el-menu-item index="3-2">选项2</el-menu-item>
		        </el-menu-item-group>
		        <el-menu-item-group title="分组2">
		          <el-menu-item index="3-3">选项3</el-menu-item>
		        </el-menu-item-group>
		        <el-submenu index="3-4">
		          <template slot="title">选项4</template>
		          <el-menu-item index="3-4-1">选项4-1</el-menu-item>
		        </el-submenu>
		      </el-submenu>
		    </el-menu>
		  </el-aside>
		  
		  <el-container>
		    <el-header style="text-align: right; font-size: 12px">
		      <el-dropdown>
		        <i class="el-icon-setting" style="margin-right: 15px"></i>
		        <el-dropdown-menu slot="dropdown">
		          <el-dropdown-item>查看</el-dropdown-item>
		          <el-dropdown-item>新增</el-dropdown-item>
		          <el-dropdown-item>删除</el-dropdown-item>
		        </el-dropdown-menu>
		      </el-dropdown>
		      <span>王小虎</span>
		    </el-header>
		    
		    <el-main>
		     <!--  <el-table :data="tableData">
		        <el-table-column prop="date" label="日期" width="140">
		        </el-table-column>
		        <el-table-column prop="name" label="姓名" width="120">
		        </el-table-column>
		        <el-table-column prop="address" label="地址">
		        </el-table-column>
		      </el-table> -->
		      
		      
		      
		      
		      <el-form ref="form" :model="form" label-width="80px">
				  <el-form-item label="活动名称">
				    <el-input v-model="form.name"></el-input>
				  </el-form-item>
				  <el-form-item label="活动区域">
				    <el-select v-model="form.region" placeholder="请选择活动区域">
				      <el-option label="区域一" value="shanghai"></el-option>
				      <el-option label="区域二" value="beijing"></el-option>
				    </el-select>
				  </el-form-item>
				  <el-form-item label="活动时间">
				    <el-col :span="11">
				      <el-date-picker type="date" placeholder="选择日期" v-model="form.date1" style="width: 100%;"></el-date-picker>
				    </el-col>
				    <el-col class="line" :span="2">-</el-col>
				    <el-col :span="11">
				      <el-time-picker type="fixed-time" placeholder="选择时间" v-model="form.date2" style="width: 100%;"></el-time-picker>
				    </el-col>
				  </el-form-item>
				  <el-form-item label="即时配送">
				    <el-switch v-model="form.delivery"></el-switch>
				  </el-form-item>
				  <el-form-item label="活动性质">
				    <el-checkbox-group v-model="form.type">
				      <el-checkbox label="美食/餐厅线上活动" name="type"></el-checkbox>
				      <el-checkbox label="地推活动" name="type"></el-checkbox>
				      <el-checkbox label="线下主题活动" name="type"></el-checkbox>
				      <el-checkbox label="单纯品牌曝光" name="type"></el-checkbox>
				    </el-checkbox-group>
				  </el-form-item>
				  <el-form-item label="特殊资源">
				    <el-radio-group v-model="form.resource">
				      <el-radio label="线上品牌商赞助"></el-radio>
				      <el-radio label="线下场地免费"></el-radio>
				    </el-radio-group>
				  </el-form-item>
				  <el-form-item label="活动形式">
				    <el-input type="textarea" v-model="form.desc"></el-input>
				  </el-form-item>
				  <el-form-item>
				    <el-button type="primary" @click="onSubmit">立即创建</el-button>
				    <el-button>取消</el-button>
				  </el-form-item>
				</el-form>
		      
		    </el-main>
		  </el-container>
		</el-container>
	</div>
	
</body>


<style>
  .el-header {
    background-color: #B3C0D1;
    color: #333;
    line-height: 60px;
  }
  
  .el-aside {
    color: #333;
  }
</style>


<!-- import Vue before Element -->
<script src="https://unpkg.com/vue/dist/vue.js"></script>
<!-- import JavaScript -->
<script src="https://unpkg.com/element-ui/lib/index.js"></script>
<script>
	new Vue({
		el : '#app',
		data :{
			form: {
		          name: '',
		          region: '',
		          date1: '',
		          date2: '',
		          delivery: false,
		          type: [],
		          resource: '',
		          desc: ''
		        }
		},
	 methods: {
	      onSubmit() {
	        console.log('submit!');
	      }
	    }
	});
	
</script>

</html>
