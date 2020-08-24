function getInfo() {
    showhidediv("tabletest","tablejvm");
    removeTySaveTitle("tabletest");
    $.ajax({
        url: "/info",
        data: {},
        type: "get",
        dataType: "json",
        success: function(data) {
            var  tr=
                '<td>'+data.header+'</td>'+
                '<td>'+data.ajaxMethod+'</td>'+
                '<td>'+data.cookie+'</td>'+'<td>'+data.time+'</td>';
            $("#tabletest").append('<tr>'+tr+'</tr>')
        }
    });
}


function getJvm() {
    showhidediv("tablejvm","tabletest");
    removeTySaveTitle("tablejvm");


}

function showhidediv(id1,id2) {
    var sbtitle1 = document.getElementById(id1);
    var sbtitle2 = document.getElementById(id2);

    sbtitle1.style.display = 'block';
    sbtitle2.style.display = 'none';

}

function  removeTySaveTitle(id) {
    $("#"+id+" tr:not(:first)").remove();

}