// JSON verisini almak için API URL'si
const apiUrl = 'https://jsonplaceholder.typicode.com/posts';

// Tabloyu güncelleyen işlev
function updateTable(posts) {
    const tableBody = document.getElementById('post-table');
    tableBody.innerHTML = '';

    posts.forEach((post) => {
        const row = document.createElement('tr');
        row.innerHTML = `
            <td>${post.id}</td>
            <td>${post.title}</td>
            <td>${post.body}</td>
            <td><button class="btn btn-primary" data-post-id="${post.id}">Detay</button></td>
        `;
        tableBody.appendChild(row);
    });
}

// JSON verisini API'den al
fetch(apiUrl)
    .then((response) => response.json())
    .then((data) => {
        updateTable(data);
        // Detay butonlarına tıklamayı dinle
        const detailButtons = document.querySelectorAll('.btn-primary');
        detailButtons.forEach((button) => {
            button.addEventListener('click', () => {
                const postId = button.getAttribute('data-post-id');
                window.location.href = `detail-post.html?id=${postId}`;
            });
        });
    })
    .catch((error) => {
        console.error('Veri alınırken bir hata oluştu: ', error);
    });
