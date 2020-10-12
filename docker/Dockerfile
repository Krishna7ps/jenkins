FROM node
WORKDIR /usr/src/app 
COPY ./package.json ./
RUN npm install
COPY ./index.js ./index.js
EXPOSE 8090
CMD ["node", "index.js"]
