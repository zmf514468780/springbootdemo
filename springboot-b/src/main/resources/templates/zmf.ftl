<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>B网站访问</title>
</head><script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$.ajax({
			type : "get",
			async : false,
			url : "http://localhost:8990/A/getJson",
			dataType : "json",
			success : function(data) {
				alert("获取结果:"+data['name']+" "+data['id']);
			},
			error : function() {
				alert('fail');
			}
		});

	});
</script>

<body>
我是B项目
	 
</body>
</html>