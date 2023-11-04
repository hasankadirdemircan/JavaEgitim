const postForm = document.getElementById('post-form');

postForm.addEventListener('submit', function(event) {
    console.log("addEventListener is running")
    event.preventDefault();

    const firstName = document.getElementById('firstName').value;
    const surname = document.getElementById('surname').value;
    const salary = document.getElementById('salary').value;
    const department = document.getElementById('department').value;
    var birthDate = document.getElementById('birthDate').value;
    const isMarried = document.querySelector('input[name=marriedInfo]:checked').value;
    var genderOptions = document.getElementById("genderOptions");
    const gender = genderOptions.value;
  //  var btnId = $('input[name=genderInfo]:checked').attr('id');
  /*  var $radio = $('input[name=genderInfo]:checked');
    var gender = $radio.val();
    var id = $radio.attr('id');*/
    console.log(isMarried);
    console.log(gender);
    birthDate = birthDate.split("-").reverse().join("/");
    console.log(birthDate)
    fetch('http://127.0.0.1:8080/personel/save', {
        method: 'POST',
        body: JSON.stringify({
            firstName,
            surname,
            salary,
            department,
            birthDate,
            isMarried,
            gender
        }),
        headers: {
            'Content-type': 'application/json; charset=UTF-8',
        },
    })
    .then((response) => {
            if(!response.ok) {
                throw new Error('Gönderi oluşturma başarısız. Durum kodu:' + response.status);
            }
            return response.json();
    })
    .then((data) => {
        console.log('Oluşturulan gönderi : ', data);
        alert('Gönder başarıyla oluşturuldu.')

        postForm.reset();
    })
}) 

/*
{
    "id": 1,
    "firstName": "hasan",
    "surname": "m",
    "salary": 1587.54,
    "department": "IT",
    "gender": "M",
    "birthDate": "26/02/1995",
    "isMarried": false
}
*/