<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>

<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->

<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->

<!--[if !IE]><!-->
<html lang="en"> <!--<![endif]-->

<!-- BEGIN HEAD -->

<head>

    <meta charset="utf-8"/>

    <title>Metronic | 后台登录</title>

    <meta content="width=device-width, initial-scale=1.0" name="viewport"/>

    <meta content="" name="description"/>

    <meta content="" name="author"/>

    <!-- BEGIN GLOBAL MANDATORY STYLES -->

    <link href="media/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

    <link href="media/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css"/>

    <link href="media/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>

    <link href="media/css/style-metro.css" rel="stylesheet" type="text/css"/>

    <link href="media/css/style.css" rel="stylesheet" type="text/css"/>

    <link href="media/css/style-responsive.css" rel="stylesheet" type="text/css"/>

    <link href="media/css/default.css" rel="stylesheet" type="text/css" id="style_color"/>

    <link href="media/css/uniform.default.css" rel="stylesheet" type="text/css"/>

    <!-- END GLOBAL MANDATORY STYLES -->

    <!-- BEGIN PAGE LEVEL STYLES -->

    <link href="media/css/login-soft.css" rel="stylesheet" type="text/css"/>

    <!-- END PAGE LEVEL STYLES -->

    <link rel="shortcut icon" href="media/image/favicon.ico"/>

</head>


<!-- END HEAD -->

<!-- BEGIN BODY -->

<body class="login">

<!-- BEGIN LOGO -->

<div class="logo">

    <!-- <img src="media/image/logo-big.png" alt="" />  -->
    <h1>后台管理平台</h1>

</div>

<!-- END LOGO -->

<!-- BEGIN LOGIN -->
<script>
    function d() {
        var user = document.getElementById("user").value;
        var password = document.getElementById("password").value;
        if (user == null ||user ==""){
            alert("请输入用户名")
            return false;
        }
        if (password == null || password ==""){
            alert("请输入密码")

            return false;
        }

    }

</script>

<div class="content">

    <!-- begin login form -->

    <form class="form-vertical login-form" action="LoginServlet.do" method="post">

        <h3 class="form-title">登录到你的账户</h3>

        <div class="alert alert-error hide">

            <button class="close" data-dismiss="alert"></button>

            <span>请你输入你的账号和密码.</span>

        </div>

        <div class="control-group">

            <!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->

            <label class="control-label visible-ie8 visible-ie9">用户名</label>

            <div class="controls">

                <div class="input-icon left">

                    <i class="icon-user"></i>

                    <input class="m-wrap placeholder-no-fix" type="text" placeholder="用户名/手机号/微信号" name="username" id="user"/>

                </div>

            </div>

        </div>

        <div class="control-group">

            <label class="control-label visible-ie8 visible-ie9">密码</label>

            <div class="controls">

                <div class="input-icon left">

                    <i class="icon-lock"></i>

                    <input class="m-wrap placeholder-no-fix" type="password" placeholder="密码" name="password" id="password"/>

                </div>

            </div>

        </div>

        <div class="form-actions">

            <label class="checkbox">

                <input type="checkbox" name="remember" value="1"/> 记住我

            </label>

            <button type="submit" class="btn blue pull-right" onclick="return d()">

                登录 <i class="m-icon-swapright m-icon-white"></i>

            </button>

        </div>

        <div class="forget-password">

            <h4>忘记了你的密码 ?</h4>

            <p>

                不用担心，点击 <a href="javascript:;" class="" id="forget-password">这里</a>

                找回你的密码！！！

            </p>

        </div>

        <div class="create-account">

            <p>

                如果你还没有账号 ?&nbsp;

                <a href="javascript:;" id="register-btn" class="">创建账户</a>

            </p>

        </div>

    </form>

    <!-- end login form -->

    <!-- begin forgot password form -->
<script>
function em() {
    var name = document.getElementById("name1").value;
    var email1 = document.getElementById("email1").value;
    if (name == null|| name ==""){
        alert("请输入要验证的用户名");
        return false;
    }
    if (email1 == null||email1 == ""){
        alert("请输入要验证的邮箱");
        return false;
    }
    return true;


}
</script>
    <form class="form-vertical forget-form" action="PasswordFindServlet.do" method="post">
    <input type="hidden" name="do" value="email">
        <h3 class="">忘记密码 ?</h3>


        <p>请输入您的用户名和电子邮件地址以重置密码.</p>
        <div class="control-group">

            <!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->

            <label class="control-label visible-ie8 visible-ie9">用户名</label>

            <div class="controls">

                <div class="input-icon left">

                    <i class="icon-user"></i>

                    <input class="m-wrap placeholder-no-fix" type="text" placeholder="用户名/手机号/微信号" name="username" id="name1"/>

                </div>

            </div>

        </div>

        <div class="control-group">

            <div class="controls">

                <div class="input-icon left">

                    <i class="icon-envelope"></i>

                    <input class="m-wrap placeholder-no-fix" type="text" placeholder="email" name="email" id="emil1"/>

                </div>

            </div>

        </div>

        <div class="form-actions">

            <button type="button" id="back-btn" class="btn">

                <i class="m-icon-swapleft"></i> 返回

            </button>

            <button type="submit" class="btn blue pull-right" onclick="return em()">

                提交 <i class="m-icon-swapright m-icon-white"></i>

            </button>

        </div>

    </form>

    <!-- end forgot password form -->

    <!-- begin registration form -->

    <script>
        function f() {
            var name = document.getElementById("name").value;
            var password = document.getElementById("register_password").value;
            var password1 = document.getElementById("password1").value;

            var age = document.getElementById("age").value;
            var email = document.getElementById("email").value;
        //alert(name,password,password1,age,email)

            if (name == null || name == "") {
                alert("用户名不能为空")
                return false;
            }
            if (password == null || password == "") {
                alert("密码不能为空")
                return false;

            }
            if (password1 == null || password1 == "") {
                alert("确认密码不能为空！！")
                return false;
            }
            if (password != password1) {
                alert("两次输入的密码不一致！");
                return false;
            }
            if (age == null || age == "") {
                alert("你年龄不能为空")
                return false;
            }
            if (email == null || email == "") {
                alert("邮箱不能为空！！");
                return false;
            }
            //邮箱验证
            var reg = new RegExp("^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$");
            if (!reg.test(email)) {
                alert("邮箱格式错误！！");
                return false;
            }
            return true;


        }
    </script>
    <form class="form-vertical register-form" action="regist.do" method="post"
    >

        <h3 class="">注册</h3>

        <p>输入您的帐户详情如下：</p>

        <div class="control-group">

            <label class="control-label visible-ie8 visible-ie9">username</label>

            <div class="controls">

                <div class="input-icon left">

                    <i class="icon-user"></i>

                    <input class="m-wrap placeholder-no-fix" type="text" placeholder="用户名/手机号/微信号" name="name"
                           id="name"/>

                </div>

            </div>

        </div>

        <div class="control-group">

            <label class="control-label visible-ie8 visible-ie9">password</label>

            <div class="controls">

                <div class="input-icon left">

                    <i class="icon-lock"></i>

                    <input class="m-wrap placeholder-no-fix" type="password" id="register_password" placeholder="密码"
                           name="password" aria-invalid="password"/>

                </div>

            </div>

        </div>

        <div class="control-group">

            <label class="control-label visible-ie8 visible-ie9">重新键入密码</label>

            <div class="controls">

                <div class="input-icon left">

                    <i class="icon-ok"></i>

                    <input class="m-wrap placeholder-no-fix" type="password" placeholder="重新键入密码" name="rpassword"
                           id="password1"
                    />

                </div>

            </div>

        </div>


        <div class="control-group">

            <label class="control-label visible-ie8 visible-ie9">年龄</label>

            <div class="controls">

                <div class="input-icon left">

                    <i class="icon-ok"></i>

                    <input class="m-wrap placeholder-no-fix" type="text" placeholder="年龄" name="age" id="age"/>

                </div>

            </div>

        </div>

        <div class="control-group">

            <!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->

            <label class="control-label visible-ie8 visible-ie9">邮箱</label>

            <div class="controls">

                <div class="input-icon left">

                    <i class="icon-envelope"></i>

                    <input class="m-wrap placeholder-no-fix" type="text" placeholder="email" name="email" id="email"/>

                </div>

            </div>

        </div>

        <div class="control-group">

            <div class="controls">

                <label class="checkbox">

                    <input type="checkbox" name="tnc"/>同意 <a href="#">服务条款</a> 和 <a href="#">隐私政策</a>

                </label>

                <div id="register_tnc_error"></div>

            </div>

        </div>

        <div class="form-actions">

            <button id="register-back-btn" type="button" class="btn">

                <i class="m-icon-swapleft"></i> 返回

            </button>

            <button type="submit" id="register-submit-btn" class="btn blue pull-right" onclick="return f()">

                提交 <i class="m-icon-swapright m-icon-white"></i>

            </button>

        </div>

    </form>

    <!-- end registration form -->

</div>

<!-- END LOGIN -->

<!-- BEGIN COPYRIGHT -->

<div class="copyright">

    2019 &copy; 通用系统后台管理平台.

</div>

<!-- END COPYRIGHT -->

<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->

<!-- BEGIN CORE PLUGINS -->

<script src="media/js/jquery-1.10.1.min.js" type="text/javascript"></script>

<script src="media/js/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>

<!-- IMPORTANT! Load jquery-ui-1.10.1.custom.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->

<script src="media/js/jquery-ui-1.10.1.custom.min.js" type="text/javascript"></script>

<script src="media/js/bootstrap.min.js" type="text/javascript"></script>

<!--[if lt IE 9]>

<script src="media/js/excanvas.min.js"></script>

<script src="media/js/respond.min.js"></script>

<![endif]-->

<script src="media/js/jquery.slimscroll.min.js" type="text/javascript"></script>

<script src="media/js/jquery.blockui.min.js" type="text/javascript"></script>

<script src="media/js/jquery.cookie.min.js" type="text/javascript"></script>

<script src="media/js/jquery.uniform.min.js" type="text/javascript"></script>

<!-- END CORE PLUGINS -->

<!-- BEGIN PAGE LEVEL PLUGINS -->

<script src="media/js/jquery.validate.min.js" type="text/javascript"></script>

<script src="media/js/jquery.backstretch.min.js" type="text/javascript"></script>

<!-- END PAGE LEVEL PLUGINS -->

<!-- BEGIN PAGE LEVEL SCRIPTS -->

<script src="media/js/app.js" type="text/javascript"></script>

<!--  <script src="media/js/login-soft.js" type="text/javascript"></script>
-->
<!-- END PAGE LEVEL SCRIPTS -->

<script>

    jQuery(document).ready(function () {

        App.init();

        Login.init();

    });

    /*丢失密码的时候显示找回页面  */
    jQuery('#forget-password').click(function () {
        jQuery('.login-form').hide();
        jQuery('.forget-form').show();
    });

    jQuery('#back-btn').click(function () {
        jQuery('.login-form').show();
        jQuery('.forget-form').hide();
    });


    /*没有注册的时候点击跳转到注册页面  */
    jQuery('#register-btn').click(function () {
        jQuery('.login-form').hide();
        jQuery('.register-form').show();
    });

    jQuery('#register-back-btn').click(function () {
        jQuery('.login-form').show();
        jQuery('.register-form').hide();
    });


    $.backstretch([
        "media/image/bg/1.jpg",
        "media/image/bg/2.jpg",
        "media/image/bg/3.jpg",
        "media/image/bg/4.jpg"
    ], {
        fade: 1000,
        duration: 4000
    });


</script>

<!-- END JAVASCRIPTS -->

</body>

<!-- END BODY -->

</html>