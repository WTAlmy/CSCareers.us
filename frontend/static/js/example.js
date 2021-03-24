$.get('http://34.68.104.62:8090/users/sample', function(data) {
  console.log(data);
  document.write("Username:" + data.username);
  document.write("<br> Password:" + data.password);
  document.write("<br> College:" + data.college);
  document.write("<br> GPA:" + data.gpa);
  document.write("<br> Year:" + data.collegeYear);
  document.write("<br> Internships:" + data.previousInternships);
  document.write("<br> ID:" + data.id);  
});
