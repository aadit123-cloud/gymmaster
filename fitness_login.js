document.addEventListener('DOMContentLoaded', function() {
    const loginForm = document.getElementById('login-form');

    loginForm.addEventListener('submit', function(event) {
        event.preventDefault();
        const usernameInput = document.getElementById('username');
        const passwordInput = document.getElementById('password');

        const username = usernameInput.value;
        const password = passwordInput.value;

        // In a real application, you would send this data to a server for authentication
        if (username === 'user' && password === 'password') {
            alert('Login successful!');
            window.location.href = 'fitness.html'; // Redirect to the main page
        } else {
            alert('Invalid username or password.');
        }
    });
});
