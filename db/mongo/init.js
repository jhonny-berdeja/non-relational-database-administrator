db = db.getSiblingDB('db-mongodb-jberdeja'); // Selecciona la base de datos
db.people.insertMany([
    { name: "John", lastname: "Doe", age: 30, dni: 123456789 },
    { name: "Jane", lastname: "Doe", age: 25, dni: 987654321 }
]);