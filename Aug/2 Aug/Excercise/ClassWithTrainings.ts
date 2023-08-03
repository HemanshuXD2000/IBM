import {Training} from "./Training";

class CartWithTrainings {
    private trainings: Training[] = [];

    static maxTraining: number = 10;

    constructor(public cartId: string) {
    }

    addTraining(training: Training) {
        if (this.trainings.length >= CartWithTrainings.maxTraining) {
            throw new Error('To many courses in your Cart.');
        }
        this.trainings.push(training);
    }
}

// Creating a new instance
var coursesCart = new CartWithTrainings('Cart1');

// Accessing a public instance property
var nameCart = coursesCart.cartId;

// Calling a public instance method
coursesCart.addTraining(new Training('GIT', 'Git for Users', 1));

// Accessing a public static property
var maxTrainings = CartWithTrainings.maxTraining;