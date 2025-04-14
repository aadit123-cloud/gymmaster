document.addEventListener('DOMContentLoaded', function() {
    // Get the selected plan from the URL parameters
    const urlParams = new URLSearchParams(window.location.search);
    const selectedPlan = urlParams.get('plan');

    // Display the selected plan on the page
    const selectedPlanElement = document.getElementById('selected-plan');
    if (selectedPlanElement) {
        selectedPlanElement.textContent = selectedPlan;
    }

    // Handle payment method selection
    const paymentMethodSelect = document.getElementById('payment-method');
    const cardDetailsDiv = document.getElementById('card-details');
    const upiDetailsDiv = document.getElementById('upi-details');

    paymentMethodSelect.addEventListener('change', function() {
        if (this.value === 'card') {
            cardDetailsDiv.style.display = 'block';
            upiDetailsDiv.style.display = 'none';
        } else if (this.value === 'upi') {
            cardDetailsDiv.style.display = 'none';
            upiDetailsDiv.style.display = 'block';
        }
    });

    // Handle the payment form submission
    const paymentForm = document.getElementById('payment-form');
    if (paymentForm) {
        paymentForm.addEventListener('submit', function(event) {
            event.preventDefault();
            const paymentMethod = document.getElementById('payment-method').value;

            if (paymentMethod === 'card') {
                // Simulate card payment processing
                const cardNumber = document.getElementById('card-number').value;
                const expiryDate = document.getElementById('expiry-date').value;
                const cvv = document.getElementById('cvv').value;

                if (!cardNumber || !expiryDate || !cvv) {
                    alert('Please fill in all card details.');
                    return;
                }
            } else if (paymentMethod === 'upi') {
                // Simulate UPI payment processing
                const upiId = document.getElementById('upi-id').value;

                if (!upiId) {
                    alert('Please enter your UPI ID.');
                    return;
                }
            }

            // Simulate payment processing
            alert('Payment successful! Thank you for your purchase.');
            window.location.href = 'index.html'; // Redirect to the main page
        });
    }
});
