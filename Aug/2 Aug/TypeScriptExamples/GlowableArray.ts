let sportsOne:string[] = ["Golf","Cricket","Tennis","Swimming"];
for (let tempSport of sportsOne)
{
    if(tempSport=="Cricket")
    {
        console.log(tempSport+" <<My Favorite!");
    }
    else
    {
        console.log(tempSport);
    }
}

let sportsTwo:string[] = ["\n\nGolf","Cricket","Tennis"];
sportsTwo.push("Baseball");
sportsTwo.push("FootBall");
for(let tempSport of sportsTwo)
{
    console.log(tempSport);
}