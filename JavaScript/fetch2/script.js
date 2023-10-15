fetch('https://dummyjson.com/products')
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

    console.log("response : " + data.products)
    console.log("id : " + data.products[0].id)
    console.log("title: " + data.products[0].title)
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
    data.products.forEach(item => {
        const row = document.createElement('tr');
        row.innerHTML =  `
        <td> ${item.id}</td>
        <td> ${item.title}</td>
        <td> ${item.price}</td>                       
       `
       tableBody.appendChild(row); 
    });


  
  
}