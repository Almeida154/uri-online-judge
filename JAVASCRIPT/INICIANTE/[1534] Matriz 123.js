var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

while(op = Number(lines.shift())){

    var matriz = new Array()
    var auxVet = []
    var aux = op - 1

    for(var i = 0; i < op; i++){
        for(var j = 0; j < op; j++){
            auxVet[j] = 3
            if(j == i) auxVet[j] = 1
            if(j == aux) auxVet[j] = 2
        }
        aux--
        matriz[i] = auxVet.join('')
        auxVet = []
    }
    console.log(`${matriz.join('\n')}`);
}