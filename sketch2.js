var objectA,objectB;
function setup(){
    createCanvas(600,400);
    gameobject=createSprite(200,100,20,100);
    gameobject.debug=true;
    gameobject.shapeColor="white";

    gameobject2=createSprite(300,100,20,100);
    gameobject2.debug=true;
    gameobject2.shapeColor="white";

}
function draw(){
    background("black");
    objectB.x=mouseX;
    objectB.y=mouseY;
    console.log("width"+(objectA.width/2+objectB.width/2));
    console.log("xposition"+(objectB.x-objectA.x));
    isTouching(gameobject,gameobject2);
    
        
    drawSprites();
}

function isTouching(objectA,objectB){
    if(objectB.x-objectA.x < objectA.width/2+objectB.width/2
        && objectA.x-objectB.x < objectA.width/2+objectB.width/2){
        objectB.shapeColor="yellow";
        objectA.shapeColor="yellow";
    }
    else{
        objectB.shapeColor="white";
        objectA.shapeColor="white";
    }
}