document.getElementById('addTaskForm').addEventListener('submit', function(event) {
    event.preventDefault();

    // Clear any previous error messages
    const errorMessage = document.getElementById('error-message');
    if (errorMessage) {
        errorMessage.remove();
    }

    // Get form values
    const ticketNumber = document.getElementById('ticket').value;
    const chemicalName = document.getElementById('chemicalName').value;
    const origin = document.getElementById('origin').value;
    const warehouse = document.getElementById('warehouse').value;

    // Basic validation for inputs
    if (!ticketNumber || !chemicalName || !origin || !warehouse) {
        showError("Please fill in all the fields");
        return;
    }

    // Check if the ticket is accepted or rejected
    const isAccepted = ticketNumber.endsWith('A');
    let acceptanceStatus = isAccepted ? 'Accepted' : 'Rejected';

    // Get current timestamp
    const timestamp = new Date().toLocaleString();

    // Print log after marking the shipment
    logShipmentDetails(ticketNumber, chemicalName, origin, warehouse, timestamp, acceptanceStatus);
});

// Function to log shipment details
function logShipmentDetails(ticket, chemical, origin, warehouse, timestamp, status) {
    const log = `Ticket: ${ticket}, Chemical: ${chemical}, Origin: ${origin}, Warehouse: ${warehouse}, Timestamp: ${timestamp}, Status: ${status}`;
    console.log(log);

    // Optionally display it in the UI
    const logElement = document.getElementById('log');
    const logEntry = document.createElement('div');
    logEntry.textContent = log;
    logElement.appendChild(logEntry);
}

// Function to display error messages
function showError(message) {
    const errorContainer = document.createElement('div');
    errorContainer.id = 'error-message';
    errorContainer.textContent = message;
    document.getElementById('addTaskForm').appendChild(errorContainer);
}
