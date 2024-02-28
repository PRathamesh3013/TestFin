
document.getElementById("nameForm").addEventListener("submit", function(event) {
    event.preventDefault(); 
    
    var firstName = document.getElementById("firstName").value;
    var middleName = document.getElementById("middleName").value;
    var lastName = document.getElementById("lastName").value;

    
    var password = generatePassword(firstName, middleName, lastName);

  
    var form = new FormData(this);
    form.append("password", password);

    
    fetch("/save", {
        method: "POST",
        body: form
    }).then(response => {
        if (response.ok) {
            alert("Form submitted successfully!");
        } else {
            alert("Form submission failed!");
        }
    }).catch(error => {
        console.error("Error submitting form:", error);
    });
});

function generatePassword(firstName, middleName, lastName) {
    var password = "";
    password += firstName.substring(0, 2);
    password += middleName.substring(0, 2);
    password += lastName.substring(0, 2);
    password += Math.floor(100 + Math.random() * 900); 
    return password;
}
