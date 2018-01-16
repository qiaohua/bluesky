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
			$(document).on("touchstart",function (ev) {
				var ev=ev||window.event
				var target=ev.target||target.srcElement
				if (target.className=="back") {
					history.back()
				};
				if (target.className=="select") {
					$(".show").css("display","block")
				}
				if (target.className!="select"||target.className=="go"||target.className=="here") {
					$(".show").css("display","none")
				};
				if (target.className=="go") {
					window.open()
				};
				if (target.className=="here") {
					window.open()
				};
				if (target.nodeName=="IMG"&&target.parentNode.className=="center") {
					window.open("mytx","_self")
				};
				if (target.className=="shoucang") {
					window.open("","_self")
					alert("暂时没有收藏哦！")
				};
				if (target.className=="xiangce") {
					window.open("/bluesky/getphotos","_self")
				};
				if (target.className=="jilu") {
					window.open("/bluesky/testAJAX","_self")
				};
				if (target.className=="gonglue") {
					window.open("/bluesky/tixianGL","_self")
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
			})
		})