package com.example;

public class MyLibraryExtension {

    MyLibrary myLibrary;
    MyLibraryInternal libraryInternal;
    MyLibraryExtensionInternal extensionInternal;

    public MyLibraryExtension() {
        myLibrary = new MyLibrary();
        libraryInternal = new MyLibraryInternal();
        extensionInternal = new MyLibraryExtensionInternal();
    }

    public MyLibrary getMyLibrary() {
        return myLibrary;
    }
}
