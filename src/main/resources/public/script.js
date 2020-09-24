const URL = 'http://localhost:8081';
let entries = [
    {
        "checkIn": new Date().toISOString(),
        "checkOut": new Date(new Date(new Date().valueOf() + 1000 * 60 * 60 * 2))
    },
    {
        "checkIn": new Date().toISOString(),
        "checkOut": new Date(new Date(new Date().valueOf() + 1000 * 60 * 60 * 4))
    }
];

const dateAndTimeToDate = (dateString, timeString) => {
    return new Date(`${dateString}T${timeString}`).toISOString();
};

const createEntry = (e) => {
    e.preventDefault();
    const formData = new FormData(e.target);
    const entry = {};
    entry['checkIn'] = dateAndTimeToDate(formData.get('checkInDate'), formData.get('checkInTime'));
    entry['checkOut'] = dateAndTimeToDate(formData.get('checkOutDate'), formData.get('checkOutTime'));
    fetch(`${URL}/entries`, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(entry)
    }).then((result) => {
        result.json().then((entry) => {
            entries.push(entry);
            renderEntries();
        });
    });
};

const indexEntries = () => {
    fetch(`${URL}/entries`, {
        method: 'GET'
    }).then((result) => {
        result.json().then((result) => {
            entries = result;
            renderEntries();
        });
    });
    renderEntries();
};

const createCell = (text) => {
    const cell = document.createElement('td');
    cell.innerText = text;
    return cell;
};
const appendButtonToCell = (index) => {
    const button = document.createElement('button');
    const cell = document.createElement('td');
    button.innerText = "delete";
    button.addEventListener("click", () => deleteCell(index));
    cell.appendChild(button);
    return cell;
}



const renderEntries = () => {
    const display = document.querySelector('#entryDisplay');
    display.innerHTML = '';
    entries.map((entry, index) => {
        const row = document.createElement('tr');
        row.appendChild(createCell(index));
        row.appendChild(createCell(new Date(entry.checkIn).toLocaleString()));
        row.appendChild(createCell(new Date(entry.checkOut).toLocaleString()));
        row.appendChild(appendButtonToCell(entry))
        display.appendChild(row);
        return entry;
    });
};
const deleteCell = (index) => {
    fetch(`${URL}/entries/${index}`,
        {
            method: 'DELETE',
        }).then(response => {
        if (response.status === 200) {
            alert('success!');
        }

    })
}
document.addEventListener('DOMContentLoaded', function () {
    const createEntryForm = document.querySelector('#createEntryForm');
    createEntryForm.addEventListener('submit', createEntry);
    indexEntries();
});



let rooms = [
    {
        "beds": new Number().toString(),
        "description": new String()
    },
    {
        "beds": new Number().toString(),
        "description": new String()
    }
];

const bedsAndDescription = (bedsNumber, descriptionString) => {
    return new room(`${bedsNumber}T${descriptionString}`).toISOString();
};

const createRoom = (e) => {
    e.preventDefault();
    const formData = new FormData(e.target);
    const category = {};
    room['beds'] = bedsAndDescription(formData.get('beds'));
    room['description'] = dateAndTimeToDate(formData.get('description'));
    fetch(`${URL}/categories`, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(room)
    }).then((result) => {
        result.json().then((room) => {
            rooms.push(room);
            renderRooms();
        });
    });
};

const indexRoom = () => {
    fetch(`${URL}/room`, {
        method: 'GET'
    }).then((result) => {
        result.json().then((result) => {
            rooms = result;
            renderRooms();
        });
    });
    renderRooms();
};






const renderRooms = () => {
    const display = document.querySelector('#roomDisplay');
    display.innerHTML = '';
    rooms.map((entry, index) => {
        const row = document.createElement('tr');
        row.appendChild(createCell(index));
        row.appendChild(createCell(new bedsAndDescription((room.beds).toLocaleString())));
        row.appendChild(createCell(room.description).toLocaleString());
        row.appendChild(appendButtonToCell(room))
        display.appendChild(row);
        return room;
    });
};
const deleteCell = (index) => {
    fetch(`${URL}/entries/${index}`,
        {
            method: 'DELETE',
        }).then(response => {
        if (response.status === 200) {
            alert('success!');
        }

    })
}




