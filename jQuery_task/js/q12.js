$(document).ready(function()
{
    $(".parent-div").on("click",function(e)
    {
        $(".display-clickedElement").append("parent div is clicked !! <br><br>");
    });

    $(".child-div").on("click",function(e)
    {
        $(".display-clickedElement").append("child div is clicked !! <br><br>");
        e.stopPropagation();
    });

    $(".child-div-a").on("click",function(e)
    {
        $(".display-clickedElement").append("link in child div is clicked !! <br><br>");
        e.stopPropagation();
    });
}); 
