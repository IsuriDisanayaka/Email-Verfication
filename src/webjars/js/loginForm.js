$("#btncreate").click(function() {


                let ID = $("#inputID").val();
                let Name = $("#inputName").val();
                let Email = $("#inputEmail").val();
                let Address = $("#inputAddress").val();
                let Salary = $("#inputSalary").val();
                let Password = $("#inputPassword").val();

                $.ajax({
                    method: "POST",
                    url: "http://localhost:8080/api/v1/user/save",
                    contentType: 'application/json',
                    async: true,
                    data: JSON.stringify({
                        id: ID,
                        name: Name,
                        email: Email,
                        address: Address,
                        salary: Salary,
                        password: Password,
                    }),
                    success:function (data) {
        console.log(data);

    }
})
})



// function checkvalidationUser() {
//
//     let name = $('#inputName').val();
//     let contact = $('#inputContactNo').val();
//     let email = $('#inputEmail').val();
//     let address = $('#inputAddress').val();
//     let drivingLicenceNo = $('#inputDrivingLicence').val();
//     let nic = $('#inputNIC').val();
//     let userName = $('#inputUserName').val();
//     let password = $('#inputPassword').val();
//
//     if (name!=""){
//         if (contact!=""){
//             if(email!=""){
//                 if (address!=""){
//                     if (drivingLicenceNo!=""){
//                         if (nic!=""){
//
//                                     return true;
//                                 }else{
//                                     alert("Please Enter Password");
//                                     return false;
//                                 }
//                             }else{
//                                 alert("Please Enter Username");
//                                 return false;
//                             }
//                         }else{
//                             alert("Please Enter NIC");
//                             return false;
//                         }
//                     }else{
//                         alert("Please Enter Driving Licence No");
//                         return false;
//                     }
//                 }else{
//                     alert("Please Enter Address");
//                     return false;
//                 }
//             }else{
//                 alert("Please Enter Email Address");
//                 return false;
//             }
//
//
//
// }


function clearRegFeild() {
      $("#inputID").val("");
     $("#inputName").val("");
     $("#inputEmail").val("");
     $("#inputAddress").val("");
     $("#inputSalary").val("");
     $("#inputPassword").val("");

}
