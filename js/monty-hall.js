//TO DO's:
//Set variables
//Generate random number variable
//Create Start Game function to allow game to be played
//Create function to swap out door images when doors are clicked
//Add <p> to HTML for innerText changes (maybe change text below doors?)
//Look at Tic Tac Toe program to see how to disable buttons, etc.
//Disable doors until game starts
//Set up game controls (can't click more than one door at once)
//Add 'Play Again' and 'Keep Prize'buttons

var images = [
    "/img/money.png", 
    "/img/billyg.png", 
    "/img/laundry.png", 
    "/img/poop.png", 
    "/img/rotten-egg.png", 
    "/img/zombie.png"
];
var rand;

//switch(images){
//    case 0: document.getElementById().innerText = "You win!!"; break;
//    case 1: document.getElementById().innerText = "Meditating goat, tubular!!"; break;
//    case 2: document.getElementById().innerText = "My cat wouldn't even lay in that!!"; break;
//    case 3: document.getElementById().innerText = "What a cool stool!!"; break;
//    case 4: document.getElementById().innerText = "EW, gross!!"; break;
//    case 5: document.getElementById().innerText = "AHHHHHH!!"; break;
//}

function doorOne(){

rand = Math.floor(Math.random() * 6);

switch(rand){
    case 0: document.getElementById("door-image").src = images[0]; break;
    case 1: document.getElementById("door-image").src = images[1]; break;
    case 2: document.getElementById("door-image").src = images[2]; break;
    case 3: document.getElementById("door-image").src = images[3]; break;
    case 4: document.getElementById("door-image").src = images[4]; break;
    case 5: document.getElementById("door-image").src = images[5]; break;
}
}

function doorTwo(){

    rand = Math.floor(Math.random() * 6);
    
    switch(rand){
        case 0: document.getElementById("door-image2").src = images[0]; break;
        case 1: document.getElementById("door-image2").src = images[1]; break;
        case 2: document.getElementById("door-image2").src = images[2]; break;
        case 3: document.getElementById("door-image2").src = images[3]; break;
        case 4: document.getElementById("door-image2").src = images[4]; break;
        case 5: document.getElementById("door-image2").src = images[5]; break;
    }
}

function doorThree(){

    rand = Math.floor(Math.random() * 6);
    
    switch(rand){
        case 0: document.getElementById("door-image3").src = images[0]; break;
        case 1: document.getElementById("door-image3").src = images[1]; break;
        case 2: document.getElementById("door-image3").src = images[2]; break;
        case 3: document.getElementById("door-image3").src = images[3]; break;
        case 4: document.getElementById("door-image3").src = images[4]; break;
        case 5: document.getElementById("door-image3").src = images[5]; break;
    }
}


