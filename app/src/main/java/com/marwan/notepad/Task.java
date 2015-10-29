package com.marwan.notepad;

/**
 * Created by marwan on 10/28/2015.
 */
public class Task {

    private String taskName;
    private int status;
    private int id;

    public Task(){

        this.taskName =null;
        this.status = 0;
    }

    public Task(String taskName, int status){
        super();
        this.taskName = taskName;
        this.status = status;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getStatus() {
        return status;
    }

    public int getId() {
        return id;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setId(int id) {
        this.id = id;
    }
}
