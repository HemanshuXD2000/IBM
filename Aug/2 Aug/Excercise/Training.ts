export class Training
{
    constructor(private category:string,private title:string,private noOfDays:number) {
    }

    buy()
    {
        console.log('Buying this '+this.noOfDays+' day(s) '+this.title+' course from category '+this.category);
    }
}

class BuyTraining
{
    constructor(private trainings:Training[]) {
    }

    buy()
    {
        let training = this.chooseTraining();
        training.buy();
    }

    private chooseTraining(){
        let whichTraining = 2;
        return this.trainings[whichTraining];
    }
}

let trainings = [
    new Training('Drupal','Drupal 8 for Developers',2),
    new Training('Angular','Angular 2 Fundamentals', 3),
    new Training('NodeJs','Developing web application using MEAN stack',5)
];

let choice = new BuyTraining(trainings);
choice.buy();