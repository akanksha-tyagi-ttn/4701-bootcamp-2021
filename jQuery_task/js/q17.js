var i = 0; 
var imgArr = []; 

// LIST OF IMAGES 
imgArr[0] = "images/ttn-logo.jpg"; 
imgArr[1] = "images/certified.png"; 
imgArr[2] = "images/office.jpg";
imgArr[3] = "images/work-area.jpg"; 

function slideImage() 
{ 
    $(".img-pic").attr("src",imgArr[i]);
    $(".desc").html("<p>image "+ i+ "</p>")
    if(i < imgArr.length - 1) 
        i++;   // if  array is in the array length
    else 
        i = 0; 
    setTimeout("slideImage()",1000);   // for the sake of pause 
} 

window.onload=slideImage;
