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
		
		$(function(){
			$(".top-left").on("touchstart",function(){
				history.back();
			})
			var a=1
			$(".con img").on("touchstart",function(){
				if(a==1){
					$(this).siblings().css({
						"display":"none"
					})
					$(this).animate({
						"width":"100%",
						"height":"100%"
					},300)
					a=0
				}
				else{
					$(this).siblings().css({
						"display":"block"
					})
					$(this).css({
						"width":"2.5rem",
						"height":"2.5rem"
					},300)
					a=1
				}
			})


		})