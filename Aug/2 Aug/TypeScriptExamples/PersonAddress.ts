class Address
{
    private _addressLine1:string
    private _addressLine2:string
    private _city:string;

    constructor(addressLine1: string, addressLine2: string, city: string) {
        this._addressLine1 = addressLine1;
        this._addressLine2 = addressLine2;
        this._city = city;
    }

    get addressLine1(): string {
        return this._addressLine1;
    }

    set addressLine1(value: string) {
        this._addressLine1 = value;
    }

    get addressLine2(): string {
        return this._addressLine2;
    }

    set addressLine2(value: string) {
        this._addressLine2 = value;
    }

    get city(): string {
        return this._city;
    }

    set city(value: string) {
        this._city = value;
    }
}

class Persons
{

    private _firstName:string;
    private _lastName:string;
    private _email:string;
    private _address:Address;


    constructor(firstName: string, lastName: string, email: string, address: Address) {
        this._firstName = firstName;
        this._lastName = lastName;
        this._email = email;
        this._address = address;
    }

    get address(): Address {
        return this._address;
    }

    set address(value: Address) {
        this._address = value;
    }

    get firstName(): string {
        return this._firstName;
    }

    set firstName(value: string) {
        this._firstName = value;
    }

    get lastName(): string {
        return this._lastName;
    }

    set lastName(value: string) {
        this._lastName = value;
    }

    get email(): string {
        return this._email;
    }

    set email(value: string) {
        this._email = value;
    }

    getDetails(): string {
        return 'First Name: '+this._firstName+' \nLast Name: '+this._lastName+' \nEmail: '+this._email+
            ' \nAddress Line 1: '+address.addressLine1+' \nAddress Line 2: '+address.addressLine2+' \nCity: '+address.city;
    }
}

let address = new Address("North America","Los Angeles","California")

let person = new Persons("Tony","starks","ironmanTony@starks.inc",address);

console.log(person.getDetails());
