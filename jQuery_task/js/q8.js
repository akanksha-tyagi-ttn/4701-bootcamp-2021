$(document).ready(function()
{
    $(".button-1").click(function()
    {
        $(".parent-1").append("<button id=new-btn>"+
        "Added btn</button>"+
        "<p> but it is not clickable</p>");
    });

    $("body").on("click","#new-btn",function()
    {
        alert("Now it is clickable")
    }); 
    
}); 
