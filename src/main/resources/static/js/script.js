document.addEventListener("DOMContentLoaded", function () {
    // Waiting for the page to load completely
    var successMessageDiv = document.getElementById("success-message");

    if (successMessageDiv) {
        // If the success message is present, set a timeout to remove it after 2 seconds
        setTimeout(function () {
            successMessageDiv.style.display = "none";
        }, 2000);
    }
});
