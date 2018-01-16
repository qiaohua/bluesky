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
			$("input").attr("disabled","disabled");
			$("#xiugai").on("touchstart",function(){
				if ($("input").attr("disabled")) {
					$("input").removeAttr("disabled");
				}else{
					$("input").attr("disabled","disabled");
				}
				$(".touxiang").on("touchstart",function(){
					$("#ip1").click();
				})
			});
			$("#hui").on("touchstart",function(){
				history.back();
			});
			$("input[type='file']").change(function(){   
				var file = this.files[0];
			   	if (window.FileReader) {    
		            var reader = new FileReader();    
		            reader.readAsDataURL(file);      
		          reader.onloadend = function (e) {
		            $("#img1").attr("src",e.target.result);
		            };    
			    } 
			});
		});