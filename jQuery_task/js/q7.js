$(document).ready(function()
    {
        $(".btn-a").on('click',function()
        {
            console.log("Only Button A is clicked..");
            $(this).css("background-color","yellow");
            $(".btn-b").trigger("click");
        });

        $(".btn-b").on('click',function()
        {
            console.log("Only Button A is clicked..");
        });
    });