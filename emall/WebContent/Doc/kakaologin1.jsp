<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a id="custom-login-btn" href="javascript:loginWithKakao()">
  <img
    src="//k.kakaocdn.net/14/dn/btroDszwNrM/I6efHub1SN5KCJqLm1Ovx1/o.jpg"
    width="222"
    alt="카카오 로그인 버튼"
  />
</a>

<script src = "http://developers.kakao.com/sdk/js/k">

<script>
kakao.init("");

function kakaoLogin(){
	window.KaKao.Auth.login({
		scope: 'profile_nickname, account_email, gender, birthday',
		success: function(authObj){
			console.log(authObj);
			windows.KaKao.API.request({
				url: '/v2/user/me',
				success: res => {
					const kakaoAccount = res.kakao_account;
				console.log(kakaoAccount);			
				}
			})
		}
	})
}
</script>
</body>
</html>