fetch('http://127.0.0.1:8080/personel')
.then(response => {
   if(!response.ok) {
        throw new Error('API isteği başarısız. Durum kodu : ' + response.status)
   }
   return response.json();
})
.then(data => {
    updateTable(data);
})
.catch(error => {
    console.error(error)
})

/*
 "id": 2,
        "firstName": "hasan",
        "surname": "m",
        "salary": 1587.54,
        "department": "IT",
        "gender": "M",
        "birthDate": "26/02/1995",
        "isMarried": false
*/
function updateTable(data) {

    console.log("response : " + data[0].id)
    //console.log("id : " + data.products[0].id)
  
    const tableBody = document.getElementById('table-body');
/*
    for(let i = 0 ; i < data.products.length; i++) {
        const row = document.createElement('tr');
        row.innerHTML =  `
        <td> ${data.products[i].id}</td>
        <td> ${data.products[i].title}</td>
        <td> ${data.products[i].price}</td>                       
       `
       tableBody.appendChild(row); // </tr>
    }
*/
    data.forEach(item => {
        const row = document.createElement('tr');
        row.innerHTML =  `
        <td> ${item.id}</td>
        <td> ${item.firstName}</td>
        <td> ${item.surname}</td>                       
        <td> ${item.salary}</td> 
        <td> ${item.department}</td> 
        <td> ${item.gender}</td> 
        <td> ${item.birthDate}</td> 
        <td> ${item.isMarried}</td> 
       `
       tableBody.appendChild(row); 
    });


  
  
}