$(function () {
    //alert("页面加载完成！");
    screach();
});

//封装从后端查询到的数据
var dataArray = {};

/**
 * 查询数据
 */
function screach() {
    /*
     * 下面这段代码是得到form表单中的值，封装到dataArrays中
     */
    var parames = $('form').serializeArray();
    var url = "/search/allData?";
    $.each(parames,function (i,val) {
        if(i === parames.length - 1){
            url = url + val.name + "="+val.value;
            return;
        }
        url = url + this.name + "="+this.value+"&"
    });
    $.post(url,function (o) {
        dataArray = {};
        dataArray = o.data;
        qsmygxfxMap(dataArray);
    });
}

/**
 * 绘制地图
 */
function qsmygxfxMap() {
    var myChart = echarts.init(document.getElementById("myMap"));
    $.get("/json/china.json",function (chinaMapJson) {

        /*加载数据的样式*/
        myChart.showLoading();

        /*讲map的json数据注册到名为china的map中，不需要提前声明map*/
        echarts.registerMap("china",chinaMapJson);

        var geoCoordMap = {};

        /*获取chinaMapJson数据中的features，返回一个数组*/
        var mapFeatures = echarts.getMap("china").geoJson.features;

        /**
         * 遍历mapFeatures数组，取得地区名称跟经纬度，封装到geoCoordMap中,成为以下格式，array表示经纬度的数组
         * eg：新疆维吾尔自治区: Array(2), 西藏自治区: Array(2), 内蒙古自治区: Array(2), 青海省: Array(2), 四川省: Array(2), …
         */
        mapFeatures.forEach(function (jsonDataVal) {
            /*地区名称*/
            var name = jsonDataVal.properties.name;

            /*经纬度*/
            geoCoordMap[name] = jsonDataVal.properties.cp;
        });

        /*隐藏数据加载样式*/
        myChart.hideLoading();

        /*用于封装各个省份的经纬度跟交易金额等其他数据*/
        var datas = [];

        /*遍历从后端查询到的数据*/
        dataArray.forEach(function (arrDataVal) {

            /*得到省份的名称*/
            var provincesName = arrDataVal.jysf;

            /*得到对应省份的经纬度*/
            var geoCoord = geoCoordMap[provincesName];

            /*如果经纬度存在  将金额封装到geoCoord这个数组中   concat这个函数表示拼接数据的作用*/
            if(geoCoord){
                datas.push({
                    name : provincesName,
                    value : geoCoord.concat(arrDataVal.swgjje)
                });
            }

        });
        console.log(datas);

        /*作图*/
        var option = {
            /*标题栏*/
            title : {
                x : "center",
                text : "这是一个测试的中国地图",
                subtext : "老马出品，必属精品"
            },

            /*工具栏*/
            toolbox : {
                /*显示工具栏*/
                show : true,
                /*位置*/
                right : "5%",
                /*扩展工具*/
                feature : {
                    /*保存地图为图片*/
                    saveAsImage : {
                        show : true
                    }
                }
            },

            /*提示框*/
            tooltip : {
                /**
                 * trigger：触发类型,'item'数据项图形触发，主要在散点图，饼图等无类目轴的图表中使用。
                 * 'axis'坐标轴触发，主要在柱状图，折线图等会使用类目轴的图表中使用。
                 */
                trigger : "item",
                /**
                 * 提示框浮层内容格式器，支持字符串模板和回调函数两种形式,模板变量有 {a}, {b}，{c}，{d}，{e}，
                 * 分别表示系列名，数据名，数据值等
                 */
                formatter : function (params,ticket,callback) {
                    if (typeof (params.value)[2] == "undefined"){
                        var toolTiphtml = '';
                        var sfmc = [];
                        dataArray.forEach(function (v) {
                            sfmc.push(v.name);
                            if (params.name === v.name) {
                                toolTiphtml += params.name+"<br>"+params.value+"(单位：亿元)";
                            }
                        });

                        if(sfmc.indexOf(params.name) === -1){
                            toolTiphtml += params.name;
                        };
                        return toolTiphtml;
                    }else{
                        var toolTiphtml =  params.name;
                        return toolTiphtml;
                    };
                }
            },

            geo: {
                show: true,  //是否显示
                map: "china", //地图类型。world世界地图，chinachina地图
                label: {  //图形上的文本标签，可用于说明图形的一些数据信息，比如值，名称等
                    normal: {
                        show: true,  //是否在普通状态下显示标签。
                    },
                    emphasis: {
                        show: false, //是否在高亮状态下显示标签。
                    }
                },
                //roam: true,
                itemStyle: {  //地图区域的多边形 图形样式
                    normal: {
                        areaColor: "black",
                        borderColor: "#3B5077",
                    },
                    emphasis: {
                        areaColor: "#2B91B7",
                    }
                }
            },

            /**
             *  视觉映射组件，用于进行『视觉编码』，也就是将数据映射到视觉元素。
             *  视觉元素可以是：symbol: 图元的图形类别。symbolSize: 图元的大小。color: 图元的颜色。
             */
            visualMap: {
                min: 30, //指定 visualMapContinuous 组件的允许的最小值
                max: 170, //指定 visualMapContinuous 组件的允许的最大值
                realtime: false,   //拖拽时，是否实时更新
                calculable: true,  //是否显示拖拽用的手柄（手柄能拖拽调整选中范围）
                inRange: { //定义 在选中范围中 的视觉元素
                    color : ["rgb(255, 255, 0)","rgb(255, 0, 0)"]
                },
                formatter: function (res, index) { //标签的格式化工具。
                    return res.toFixed(2);   //范围标签显示内容。
                }
            },

            series: [
                {
                    name: "购进金额:亿元",
                    /**
                     * // 图表类型，必要参数！如为空或不支持类型，则该系列数据不被显示。可选为：
                     *  'line'（折线图） | 'bar'（柱状图） | 'scatter'（散点图） | 'k'（K线图）
                     *  'pie'（饼图） | 'radar'（雷达图） | 'chord'（和弦图） | 'force'（力导向布局图） | 'map'（地图）
                     */
                    type: "map",  //表示类型为地图。bar为柱形图
                    mapType: "china", // 地图类型，支持world，china及全国34个省市自治区
                    //roam: false,  // 是否开启滚轮缩放和拖拽漫游,默认为false（关闭），其他有效输入为true（开启），'scale'（仅开启滚轮缩放），'move'（仅开启拖拽漫游）
//				              label: {  //图形上的文本标签，可用于说明图形的一些数据信息，比如值，名称等，
//								normal: {
//								    textStyle: {
//								        fontSize: 10,
//								        fontWeight: 'none',
//								        color: 'black',
//								        backgroundColor:'rgba(128, 128, 128, 0.1)'
//								    }
//								}
//				              },
                    /**
                     * 图形样式，normal 是图形在默认状态下的样式；emphasis 是图形在高亮状态下的样式，比如在鼠标悬浮或者图例联动高亮时。
                     */
                    itemStyle: {
                        /**
                         * 默认状态下地图的文字
                         */
                        normal: {
                            label: {
                                show: true,
                                color : "black",
                                fontSize : 10,
                                borderWidth:0,
                                borderColor:"green",
                                //backgroundColor:"white",
                                backgroundColor:'rgba(128, 128, 128, 0.1)'  //设置地图上文字背景透明

                            },
                            borderWidth: 1,//省份的边框宽度
                            childBorderWidth: 1,
                            childBorderColor: "#6EA1F4"

                        },
                        // 鼠标放到地图上面显示文字
                        emphasis: { label: { show: true } }
                    },
                    data:datas,  //地图要显示的数据
                }]

        };
        myChart.setOption(option);

    });

}






















