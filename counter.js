const fs = require('fs');
const ir = fs.readFileSync('./.COUNTER', 'utf-8')
const i = JSON.parse(ir);
i.count=i.count+1;
console.log("Current Build: " + i.count)
const io = JSON.stringify(i);
fs.writeFileSync('./.COUNTER', io)