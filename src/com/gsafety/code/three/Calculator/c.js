var standard = document.getElementById("standard");
var science = document.getElementById("science");
var standard_view = document.getElementById("standard_view");
var science_view = document.getElementById("science_view");
var calculator = document.getElementById("calculator");
var funcs = document.getElementsByClassName("func");
var result = document.getElementById("result");
// 定义一个全局变量数组，用来储存表达式的值，格式化数组最后用eval计算。
var res = [];

window.addEventListener("load", init);

// 当文档加载完毕后执行
function init(){
    // 为按钮-标准设置点击事件
    standard.addEventListener("click", function(){
        standard.className = "nav active";
        science.className = "nav";
        standard_view.className = "container show";
        science_view.className = "container";
        calculator.style.width = "400px";
        calculator.style.height = "600px";
    });
    // 为按钮-科学设置点击事件
    science.addEventListener("click", function(){
        science.className = "nav active";
        standard.className = "nav";
        science_view.className = "container show";
        standard_view.className = "container";
        calculator.style.width = "500px";
        calculator.style.height = "700px";
    });
    // 为所有的功能键添加点击事件，当点击之后在textarea中添加内容。
    for (var i = 0; i < funcs.length; i++) {
        funcs[i].addEventListener("click", function(e){
            var func = e.target;
            if(func.className.indexOf("equal") !== -1){
                // 对一些特殊的功能键做处理，使得eval能正常解析它。
                // 定义整数，将所有连续的整数拼接在一起。
                var number = "";
                for(var i = 0;i < res.length;i++){
                    if(!isNaN(parseInt(res[i]))){
                        for(var k = i;k < res.length;k++){
                            if(!isNaN(parseInt(res[k]))){
                                number += res[k];
                                res[k] = "";
                            }else{
                                break;
                            }
                        }
                        res[i] = number;
                        number = "";
                    }
                }
                // 将所有为空的项全部删除
                for(var i = 0;i < res.length;i++){
                    if(res[i] === ""){
                        res.splice(i, 1);
                        i--;
                    }
                }
                // 第一次对小数点进行处理
                // 定义整数位
                var iNum = "";
                // 定义小数位
                var fNum = "";
                for(var i = 0;i < res.length;i++){
                    if(res[i] === "."){
                        for(var j = i-1;j >= 0;j--){
                            if(!isNaN(parseInt(res[j]))){
                                iNum += res[j];
                                res[j] = "";
                            }else{
                                break;
                            }
                        }
                        for(var k = i+1;k < res.length;k++){
                            if(!isNaN(parseInt(res[k]))){
                                fNum += res[k];
                                res[k] = "";
                            }else{
                                break;
                            }
                        }
                        res[i] = iNum + "." + fNum;
                        iNum = "";
                        fNum = "";
                    }
                }
                // 将所有为空的项全部删除
                for(var i = 0;i < res.length;i++){
                    if(res[i] === ""){
                        res.splice(i, 1);
                        i--;
                    }
                }
                // 将特殊字符串做处理，转换成相应的js语法
                for(var j = 0;j < res.length;j++){
                    switch(res[j]){
                        case "x":
                            res[j] = "*";
                            break;
                        case "÷":
                            res[j] = "/";
                            break;
                        case "π":
                            res[j] = "Math.PI";
                            break;
                        case "sin":
                            if(j < res.length - 1){
                                res[j] = "Math.sin("+ res[j+1] +")";
                                //res[j+1] = "";
                                res.splice(j+1,1);
                            }else{
                                res[j] = "";
                            }
                            break;
                        case "cos":
                            if(j < res.length - 1){
                                res[j] = "Math.cos("+ res[j+1] +")";
                                //res[j+1] = "";
                                res.splice(j+1,1);
                            }else{
                                res[j] = "";
                            }
                            break;
                        case "tan":
                            if(j < res.length - 1){
                                res[j] = "Math.tan("+ res[j+1] +")";
                                //res[j+1] = "";
                                res.splice(j+1,1);
                            }else{
                                res[j] = "";
                            }
                            break;
                        case "ln":
                            if(j < res.length - 1){
                                res[j] = "Math.log("+ res[j+1] +")";
                                //res[j+1] = "";
                                res.splice(j+1,1);
                            }else{
                                res[j] = "";
                            }
                            break;
                        case "lg":
                            // 由于js中没有直接取底数为10的对数，只能使用换底公式达到需要的效果
                            if(j < res.length - 1){
                                res[j] = "Math.log("+ res[j+1] +")/Math.LN10";
                                //res[j+1] = "";
                                res.splice(j+1,1);
                            }else{
                                res[j] = "";
                            }
                            break;
                        case "e":
                            res[j] = "Math.E";
                            break;
                        case "√":
                            if(j < res.length - 1){
                                res[j] = "Math.sqrt("+ res[j+1] +")";
                                //res[j+1] = "";
                                res.splice(j+1,1);
                            }else{
                                res[j] = "";
                            }
                            break;
                        case "^2":
                            if(j > 0){
                                res[j] = "Math.pow("+ res[j-1] +",2)";
                                //res[j-1] = "";
                                res.splice(j-1,1);
                                j--;
                            }else{
                                res[j] = "";
                            }
                            break;
                        case "^":
                            if(j > 0 && j < res.length-1){
                                res[j] = "Math.pow("+ res[j-1] +","+res[j+1]+")";
                                //res[j-1] = "";
                                //res[j+1] = "";
                                res.splice(j-1,1);
                                res.splice(j,1);
                                j--;
                            }else{
                                res[j] = "";
                            }
                            break;
                        default: break;
                    }
                }
                console.log(res);
                try{
                    result.value = eval(res.join(""));
                    // 当结果出来后清空数组，并将结果存入数组
                    res = [];
                    res.push(result.value);
                }catch(excption){
                    result.value = "error";
                    console.log(excption);
                }
            }else{
                // 根据功能键的不同做出不同的响应
                switch(func.innerHTML){
                    case "C":
                        result.value = "";
                        res = [];
                        break;
                    case "←":
                        result.value = result.value.slice(0,result.value.length-1);
                        res.pop();
                        break;
                    case "x²":
                        result.value += "^2";
                        res.push("^2");
                        break;
                    case "xⁿ":
                        result.value += "^";
                        res.push("^");
                        break;
                    default:
                        result.value += func.innerHTML;
                        res.push(func.innerHTML);
                        break;
                }
            }
        });
    }
}