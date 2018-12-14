//TO DO's:
//Maybe prevent only 2 clicks?

var images = [
    "/img/money.png", 
    "/img/billyg.png", 
    "/img/laundry.png", 
    "/img/poop.png", 
    "/img/rotten-egg.png", 
    "/img/zombie.png"
];
var rand;
var clicks = 0;

switch(images){
    case 0: document.getElementById("win-lose").innerText = "You win!!"; break;
    case 1: document.getElementById("win-lose").innerText = "Meditating goat, tubular!!"; break;
    case 2: document.getElementById("win-lose").innerText = "My cat wouldn't even lay in that!!"; break;
    case 3: document.getElementById("win-lose").innerText = "What a cool stool!!"; break;
    case 4: document.getElementById("win-lose").innerText = "EW, gross!!"; break;
    case 5: document.getElementById("win-lose").innerText = "AHHHHHH!!"; break;
}

//document.getElementById("start-game").style.display = "none";

function restartGame() { 
    //Hides the Play Again and Keep Prize buttons
    document.getElementById("play-again").style.display = "none";
    document.getElementById("keep-prize").style.display = "none";

    //Brings back the Start Game button
    document.getElementById("start-game").style.display = "block";

    //Sets images back to a shut door
    document.getElementById("door-image").src = "/img/doorShut.jpg";
    document.getElementById("door-image2").src = "/img/doorShut.jpg";
    document.getElementById("door-image3").src = "/img/doorShut.jpg";

    //Removes functionality from doors
    document.getElementById("door-image").onclick = "";
    document.getElementById("door-image2").onclick = "";
    document.getElementById("door-image3").onclick = "";

    //Puts win-lose text back to original
    document.getElementById("win-lose").innerText = "Do you think fate is on your side? Let's play!!";

}

function startGame(){
    //Hides the Start Game button
    document.getElementById("start-game").style.display = "none";

    //Hides win-lose text
    document.getElementById("win-lose").style.display = "none";

    //Adds functions back to doors
    document.getElementById("door-image").onclick = doorOne;
    document.getElementById("door-image2").onclick = doorTwo;
    document.getElementById("door-image3").onclick = doorThree;
}

function playAgain(){
        //Hides all buttons
        document.getElementById("play-again").style.display = "none";
        document.getElementById("keep-prize").style.display = "none";
        document.getElementById("start-game").style.display = "none";
    
        //Sets images back to a shut door
        document.getElementById("door-image").src = "/img/doorShut.jpg";
        document.getElementById("door-image2").src = "/img/doorShut.jpg";
        document.getElementById("door-image3").src = "/img/doorShut.jpg";

        //Adds functions back to doors
        document.getElementById("door-image").onclick = doorOne;
        document.getElementById("door-image2").onclick = doorTwo;
        document.getElementById("door-image3").onclick = doorThree;
    
        //Hides text
        document.getElementById("win-lose").style.display = "none";
}

function keepPrize(){
    //Congratulates user for keeping their prize
    alert("Congratulations!! We hope you enjoy your prize!!");

    //Starts game from beginning
    restartGame();
}

function doorOne(){

    rand = Math.floor(Math.random() * 6);
    clicks++;

        switch(rand){
            case 0: document.getElementById("door-image").src = images[0]; break;
            case 1: document.getElementById("door-image").src = images[1]; break;
            case 2: document.getElementById("door-image").src = images[2]; break;
            case 3: document.getElementById("door-image").src = images[3]; break;
            case 4: document.getElementById("door-image").src = images[4]; break;
            case 5: document.getElementById("door-image").src = images[5]; break;
        }

        //Removes functionality from doors
        document.getElementById("door-image").onclick = "";
        document.getElementById("door-image2").onclick = "";
        document.getElementById("door-image3").onclick = "";

        //Makes 'Play Again' and 'Keep Prize' buttons visible
        document.getElementById("play-again").style.display = "block";
        document.getElementById("keep-prize").style.display = "block";

        //Allows win-lose text to be visible and changes depending on image
        document.getElementById("win-lose").style.display = "block";
        switch(rand){
            case 0: document.getElementById("win-lose").innerText = "You win!!"; break;
            case 1: document.getElementById("win-lose").innerText = "Meditating goat, tubular!!"; break;
            case 2: document.getElementById("win-lose").innerText = "My cat wouldn't even lay in that!!"; break;
            case 3: document.getElementById("win-lose").innerText = "What a cool stool!!"; break;
            case 4: document.getElementById("win-lose").innerText = "EW, gross!!"; break;
            case 5: document.getElementById("win-lose").innerText = "AHHHHHH!!"; break;
        }
}

function doorTwo(){

    rand = Math.floor(Math.random() * 6);
    clicks++;
    
    switch(rand){
        case 0: document.getElementById("door-image2").src = images[0]; break;
        case 1: document.getElementById("door-image2").src = images[1]; break;
        case 2: document.getElementById("door-image2").src = images[2]; break;
        case 3: document.getElementById("door-image2").src = images[3]; break;
        case 4: document.getElementById("door-image2").src = images[4]; break;
        case 5: document.getElementById("door-image2").src = images[5]; break;
    }

    //Removes functionality from doors
    document.getElementById("door-image").onclick = "";
    document.getElementById("door-image2").onclick = "";
    document.getElementById("door-image3").onclick = "";

    //Makes 'Play Again' and 'Keep Prize' buttons visible
    document.getElementById("play-again").style.display = "block";
    document.getElementById("keep-prize").style.display = "block";

    //Allows win-lose text to be visible and changes depending on image
    document.getElementById("win-lose").style.display = "block";
    switch(rand){
        case 0: document.getElementById("win-lose").innerText = "You win!!"; break;
        case 1: document.getElementById("win-lose").innerText = "Meditating goat, tubular!!"; break;
        case 2: document.getElementById("win-lose").innerText = "My cat wouldn't even lay in that!!"; break;
        case 3: document.getElementById("win-lose").innerText = "What a cool stool!!"; break;
        case 4: document.getElementById("win-lose").innerText = "EW, gross!!"; break;
        case 5: document.getElementById("win-lose").innerText = "AHHHHHH!!"; break;
    }
}

function doorThree(){

    rand = Math.floor(Math.random() * 6);
    clicks++;
    
    switch(rand){
        case 0: document.getElementById("door-image3").src = images[0]; break;
        case 1: document.getElementById("door-image3").src = images[1]; break;
        case 2: document.getElementById("door-image3").src = images[2]; break;
        case 3: document.getElementById("door-image3").src = images[3]; break;
        case 4: document.getElementById("door-image3").src = images[4]; break;
        case 5: document.getElementById("door-image3").src = images[5]; break;
    }

    //Removes functionality from doors
    document.getElementById("door-image").onclick = "";
    document.getElementById("door-image2").onclick = "";
    document.getElementById("door-image3").onclick = "";

    //Makes 'Play Again' and 'Keep Prize' buttons visible
    document.getElementById("play-again").style.display = "block";
    document.getElementById("keep-prize").style.display = "block";

    //Allows win-lose text to be visible and changes depending on image
    document.getElementById("win-lose").style.display = "block";
    switch(rand){
        case 0: document.getElementById("win-lose").innerText = "You win!!"; break;
        case 1: document.getElementById("win-lose").innerText = "Meditating goat, tubular!!"; break;
        case 2: document.getElementById("win-lose").innerText = "My cat wouldn't even lay in that!!"; break;
        case 3: document.getElementById("win-lose").innerText = "What a cool stool!!"; break;
        case 4: document.getElementById("win-lose").innerText = "EW, gross!!"; break;
        case 5: document.getElementById("win-lose").innerText = "AHHHHHH!!"; break;
    }
}


