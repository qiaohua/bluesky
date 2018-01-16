$(function(){

			$(".con1-top-left").on("touchstart",function(){
				history.back();
			})
			/*相册数量显示*/
			$(".con2outer span").html($(".con2 img").length)

			/*点击跳转*/
			$(".con4-top1-center").click(function(){
				window.open("/bluesky/getArticle?aid="+$(this).attr("a_id"),"_self")
				
			})


			/*相册滑动。。。。。*/
			var Width=0
			for (var i = 0; i < $(".con2 img").length; i++) {
				Width=Width+$(".con2 img").eq(i).innerWidth()
				console.log(Width)
				
			};
			$(".con2outer").css({
					"width":Width/100+"rem"
				})

			$(".con2outer").on("touchstart",function(e){
				var mouseLeft=e.originalEvent.targetTouches[0].clientX;
				var scrollcon=$(".con2").scrollLeft();
				$(".con2outer").on("touchmove",function(e){
					$(".con2").scrollLeft(scrollcon+(mouseLeft-e.originalEvent.targetTouches[0].clientX)*1)
				})
				$(".con").on("touchend",function(){
					$(".con2outer").off("touchmove")
				})
			})


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
		$(".con1-top-left").on("touchstart",function(){
				history.back()
			})
		})

		