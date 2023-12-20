CREATE TABLE Pedidos(
    ID INT PRIMARY KEY,
    clientID INT FOREIGN KEY NOT NULL,
    dataPedido DATA NOT NULL,
    total INT NOT NULL 
);

CREATE INDEX index_clientID ON Pedidos(clientID);