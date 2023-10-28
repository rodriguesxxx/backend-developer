import { v4 } from "uuid";

export class RobotEntity{
    constructor(name, creator){
        this.id = v4();
        this.name = name;
        this.creator = creator;
    }
}