FROM node:latest

WORKDIR /app

COPY package*.json ./

RUN npm install

COPY . .

ENV VITE_PUBLIC_PORT 8080

EXPOSE 5173

CMD [ "npm", "run", "dev" ]
