package com.codingame.gameengine.runner.dto;

class Tooltip {
    int turn;
    String text;
    Integer event;

    public Tooltip(String text, int eventId, int turn) {
        this.turn = turn;
        this.text = text;
        this.event = eventId;
    }
}
