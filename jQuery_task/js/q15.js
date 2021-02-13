$(document).ready(function()
{
    $(".btn").click(function(){
        $.get("data_folder/demo.txt", function(data, status){
            $(".data_get").append("<br>Data:  <b>"+data+ ".</b> <br>Status is: <b>"+status +"</b>");
        });
      });

      $(".btn2").click(function(){
        $.ajax({
          url:'https://jsonplaceholder.typicode.com/todos/1',
          dataType:'json',
          type: 'GET',
          success: function(data) {
            var items = [];

            $.each(data, function(key, val) {  
              items.push('<li>' + key +" - "+val + '</li>');    
  
            });
            $('<ul/>', {
               'class': 'anyClassName',  //just for reference
               html: items.join('')
            }).appendTo('.wrapper');
  
          }  
        });
      });
}); 



//items.push('<li id="' + key + '">' + val + '</li>');