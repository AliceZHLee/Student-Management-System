/**
 * 
 */
function validateForm() {

  var x = document.getElementById("departmentid_box").value;
  if (x == "") {
    alert("Departmentid cannot be empty.");
    return false;
  }
  
  var y = document.getElementById("firstname_box").value;
  if (y == "") {
    alert("Department name cannot be empty.");
    return false;
  }
}