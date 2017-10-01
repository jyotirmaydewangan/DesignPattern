package com.dewangan.jyotirmay.behavioral.command;

/**
 * Created by jyotirmay.d on 01/10/17.
 */
public interface Command {
    public void execute();
    public void undo();
    public void redo();
}
