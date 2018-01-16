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
		
		$(function(){
			$("#hui").click(function(){
				history.back();
			})
			var a=0;
			$("#fangda").click(function(){
				a++;
				if (a==1) {
					$("img").eq(0).css({
						"transform":"scale(1.5,1.5)"
					})
				};
				if (a==2) {
					$("img").eq(0).css({
						"transform":"scale(2,2)"
					})
				};
				if (a==3) {
					a=0;
					$("img").eq(0).css({
						"transform":"scale(1,1)"
					})
				};
			})
		})