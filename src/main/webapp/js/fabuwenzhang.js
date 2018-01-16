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

		/* 获取cookie */
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
  	/* 点击跳转到Tab */
    $(function(){

     if (getCookie("tu2")==2) {
     		$(".conouter>div:eq(2)").css({"display":"block"}).siblings().css({"display":"none"});
     		$(".titouter span:eq(2)").addClass("select").siblings().removeClass("select")
     		removeCookie("tu2")
     };
     if (getCookie("tu5")==5) {
     		$(".conouter>div:eq(3)").css({"display":"block"}).siblings().css({"display":"none"});
     		$(".titouter span:eq(3)").addClass("select").siblings().removeClass("select")
     		removeCookie("tu5")
     };

     /* 搜索。。。。。。。。。。 */
     $("#ipt").focus(function(){
     		$("#ipt").val("")
     })
     $("#ipt").blur(function(){
     		$("#ipt").val("搜索会员或关键字")
     })
		
		/* 点击头像。。。。。 */
		$(".con-left1-foot").click(function(){
			alert($(this).attr("u_id"));
			window.open("/bluesky/getArticles?uid="+$(this).attr("u_id"),"_self")
		})
	/* 添加文章页面 */
		$(".right").click(function(){
			window.open("/bluesky/publicArticlePage","_self")
		})

			/* Tab */
			$(".conouter>div:eq(0)").css({"display":"block"})
			$(".titouter span").click(function(){
				var i=$(this).index();
				$(this).addClass("select").siblings().removeClass("select");
				$(".conouter>div:eq("+i+")").css({"display":"block"}).siblings().css({"display":"none"})
			})
			/* 点击散开 */
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
			/* 合并 */
			window.onclick=function(ev){
				var ev=ev||window.event;
				// ev.preventDefault?ev.preventDefault():ev.returnValue=false;
				if(ev.stopPropagation){
					ev.stopPropagation()
				}else{
					ev.cancelBubble=true
				};
				$(".caidan img").animate({
					"top":"0.15rem",
					"left":"0.15rem"
				},300,function(){
					$(".caidan img").css({
					"display":"none"
						})
				})
				a=0;
			}

			$("#caidan").on("touchstart",function(ev){
				var ev=ev||window.event;
				if(ev.stopPropagation){
					ev.stopPropagation()
				}else{
					ev.cancelBubble=true
				}
				// console.log($("body").scrollTop())
				console.log($("#caidan").offset().top)
				console.log(ev.originalEvent.targetTouches[0].clientY)

				var mouseLeft=ev.originalEvent.targetTouches[0].clientX-$("#caidan").offset().left;
				var	mouseTop=ev.originalEvent.targetTouches[0].clientY-$("#caidan").offset().top+$("body").scrollTop();
				// console.log(mouseLeft)
				// console.log(mouseTop)
				$("#caidan").on("touchmove",function(ev){
					ev.preventDefault?ev.preventDefault():ev.returnValue=false;
					$("#caidan").css({
						"left":ev.originalEvent.targetTouches[0].clientX-mouseLeft,
						"top":ev.originalEvent.targetTouches[0].clientY-mouseTop
					})
				})
			})
			$("#caidan").on("touchend",function(){
				$("#caidan").off("touchmove")
			})
			$(".left img").on("touchstart",function(){
				history.back()
			})
			$(".right img").on("touchstart",function(){
				window.open("/bluesky/publicArticlePage","_self")
			})
			$(".caidan img").eq(0).on("touchstart",function(){
				window.open("/bluesky/shouye.vm","_self")
			})
			$(".caidan img").eq(1).on("touchstart",function(){
				window.open("/bluesky/register/orderShow","_self" )
			})
			$(".caidan img").eq(2).on("touchstart",function(){
				window.open("/bluesky/register/getAllArticles","_self" )
			})
			$(".caidan img").eq(3).on("touchstart",function(){
				window.open("/bluesky/wode","_self" )
			})
			$(".top-left").on("touchstart",function(){
				history.back()
			})

		})
		/*mui.init({
			pullRefresh : {
				container:refreshContainer,// 待刷新区域标识，querySelector能定位的css选择器均可，比如：id、.class等
				up : {
					height:50,// 可选.默认50.触发上拉加载拖动距离
					auto:true,// 可选,默认false.自动上拉加载一次
					contentrefresh : "正在加载...",// 可选，正在加载状态时，上拉加载控件上显示的标题内容
					contentnomore:'没有更多数据了',// 可选，请求完毕若没有更多数据时显示的提醒内容；
					callback :pullfresh-function // 必选，刷新函数，根据具体业务来编写，比如通过ajax从服务器获取新数据；
				}
			}
		});*/