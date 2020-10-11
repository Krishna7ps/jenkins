FROM node
WORKDIR /usr/src/app 
COPY ./docker/package.json .
RUN npm install
COPY ./docker/ .
EXPOSE 8080
CMD ["node", "index.js"]
