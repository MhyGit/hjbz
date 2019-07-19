$(function () {
    //alert("页面加载完成！");
    screach();
});


function screach() {
    /*
     * 下面这段代码是得到form表单中的值，封装到dataArrays中
     */
    var dataArrays = {};
    var parames = $('form').serializeArray();
    var url = "/search/allData?";
    $.each(parames,function () {
        url = url + this.name + "="+this.value+"&"
    });
    $.post(url,function (o) {
       console.log(o.data)
    });
}

