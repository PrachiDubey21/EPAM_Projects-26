function trigger() {
    
    document.getElementById("hover").addEventListener("mouseover", popup, {
        once: true
    });

}

function popup() {
    alert("Welcome to XYZ bank !!!");
}


function hideSteps() {
    document.getElementById("demo").style.display = "none";
}


function validateCustomer() {

    var custId = document.getElementById("custID").value;
    var validateCust = custId.includes("XYZ");

    if (validateCust) {
        document.getElementById("message").textContent =
            "Customer ID is valid, you can proceed further to generate coupon";
    } 
    else {
        document.getElementById("message").textContent =
            "You are not a valid customer";
    }

}


function generateCoupon() {

    var custId = document.getElementById("custID").value;
    var x = custId + "789456";
    var validateCust = custId.includes("XYZ");

    if (validateCust) {
        document.getElementById("message").textContent =
            "Your coupon is: " + x;
    } 
    else {
        document.getElementById("message").textContent =
            "Invalid customer ID so coupon can't be generated";
    }

}