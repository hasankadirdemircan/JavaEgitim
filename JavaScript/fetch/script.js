fetch('https://dummyjson.com/products/1', {
    method: 'GET',
})
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

function updateTable(data) {
    console.log("response : " + data)
    console.log("id : " + data.id)
    console.log("title: " + data.title)
    const tableBody = document.getElementById('table-body');
    const row = document.createElement('tr');

    row.innerHTML =  `
     <td> ${data.id}</td>
     <td> ${data.title}</td>
     <td> ${data.price}</td>                       
    `
    tableBody.appendChild(row);
}