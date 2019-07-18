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
    $.each(parames,function () {
        dataArrays[this.name] = this.value;
    });

    var data = JSON.stringify(dataArrays);
    console.log(data);

    $.get("/search/allData",function (o) {
        console.log(o);

    });

}

