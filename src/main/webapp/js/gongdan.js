function rem() {
			var html=document.getElementsByTagName('html')[0];
			var Ww=document.documentElement.clientWidth;
			var scale=Ww/750;
			html.style.fontSize=scale*100+"px";
		}
		rem()
		window.onresize=function(){
			rem()
		}
		
		$(function () {
			
			
			$(".top p").eq(0).on("touchstart",function(){
				$(this).addClass("select").siblings().removeClass("select");
				$(".foot").css("display","block")
				$(".publish").css("display","none")
			})
			$(".top p").eq(1).on("touchstart",function(){
				$(this).addClass("select").siblings().removeClass("select");
				$(".foot").css("display","none")
				$(".publish").css("display","block")

			})
			$(document).on("touchstart",function (ev) {
				var ev=ev||window.event
				var target=ev.target||target.srcElement
				if (target.className=="select"&&target.parentNode.className=="head") {
					$(".select .show").css("display","block")
				}
				if (target.className!="select"||target.className!="show"&&target.parentNode.className=="select") {
					$(".select .show").css("display","none")
				};
				if (target.id=="nav1") {
					$("#my").delay(800).fadeToggle(500)
					$("#share").delay(400).fadeToggle(500)
					$("#knowledge").delay(200).fadeToggle(500)
					$("#order").delay(600).fadeToggle(500)
				}
				if (target.id=="my") {
					window.open("/bluesky/wode","_self" )
				};
				if (target.id=="share") {
					window.open("/bluesky/register/getAllArticles","_self" )
				};
				if (target.id=="knowledge") {
					window.open("/bluesky/shouye.vm","_self" )
				};
				if (target.id=="order") {
					window.open("/bluesky/register/orderShow","_self" )
				};
				/*if (target.className=="jieshao"&&target.parentNode.className=="foot1") {
					window.open("orderDetails?o_id="+1,"_self")
				}*/
				/*if (target.id=="tijiao") {
					
					$(".publish li").eq(6).css("display","block")
				}*/
				if (target.className=="chenggong") {
					$(".publish li").eq(6).css("display","none")
					$("input").eq(0).val("搜索会员和关键字")
					$("input").eq(2).val("")
					$("input").eq(3).val("")
					$("input").eq(1).val("请输入工单发布的标题")
					$("input").eq(4).val("填写工单具体需求")
					$("textarea").val("发布的需求。。。（最多不超过500字）")
					window.open("orderShow","_self")
				}
				if (target.className=="back") {
					history.back()
				}
				/*if (target.id=="xiala") {
					$(".xiala1").css("display","block")
				};
				if (target.nodeName=="P"&&target.parentNode.className=="xiala1") {
					$("#sele").val($(target).text())
					$(".xiala1").css("display","none")
				}
				if (target.id!="xiala") {
					$(".xiala1").css("display","none")
				};*/
				$("input").eq(0).focus(function(){
					if($(this).val() == "" || $(this).val() == "搜索会员和关键字"){
						$(this).val("")
					}
					
				})
				$("input").eq(1).focus(function(){
					if($(this).val() == "" || $(this).val() == "请输入工单发布的标题"){
						$(this).val("")
					}
				})
				$("input").eq(3).focus(function(){
					if($(this).val() == "" || $(this).val() == "填写工单具体需求"){
						$(this).val("")
					}
				})
				$("input").eq(0).blur(function(){
					if($(this).val() == ""){
						$(this).val("搜索会员和关键字")
					}
				})
				$("input").eq(1).blur(function(){
					if($(this).val() == ""){
						$(this).val("请输入工单发布的标题")
					}
				})
				$("input").eq(3).blur(function(){
					if($(this).val() == ""){
						$(this).val("填写工单具体需求")
					}
					
				})	
				$("textarea").focus(function(){
					$(this).val("")
				})
				$("textarea").blur(function(){
					if($(this).val() == ""){
						$(this).val("发布的需求。。。（最多不超过500字）")
					}
					
				})								
			})
		})