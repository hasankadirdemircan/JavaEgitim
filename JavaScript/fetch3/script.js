const postForm = document.getElementById('post-form');

postForm.addEventListener('submit', function(event) {
    console.log("addEventListener is running")
    event.preventDefault();

    const title = document.getElementById('title').value;
    const body = document.getElementById('body').value;

    console.log(title);
    console.log(body);

    fetch('https://jsonplaceholder.typicode.com/posts', {
        method: 'POST',
        body: JSON.stringify({
            title,
            body,
            userId: 1
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