function validate() {
    if (document.myForm.Name.value == "") {
      alert("Please provide your name!");
      document.myForm.Name.focus() ;
      return false;
    } else {
      let NAME = document.getElementById("NAME").value;
    }
    if (document.myForm.EMail.value == "") {
      alert("Please provide your Email!");
      document.myForm.EMail.focus() ;
      return false;
    }
    if (document.myForm.EMail.value != "") {
      if (validateEmail()) {
        let emailValue = document.getElementById("emailID").value;
      }         
    }
    if (document.myForm.Zip.value == "" || isNaN(document.myForm.Zip.value) || document.myForm.Zip.value.length != 5) {
      alert("Please provide a zip in the format #####.");
      document.myForm.Zip.focus();
      return false;
    }
    else { 
        let zipid = document.getElementById("ZipID").value;
      }
      if (document.myForm.Country.value == "-1") {
        alert( "Please provide your country!" );
        return false;         
      } else {
        let CountryId = document.getElementById("CountryId").value;
      }
      if (document.myForm.password.value == "") {
        alert( "Please provide your password" );
        document.myForm.password.focus();
        return false;
      } else { 
        let pass = document.getElementById("password").value;
        alert("Name: "+ NAME + ", Password: " + pass + ", Email: " + emailValue + " , Country: " + CountryId + " , Zip Code: " + zipid);
        return true;
      } 
      return(true); 
    }
    
  