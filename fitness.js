document.addEventListener('DOMContentLoaded', function() {
    // Hero section email form submission
    const emailForm = document.querySelector('#hero .email-form');
    if (emailForm) {
        emailForm.addEventListener('submit', function(event) {
            event.preventDefault();
            const emailInput = emailForm.querySelector('input[type="email"]');
            const emailValue = emailInput.value;

            if (emailValue) {
                alert(`Thank you for signing up with email: ${emailValue}`);
                emailInput.value = '';
            } else {
                alert('Please enter your email.');
            }
        });
    }

    // BMI Calculator form submission
    const bmiForm = document.getElementById('bmi-form');
    if (bmiForm) {
        bmiForm.addEventListener('submit', function(event) {
            event.preventDefault();
            const height = parseFloat(document.getElementById('height').value) / 100; // Convert cm to meters
            const weight = parseFloat(document.getElementById('weight').value);

            if (isNaN(height) || isNaN(weight) || height <= 0 || weight <= 0) {
                alert('Please enter valid height and weight.');
                return;
            }

            const bmi = weight / (height * height);
            const bmiResult = bmi.toFixed(2);

            let interpretation = '';
            if (bmi < 18.5) {
                interpretation = 'Underweight';
            } else if (bmi < 25) {
                interpretation = 'Normal weight';
            } else if (bmi < 30) {
                interpretation = 'Overweight';
            } else {
                interpretation = 'Obese';
            }

            document.getElementById('bmi-result').innerHTML = `Your BMI is: ${bmiResult} (${interpretation})`;
        });
    }
});
