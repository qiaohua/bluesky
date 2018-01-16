		function rem(){
			var html=document.getElementsByTagName('html')[0];
			var ww=document.documentElement.clientWidth;
			var scale=ww/750;
			html.style.fontSize=scale*100+"px";
		}
		rem();
		window.onresize=function(){
			rem();
		}
		
		$("#ip1").value="发表此刻的心情......";

		$(function(){
			$("#jia").click(function(){
				$("#ip3").click();
			});
			$("#hui").click(function(){
				history.back();
			})
			$("#fasong").click(function(){
				if ($("#ip3").val()==null||$("#ip3").val()=="") {
				
					alert("您还未选择上传文件");
					return false
				}
				if($("#ip4").val()==null||$("#ip4").val()==""){
					alert("请输入相册名");
					return false
				}
				
				if ($("#ip1").val()==""||$("#ip1").val()=="发表此刻的心情......") {
					alert("描述内容不能为空！");
					return false
				}else{
					/*$("#inputfasong").on("touchstart",function(){
						alert(1)
						window.open("getCanmera");
					})*/
					$("#inputfasong").trigger("click");
					
				};
			})
			

			
			$("#ip1").focus(function(){
				if ($("#ip1").val()=="发表此刻的心情......"){
					$("#ip1").val("");
				}
			})
			$("#ip1").blur(function(){
				if ($("#ip1").val()==""){
					$("#ip1").val("发表此刻的心情......");
				}
			})
		});