
function loadProjects() {
  fetch('http://localhost:8080/api/projects')
    .then(function (response) {
      console.log(response);
      return response.json();
    })
    .then(function (data) {
      document.getElementById('projects-container').innerHTML = data.map(function (project) {
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
    .catch(function (err) {
      // Error :(
    });
}
loadProjects();
document.getElementById('new-btn').addEventListener('click', function (event) {
  event.preventDefault();
  document.getElementById('project-modal').style.display = 'block';
});

document.getElementById('cancel-btn').addEventListener('click', function() {
    document.getElementById('project-modal').style.display = 'none';
});

const myForm = document.getElementById('project-form');
myForm.addEventListener('submit', function (event) {
  event.preventDefault();
  const title = document.getElementById('project-name').value;
  const description = document.getElementById('project-description').value;

  fetch('http://localhost:8080/api/projects', {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json'
    },
    body: JSON.stringify({
      title: document.getElementById('project-name').value,
      description: document.getElementById('project-description').value
    })

  })
    .then(function (data) {
      document.getElementById('project-modal').style.display = 'none';
      myForm.reset();
      loadProjects();

    })
})
