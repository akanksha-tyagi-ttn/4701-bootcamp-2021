$(document).ready(function()
{
    $("#btnadd").click(function()
    {
        $(this).attr("disabled",true);
        /*$.get("https://jsonplaceholder.typicode.com/todos/1",function(data,status)
        {
            console.log(JSON.parse(data));
            var data_p=JSON.parse(data);
            var i=0;
            data_p.forEach(function(dt)
            {
                $("#tdata").append('<tr id="data-'+i+'">'+ 
                '<td>'+ dt.name+'</td>'+
                '<td>'+ dt.age+'</td>'+
                '<td>'+ dt.phone+'</td>'+
                '<td>'+ '<button id="btn-'+i+'">delete</button>'+'</td>'+
                +'</tr>'
                );
                i++;
            });
                
        });
        */
        
        $.ajax({
          url:'https://jsonplaceholder.typicode.com/todos/1',
          dataType:'json',
          type: 'GET',
          success: function(data) {
            var items = []; 
            var i=0;

            $.each(data, function(key, val) {  
              items.push('<td>' +val + '</td>');    
            }); 
            items.push('<td><button id="row-'+i+'">delete</button>'); 
            $('<tr/>', {
               'class': 'anything',  //just for reference
               'id':'row',
               html: items.join('')
            }).appendTo('#tdata');
            }
    	});
    });  // get ajax

    $("#row-0").on("click",function()
    { 
        $.ajax({
          url:'https://jsonplaceholder.typicode.com/todos/1',
          type: 'DELETE',
          success: function(result)
          {
            $('#row').remove();
          },
          error: function(xhr,textSt,errorThrown)
          {
            console.log("error occurs.....");
          }
        });
     });  //
});
