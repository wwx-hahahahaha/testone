$(function(){
    for(let i=0;i<$(".navs").length;i++){
        $(".navs").eq(i).attr("index",i);
    }
   $(".navs").on("click",function(){
    let index=$(this).attr("index")
    $(".cen_list_box").eq(index).show().siblings(".cen_list_box").hide()
   })
   
  let nav=document.querySelectorAll(".navs")
  for(let i=0;i<nav.length;i++){
    nav[i].addEventListener("click",function(){
        for(let i=0;i<nav.length;i++){
            nav[i].style.backgroundColor="";
        }
        this.style.backgroundColor="rgb(125, 143, 160)";
    })
  }
   
})