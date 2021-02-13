function findMaximumHeight()
{
    var max=-1;
    var i=0;
    $(".child-div").each(function()
    {
        if($(this).height()>max)
        max=$(this).height();
    });
    $("#height-max").html("The maximum height: "+max);
}
$(document).ready(function()
{
    findMaximumHeight();
}); 
