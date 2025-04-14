document.addEventListener('DOMContentLoaded', function() {
    const signupForm = document.getElementById('signup-form');

    signupForm.addEventListener('submit', function(event) {
        event.preventDefault();
        const nameInput = document.getElementById('name');
        const emailInput = document.getElementById('email');
        const usernameInput = document.getElementById('username');
        const passwordInput = document.getElementById('password');

        const name = nameInput.value;
        const email = emailInput.value;
        const username = usernameInput.value;
        const password = passwordInput.value;

        // In a real application, you would send this data to a server for authentication
        console.log('Signup data:', { name, email, username, password });
        alert('Signup successful!');
        window.location.href = 'login.html'; // Redirect to the login page
    });
});
