interface StockItem
{
    id:number
    stockName:string;
    quantity:number;
}
class Warehouse
{
    private slot: {[location:string]:StockItem};

    constructor() {
        this.slot = {};
    }

    getStockItem(location:string): StockItem | undefined{
       return  this.slot[location];
}
    setStockItem(location:string, stockItem:StockItem)
    {
        this.slot[location]=stockItem;
    }
}
const warehouse = new Warehouse();

const newStock : StockItem = {
    id:1,
    stockName:"Product A",
    quantity:100
};

const newLocation = "A1"
warehouse.setStockItem(newLocation,newStock);

const retrievedStockItem = warehouse.getStockItem(newLocation);

if (retrievedStockItem)
{
    console.log("Stock Item Found:");
    console.log("ID:",retrievedStockItem.id);
    console.log("Name:",retrievedStockItem.stockName);
    console.log("Quantity:",retrievedStockItem.quantity);
}
else
{
    console.log("No Stock Item Found at Location:",newLocation);
}