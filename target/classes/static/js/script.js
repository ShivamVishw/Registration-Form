document.addEventListener("DOMContentLoaded", function () {
    // Wait for the page to load completely
    var successMessageDiv = document.getElementById("success-message");

    if (successMessageDiv) {
        // If the success message is present, set a timeout to remove it after 5 seconds (adjust this as needed)
        setTimeout(function () {
            successMessageDiv.style.display = "none";
        }, 2000);
    }
});