"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Training = void 0;
var Training = /** @class */ (function () {
    function Training(category, title, noOfDays) {
        this.category = category;
        this.title = title;
        this.noOfDays = noOfDays;
    }
    Training.prototype.buy = function () {
        console.log('Buying this ' + this.noOfDays + ' day(s) ' + this.title + ' course from category ' + this.category);
    };
    return Training;
}());
exports.Training = Training;
var BuyTraining = /** @class */ (function () {
    function BuyTraining(trainings) {
        this.trainings = trainings;
    }
    BuyTraining.prototype.buy = function () {
        var training = this.chooseTraining();
        training.buy();
    };
    BuyTraining.prototype.chooseTraining = function () {
        var whichTraining = 2;
        return this.trainings[whichTraining];
    };
    return BuyTraining;
}());
var trainings = [
    new Training('Drupal', 'Drupal 8 for Developers', 2),
    new Training('Angular', 'Angular 2 Fundamentals', 3),
    new Training('NodeJs', 'Developing web application using MEAN stack', 5)
];
var choice = new BuyTraining(trainings);
choice.buy();
