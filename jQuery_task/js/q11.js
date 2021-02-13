
$(document).ready(function()
{
    $("#google-link").on("click",function(e)
    {
        e.preventDefault();
        $(this).css("color","black");
        $("#msg-by-click").append("this link has been disabled.. ");
    })
}); 
