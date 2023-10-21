// URL'den post ID'sini al
const urlParams = new URLSearchParams(window.location.search);
const postId = urlParams.get('id');

// JSON verisini almak için API URL'si
const apiUrl = `https://jsonplaceholder.typicode.com/posts/${postId}`;

// Detayları görüntüleyen işlev
function showPostDetails(post) {
    const postDetails = document.getElementById('post-details');
    postDetails.innerHTML = `
        <h2>${post.title}</h2>
        <p>${post.body}</p>
    `;
}

// JSON verisini API'den al
fetch(apiUrl)
    .then((response) => response.json())
    .then((data) => {
        showPostDetails(data);
    })
    .catch((error) => {
        console.error('Veri alınırken bir hata oluştu: ', error);
    });
