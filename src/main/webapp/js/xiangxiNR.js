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
				
				history.back()
			})
			$(".con-center-foot").on("touchstart",function(){
				window.open("","_self")
			})
			$(".top-right").on("touchstart",function(){
				
				var collect = $(this).attr("collect")
				var a_id = $(this).attr("a_id")
				$(document).ready(function(){
						$.ajax({
						type: "post",
						url: "updateCollect",
						data:{
							collect:collect,
							a_id:a_id
						},
						dataType:"json",
						async:true,
						success:function(data){
							
						},
						error:function(data){
							alert("收藏失败")
						}
					})
			})
				
			})
		})