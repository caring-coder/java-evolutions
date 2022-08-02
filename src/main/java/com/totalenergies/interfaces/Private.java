package com.totalenergies.interfaces;

public interface Private {
    void publicFunction();

    private void privateFunction(){
        publicFunction();
    }
}
