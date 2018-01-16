	function rem(){
			var html=document.getElementsByTagName('html')[0];
			var Ww=document.documentElement.clientWidth;
			var scale=Ww/750;
			html.style.fontSize=scale*100+"px";
		}
		rem();

		window.onresize=function(){
			rem();
		}

		/*设置cookie*/

		function setCookie(key,value,day){
			var date=new Date();
			date.setDate(date.getDate()+day);
			document.cookie=key+"="+value+";expires="+date;
		}
		/*四周扩散*/

		function move(){
			$("#tu1").animate({
				"margin-top":"-3rem"
			},1000)
			$("#tu2").animate({
				"margin-right":"-2.48rem"
			},1000)
			$("#tu3").animate({
				"margin-left":"-2.48rem"
			},1000)
			$("#tu4").animate({
				"margin-left":"-2.48rem"
			},1000)
			$("#tu5").animate({
				"top":"3rem",
			},1000)
		}
		$(function(){
			$("#tu1").click(function(){
				move()
				$("#outer").fadeOut(1000,function(){
					
					window.open("/bluesky/register/getCanmera","_self")	
				})	
			})
			$("#tu2").click(function(){
				move()
				//setCookie("tu2","2",3);
				$("#outer").fadeOut(1000,function(){
					window.open("/bluesky/register/getAllArticles","_self")
				})	
			})
			$("#tu3").click(function(){
				move()
				$("#outer").fadeOut(1000,function(){
					window.open("/bluesky/register/getAllArticles","_self")
				})	
			})
			$("#tu4").click(function(){
				move()
				$("#outer").fadeOut(1000,function(){
					window.open("/bluesky/register/orderShow","_self")	
				})	
			})
			$("#tu5").click(function(){
				move()
				//setCookie("tu5","5",3);
				$("#outer").fadeOut(1000,function(){
					window.open("/bluesky/register/getAllArticles","_self")
				})	
			})

		})