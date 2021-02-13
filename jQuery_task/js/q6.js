$(document).ready(function()
    {
        var newTag=$("<p></p>");
        newTag.append("<i>New paragraph element added using jQuery</i>");
        $("div").html(newTag);
    });