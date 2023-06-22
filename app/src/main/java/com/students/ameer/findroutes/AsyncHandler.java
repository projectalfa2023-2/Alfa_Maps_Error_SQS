package com.students.ameer.findroutes;

public abstract class AsyncHandler<T, T1> {
    public abstract void onSuccess(SendMessageRequest request, SendMessageResult sendMessageResult);

    public abstract void onError(Exception e);
}
