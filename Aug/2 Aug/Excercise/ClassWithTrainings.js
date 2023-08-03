"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Training_1 = require("./Training");
var CartWithTrainings = /** @class */ (function () {
    function CartWithTrainings(cartId) {
        this.cartId = cartId;
        this.trainings = [];
    }
    CartWithTrainings.prototype.addTraining = function (training) {
        if (this.trainings.length >= CartWithTrainings.maxTraining) {
            throw new Error('To many courses in your Cart.');
        }
        this.trainings.push(training);
    };
    CartWithTrainings.maxTraining = 10;
    return CartWithTrainings;
}());
// Creating a new instance
var coursesCart = new CartWithTrainings('Cart1');
// Accessing a public instance property
var nameCart = coursesCart.cartId;
// Calling a public instance method
coursesCart.addTraining(new Training_1.Training('GIT', 'Git for Users', 1));
// Accessing a public static property
var maxTrainings = CartWithTrainings.maxTraining;
