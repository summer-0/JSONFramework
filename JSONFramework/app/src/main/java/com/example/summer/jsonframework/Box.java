package com.example.summer.jsonframework;

/**
 *
 *
 * @param <T>
 */
public class Box<T> {
    private T data;

    public T getData(){
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
