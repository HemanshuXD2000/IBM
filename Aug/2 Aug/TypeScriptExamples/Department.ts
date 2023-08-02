export class Department
{
    constructor(private _departmentId:number, private _departmentName:string) {
    }


    get departmentId(): number {
        return this._departmentId;
    }

    set departmentId(value: number) {
        this._departmentId = value;
    }

    get departmentName(): string {
        return this._departmentName;
    }

    set departmentName(value: string) {
        this._departmentName = value;
    }
}