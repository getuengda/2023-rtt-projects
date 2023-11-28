let employeeList = [
    {name: "Getu", lastname: "tad", email: 'getu@gmail.com', password: "123456", department:'Engineering'},
    {name: "Kb", lastname: "Wako", email: 'kb@gmail.com', password: "123456", department:'IT'},
    {name: "Somu", lastname: "Sako", email: 'somu@gmail.com', password: "123456", department:'Cyber'},
    {name: "Danu", lastname: "Bako", email: 'danu@gmail.com', password: "123456", department:'Research'},
    {name: "Kanu", lastname: "Kaku", email: 'kanu@gmail.com', password: "123456", department:'Training'},
    {name: "Abbe", lastname: "Baddu", email: 'abbe@gmail.com', password: "123456", department:'Project'},
    {name: "Kaddi", lastname: "Fafu", email: 'kaddi@gmail.com', password: "123456", department:'Engineering'},
    {name: "Sami", lastname: "LesaLumino", email: 'sami@gmail.com', password: "123456", department:'Engineering'},
    {name: "Dolli", lastname: "Hensi", email: 'dolli@gmail.com', password: "123456", department:'Cyber'},
    {name: "Siria", lastname: "Sario", email: 'siria@gmail.com', password: "123456", department:'AI'},
    {name: "Kuri", lastname: "Mekan", email: 'kuri@gmail.com', password: "123456", department:'AI'},
]


let departmentList = [
    'Engineering',
    'Artificial Inteligence',
    'Cyber Security',
    'Research and Innovation',
    'Green Technology',
    'Training and Development',
    'Project Managment',
    'Staff Managment',
    'Information Technology'
]

document.getElementById('category').addEventListener('change', function() {
    let tableBody = document.getElementById('infoTable').getElementsByTagName('tbody')[0];
    //clear the the table
    tableBody.innerHTML = '';

    let category = this.value;
    let data;

     if (category === 'employee') {
        data = employeeList.filter(employee => employee.name === 'Getu'); 
    } else {
        data = employeeList;
    }

    data.forEach(item => {
        let row = tableBody.insertRow();
        let nameCell = row.insertCell(0);
        let lastnameCell = row.insertCell(1);
        let emailCell = row.insertCell(2);
        let passwordCell = row.insertCell(3);
        let departmentCell = row.insertCell(4);
        // let departmentCell = row.insertCell(1);
        
        nameCell.textContent = item.name;
        lastnameCell.textContent = item.lastname;
        emailCell.textContent = item.email;
        passwordCell.textContent = item.password;
        departmentCell.textContent = item.department;
        // departmentCell.textContent = item.department;
    });
});