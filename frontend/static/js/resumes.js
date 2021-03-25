$.get('http://34.68.104.62:8090/resumes/sample/resume', function(data) {
  //var fileUrl = data.fileUrl;
  //var title = data.title;
  //var description = data.description;
  //var username = data.username;
  document.getElementById("titleLink").innerHTML= data.title;
  document.getElementById("fileUrlLink").innerHTML= data.fileUrl;
  document.getElementById("descriptionLink").innerHTML= data.description;
  document.getElementById("usernameLink").innerHTML= data.username;
});

