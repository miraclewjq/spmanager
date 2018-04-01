/**
 * 修改用户密码
 * */

$("#pwdBtn").click(function () {
    var pwd=$("#pwd").val();
    var isPwd=$("#isPwd").val();
    if(checkPwd(pwd,isPwd)){
        $.post("/user/setPwd",{"pwd":pwd,"isPwd":isPwd},function(data){
            console.log("data:"+data.message+data.code);
            if(data.code=="1000"){
                layer.alert("操作成功",function () {
                    layer.closeAll();
                    window.location.href="/logout";
                });
            }else{
                layer.alert(data.message,function () {
                    layer.closeAll();
                });
            }
        });
    }
});



function checkPwd(pwd,isPwd){

    if(pwd!=isPwd){
        //tips层-右
        $("#isPwd").val("");
        layer.tips("两次输入的密码不一致", '#isPwd', {
            tips: [2, '#78BA32'], //还可配置颜色
            tipsMore: true
        });
        return false;
    }
    if("ok"!=ValidateUtils.checkSimplePassword(pwd) || "ok"!=ValidateUtils.checkSimplePassword(isPwd)){
        //tips层-右
        $("#pwd").val("");
        $("#isPwd").val("");
        layer.alert("密码格式有误，请您重新输入");
        return false;
    }
    return true;
}

$("#reset").click(function () {
    $("#pwd").val("");
    $("#isPwd").val("");
});
