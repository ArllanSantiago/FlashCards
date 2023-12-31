FROM gradle:8.2.1-jdk17

RUN apt-get update && apt-get install -qq -y --no-recommends

ENV INSTALL_PATH /reactive-flashcards

RUN mkdir $INSTALL_PATH

WORKDIR $INSTALL_PATH

COPY . .