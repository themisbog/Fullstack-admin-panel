console.log("Προσπάθεια σύνδεσης...");
fetch('http://localhost:8080/api/projects')
  .then(function(response) {
    console.log(response);
    return response.json();
  })
  .then(function(data) {
    document.getElementById('projects-container').innerHTML = data.map(function(project) {
      return `
    <div class="card">
        <h3>${project.title}</h3>
        <p>${project.description}</p>
        <div class="icon-container">
            <span class="mdi mdi-star-plus-outline"></span>
           <span class="mdi mdi-eye-plus-outline"></span>
           <span class="mdi mdi-share-variant"></span>
            </div>
    </div>
`;
    }).join('');
    console.log(data)
  })
  .catch(function(err) {
    // Error :(
  });