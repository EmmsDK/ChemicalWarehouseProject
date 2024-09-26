// Tab Navigation
const tabs = document.querySelectorAll('.tab');
const contents = document.querySelectorAll('.content');
tabs.forEach(tab => {
    tab.addEventListener('click', function () {
        tabs.forEach(t => t.classList.remove('active'));
        contents.forEach(c => c.classList.remove('active'));

        tab.classList.add('active');
        document.getElementById(tab.getAttribute('data-target')).classList.add('active');
    });
});

// Array to hold shipment data
let shipments = [];

// Form Submission and Adding Shipment
document.getElementById('addTaskForm').addEventListener('submit', function (event) {
    event.preventDefault();

    const ticketNumber = document.getElementById('ticket').value;
    const chemicalName = document.getElementById('chemicalName').value;
    const origin = document.getElementById('origin').value;
    const warehouse = document.getElementById('warehouse').value;
    const timestamp = new Date().toLocaleString();

    const isAccepted = ticketNumber.endsWith('A');
    const status = isAccepted ? 'Accepted' : 'Rejected';

    // Store shipment
    const shipment = { ticketNumber, chemicalName, origin, warehouse, timestamp, status };
    shipments.push(shipment);

    // Reset the form
    document.getElementById('addTaskForm').reset();

    // Update the table
    updateShipmentTable();
});

// Function to update the shipment table
function updateShipmentTable() {
    const tbody = document.getElementById('shipmentTable').querySelector('tbody');
    tbody.innerHTML = ''; // Clear existing rows

    shipments.forEach((shipment, index) => {
        const row = document.createElement('tr');

        row.innerHTML = `
            <td>${shipment.ticketNumber}</td>
            <td>${shipment.chemicalName}</td>
            <td>${shipment.origin}</td>
            <td>${shipment.warehouse}</td>
            <td>${shipment.timestamp}</td>
            <td><span class="edit" data-index="${index}">Edit</span></td>
            <td><span class="delete" data-index="${index}">Delete</span></td>
        `;

        tbody.appendChild(row);
    });

    // Add event listeners for Edit and Delete buttons
    document.querySelectorAll('.edit').forEach(button => {
        button.addEventListener('click', function () {
            const index = this.getAttribute('data-index');
            editShipment(index);
        });
    });

    document.querySelectorAll('.delete').forEach(button => {
        button.addEventListener('click', function () {
            const index = this.getAttribute('data-index');
            deleteShipment(index);
        });
    });
}

// Edit Shipment
function editShipment(index) {
    const newWarehouse = prompt('Enter new warehouse (A, B, C):', shipments[index].warehouse);
    if (newWarehouse && ['A', 'B', 'C'].includes(newWarehouse)) {
        shipments[index].warehouse = newWarehouse;
        updateShipmentTable();
    } else {
        alert('Invalid warehouse. Please enter A, B, or C.');
    }
}

// Delete Shipment
function deleteShipment(index) {
    shipments.splice(index, 1); // Remove the shipment from the array
    updateShipmentTable(); // Refresh the table
}
