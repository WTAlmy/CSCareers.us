const loginForm = document.getElementById("login-form");
const loginButton = document.getElementById("login-form-submit");
const signupButton = document.getElementById("signup-form-submit");
const loginErrorMsg = document.getElementById("login-error-msg");


$.ajax({
    type: "GET",
    url: "http://34.68.104.62:8090/resumes/sample/resume",
}).done(function( data ) {
    console.log(data);
});

loginButton.addEventListener("click", (e) => {
    e.preventDefault();
    const username = loginForm.username.value;
    const password = loginForm.password.value;

    $.ajax({
        type: "POST",
        url: "http://34.68.104.62:8090/users/login",
        data: { username:username, password:password },
        dataType: 'json',
    }).done(function( data ) {
        console.log(data);
        if (data.id != -1){
            // user + password found in DB
            alert("Login Successful.");
            // save username and userId in sessionStorage
            sessionStorage.setItem('username', username);
            sessionStorage.setItem('userId', data.id);
            // redirect to home page
            window.location.replace("http://127.0.0.1:5000/home");
        }else{
            // you can do something here
            alert("Login Failed.");
            loginErrorMsg.style.opacity = 1;
        }
    });
})

signupButton.addEventListener("click", (e) => {
    e.preventDefault();
    window.location.href("http://34.68.104.62:8090/users/signup");
})

function field_focus(field, email)
  {
    if(field.value == email)
    {
      field.value = '';
    }
  }

  function field_blur(field, email)
  {
    if(field.value == '')
    {
      field.value = email;
    }
  }