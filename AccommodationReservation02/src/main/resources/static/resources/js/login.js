


const signUpButton = document.getElementById('signUp');
const signInButton = document.getElementById('signIn');
const container = document.getElementById('container');
const form = document.getElementById('memberForm');
const sendSignJoinButton = document.getElementById('btnJoin');
signUpButton.addEventListener('click', () => {

	
  container.classList.add("right-panel-active");


});

signInButton.addEventListener('click', () => {
  container.classList.remove("right-panel-active");
});

sendSignJoinButton.addEventListener('click', ()=> {
	if(form.name.value=="")
	{
		alert("이름을 입력하세요");
		return false;
	}
		if(form.username.value=="")
	{
		alert("이메일을 입력하세요");
		return false;
	}
		if(form.password.value=="")
	{
		alert("비밀번호 입력하세요");
		return false;
	}
		if(form.tel.value=="")
	{
		alert("전화번호를 입력하세요");
		return false;
	}
	const  dataParam ={
			name : $("#name").val(),
			password : $("#password").val(),
			username : $("#username").val(),
			tel : $("#tel").val()
	}
	$.ajax({
		type:'post',
		url: '/join',
		contentType:"application/json;charset=utf-8",
		data:JSON.stringify(dataParam)
	})
	.done(function(resp){
		if(resp=="success"){
			alert("회원가입성공")
			location.href="/login"
		}else if(resp=="fail"){
			alert("아이디 중복")
			$("#username").val("");
		}
	})
	.fail(function(){
		alert("회원가입실패")
	})
});
