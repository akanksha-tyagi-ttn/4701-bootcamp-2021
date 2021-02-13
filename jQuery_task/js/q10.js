// hovering on the button, color changes and 
$(document).ready(function()
{
    var count=0;
    $("#hover-btn").hover(function()
    {
        count+=1;
        if(count%2==1)
        {
            $(this).css("background-color","yellow");
        }
        else{
            $(this).css("background-color","lightyellow");
        }
        $(".dropdown").slideToggle();
    });
}); 
