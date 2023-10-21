// Sayfa yüklendiğinde varsayılan olarak "Post Oluştur" sayfasını açın
//document.getElementById('content').innerHTML = '<h1>Post Oluştur</h1>';

// "Post Oluştur" bağlantısına tıklanınca "create-post.html" sayfasını aç
document.querySelector('a[href="#create-post"]').addEventListener('click', function () {
    // Sayfanın içeriğini değiştirerek "create-post.html" sayfasını yükleyin
    const content = document.getElementById('content');
    content.innerHTML = ''; // İçeriği temizle

    // "create-post.html" sayfasını yükle
    fetch('create-post.html')
        .then(response => response.text())
        .then(html => {
            content.innerHTML = html;
        })
        .catch(error => {
            console.error('Sayfa yüklenirken hata oluştu:', error);
        });
});
