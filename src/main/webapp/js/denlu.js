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
		function changeYZ(){
			var arrays=new Array(  
                '1','2','3','4','5','6','7','8','9','0',  
                'a','b','c','d','e','f','g','h','i','j',  
                'k','l','m','n','o','p','q','r','s','t',  
                'u','v','w','x','y','z',  
                'A','B','C','D','E','F','G','H','I','J',  
                'K','L','M','N','O','P','Q','R','S','T',  
                'U','V','W','X','Y','Z'               
        	); 
			code ='';
			for(var i = 0; i<4; i++){
				var r = parseInt(Math.random()*arrays.length);
				code += arrays[r];
			}
			$("#yanz").html(code);
		}
		$(function(){
			$("#hui").click(function(){
				history.back();
			})
			$("#denglu").click(function(){
				if ($("#ip1").val()==""||$("#ip2").val()==""||$("#ip1").val()=="请输入您的手机号"||$("#ip2").val()=="短信验证码") {
					alert("内容不能为空！");
				}else if (!(/^1[34578]\d{9}$/.test($("#ip1").val()))) {
					alert("手机号码有误，请重填");
				}else if($("#ip2").val()!=$("#yanz").text()){
					alert("验证码有误，请重填");
				}else{
					$("#frm").submit();
				}
			})
			$("#yanz").click(changeYZ);
			$("#ip1").focus(function(){
				if ($("#ip1").val()=="请输入您的手机号"){
					$("#ip1").val("");
				}
			})
			$("#ip1").blur(function(){
				if ($("#ip1").val()==""){
					$("#ip1").val("请输入您的手机号");
				}
			})
			$("#ip2").focus(function(){
				if ($("#ip2").val()=="短信验证码"){
					$("#ip2").val("");
				}
			})
			$("#ip2").blur(function(){
				if ($("#ip2").val()==""){
					$("#ip2").val("短信验证码");
				}
			})

		});