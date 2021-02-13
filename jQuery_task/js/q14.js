$(document).ready(function()
{
    $(".btn").click(function(){
        var no_of_clicks=$(this).data("clicks");
        if(no_of_clicks)   //even number of click
        {
            $("table td.i-value").filter(function () {
                return $(this).text() > 10;
                }).removeClass('highlight');
        }
        else
        { //odd number of clicks
            $("table td.i-value").filter(function () {
                return $(this).text() > 10;
                }).addClass('highlight');
        }
        $(this).data("clicks", !no_of_clicks);
    });
}); 


