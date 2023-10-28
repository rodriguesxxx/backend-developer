import { v4 } from "uuid";

export class CreatorEntity{
    constructor(name, robots = []){
        this.id = v4();
        this.name = name;
        this.robots = robots;
    }
}