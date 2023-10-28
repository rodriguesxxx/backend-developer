import express from 'express'
import { RobotEntity } from './models/robot.entity.js';
import { CreatorEntity } from './models/creator.entity.js';

const app = express();

let robots = []
let creators = []

app.use(express.json());

app.listen(3000, () => {
    console.log("server subiu na porta: 3000");
} );

app.get('/creators', (req, res) => {
    
    return res.status(200)
        .json(creators)
        .send();

} );

app.get('/robots', (req, res) => {
    
    return res.status(200)
        .json(robots)
        .send();

} );

app.post( '/add/creator', (req, res) => {
    
    console.log(req.body);

    const {
        name,
        robots
    } = req.body;

    const newCreator = new CreatorEntity(name, robots);

    creators.push(newCreator);

    return res.status(201).json(newCreator).send();
} );

app.post( '/add/robot', (req, res) => {
    const {
        name,
        creator
    } = req.body;

    let checkedCreator = isValidCreator(creator.id)
    if( creator && checkedCreator ){
        const newRobot = new RobotEntity(name, creator);
        robots.push(newRobot);
        checkedCreator.robots.push( {"id":newRobot.id} );
        
        return res.status(201).json(newRobot).send();
    }

    return res.status(401).json( {"message":"Esse criador não existe!!!"} ).send();


} );


function isValidCreator(creatorID) {
    return creators
        .find( (creator) =>  creator.id === creatorID );
}