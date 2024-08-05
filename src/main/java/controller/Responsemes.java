package controller;

import lombok.Data;

public class Responsemes {

    public record ResponsePayload<T>(T data, String message) {

}
