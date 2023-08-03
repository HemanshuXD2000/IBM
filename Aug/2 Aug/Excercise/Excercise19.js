var Warehouse = /** @class */ (function () {
    function Warehouse() {
        this.slot = {};
    }
    Warehouse.prototype.getStockItem = function (location) {
        return this.slot[location];
    };
    Warehouse.prototype.setStockItem = function (location, stockItem) {
        this.slot[location] = stockItem;
    };
    return Warehouse;
}());
var warehouse = new Warehouse();
var newStock = {
    id: 1,
    stockName: "Product A",
    quantity: 100
};
var newLocation = "A1";
warehouse.setStockItem(newLocation, newStock);
var retrievedStockItem = warehouse.getStockItem(newLocation);
if (retrievedStockItem) {
    console.log("Stock Item Found:");
    console.log("ID:", retrievedStockItem.id);
    console.log("Name:", retrievedStockItem.stockName);
    console.log("Quantity:", retrievedStockItem.quantity);
}
else {
    console.log("No Stock Item Found at Location:", newLocation);
}
