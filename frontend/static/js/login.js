const loginForm = document.getElementById("login-form");
const loginButton = document.getElementById("login-form-submit");
const signupButton = document.getElementById("signup-form-submit");

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
            // save username and userId in sessionStorage
            sessionStorage.setItem('username', username);
            sessionStorage.setItem('userId', data.id);
            // redirect to home page
            window.location.href = "http://127.0.0.1:5000/home";
        }else{
            alert("Login Failed.");
        }
    });
})

signupButton.addEventListener("click", (e) => {
    e.preventDefault();
    window.location.href = "http://127.0.0.1:5000/signup";
});