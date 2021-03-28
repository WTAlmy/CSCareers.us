const signupForm = document.getElementById("signup-form");
const signupButton = document.getElementById("signup-form-submit");
const loginButton = document.getElementById("login-form-submit");

signupButton.addEventListener("click", (e) => {
    e.preventDefault();
    const username = signupForm.username.value;
    const password = signupForm.password.value;
    const GPA = signupForm.GPA.value;
    const college = signupForm.college.value;
    const collegeYear = signupForm.collegeYear.value;
    const previousInternships = signupForm.previousInternships.value;

    $.ajax({
        type: "POST",
        url: "http://34.68.104.62:8090/users/create",
        data: { username:username, password:password, GPA:GPA, college:college, collegeYear:collegeYear, 
            previousInternships:previousInternships},
        dataType: "json",
    }).done(function( data ) {
        console.log(data);
        alert("Account Created! Please log in");
        // redirect to login page
        window.location.href = "http://127.0.0.1:5000/login"
    });
})

loginButton.addEventListener("click", (e) => {
    e.preventDefault();
    window.location.href = "http://127.0.0.1:5000/login";
});