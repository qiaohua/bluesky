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

		/*获取cookie*/
		function setCookie(key,value,day){
			var date=new Date();
			date.setDate(date.getDate()+day);
			document.cookie=key+"="+value+";expires="+date;
		}
		function getCookie(key) {
          var arr=document.cookie.split("; ");
          for (var i = 0; i < arr.length; i++) {
            var newarr=arr[i].split('=');
            if (newarr[0]==key) {
              return newarr[1];
            }
          }
        }
    function removeCookie(key) {
          setCookie(key,"0",-1);
        }
  	/*点击跳转到Tab*/
    $(function(){
     if (getCookie("tu1")==1) {
     		$(".conouter>div:eq(2)").css({"display":"block"}).siblings().css({"display":"none"});
     		removeCookie("tu1")
     };
     


		




			/*Tab       */
			$(".conouter>div:eq(0)").css({"display":"block"})
			$(".titouter span").click(function(){
				var i=$(this).index();
				$(this).addClass("select").siblings().removeClass("select");
				$(".conouter>div:eq("+i+")").css({"display":"block"}).siblings().css({"display":"none"})
			})

			/*点击头像。。。。。*/
			

			/*点击散开*/
			var a=0
			$("#caidan").click(function(ev){
				var ev=ev||window.event;
				if(ev.stopPropagation){
					ev.stopPropagation()
				}else{
					ev.cancelBubble=true
				}
				if(a==0){
					$(".caidan img").css({
						"display":"block"
					})
					$("#caidan1").animate({
						"top":"-1.25rem",
						"left":"0"
					},300)
					$("#caidan2").animate({
						"top":"-1.05rem",
						"left":"0.84rem"
					},300)
					$("#caidan3").animate({
						"top":"-0.45rem",
						"left":"1.44rem"
					},300)
					$("#caidan4").animate({
						"top":"0.3rem",
						"left":"1.55rem"
					},300)
					a=1
				}else{
						$(".caidan img").animate({
						"top":"0.15rem",
						"left":"0.15rem"
					},300,function(){
						$(".caidan img").css({
						"display":"none"
							})
					})
					a=0
				}
			})
			/*合并*/
			window.onclick=function(ev){
				var ev=ev||window.event;
				if(ev.stopPropagation){
					ev.stopPropagation()
				}else{
					ev.cancelBubble=true
				}
				$(".caidan img").animate({
					"top":"0.15rem",
					"left":"0.15rem"
				},300,function(){
					$(".caidan img").css({
					"display":"none"
						})
				})
				a=0
			}
			$(".left img").on("touchstart",function(){
				history.back()
			})
			
		
			/*$(".con-left1 img").on("touchstart",function(){
				alert(x1.innerHTML);
				window.open("getCanmeras?id=2","_self")
				
			})
			$(".right img").on("touchstart",function(){
				window.open("./fabu2.vm","_self")
			})*/
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			$("#caidan img").eq(0).on("touchstart",function(){
				window.open("/bluesky/shouye.vm","_self" )
			})
			$("#caidan img").eq(1).on("touchstart",function(){
				window.open("/bluesky/register/orderShow","_self" )
			})
			$("#caidan img").eq(2).on("touchstart",function(){
				window.open("/bluesky/registergetAllArticles","_self" )
			})
			$("#caidan img").eq(3).on("touchstart",function(){
				window.open("/bluesky/wode","_self" )
			})
		})