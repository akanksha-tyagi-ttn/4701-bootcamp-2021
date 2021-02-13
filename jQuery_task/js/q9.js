$(document).ready(function()
{
    $("select").change(function()
    {
        /*$(".selected-value-display").html("<p>"+this.value+"</p>");
        $(".selected-value-display").empty(); */
        alert(this.value +" is selected")
    });
    
}); 
