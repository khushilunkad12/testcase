# Java NullPointerException Test Case

## Description

This repository contains a simple Java application with a runtime bug.

## Steps to Reproduce

Compile:

javac src/UserService.java

Run:

java -cp src UserService

## Expected Behavior

The application should print the length of the user's name.

## Actual Behavior

The application crashes with a NullPointerException.

## Error Log

Exception in thread "main" java.lang.NullPointerException:
Cannot invoke "String.length()" because "name" is null

at UserService.main(UserService.java:7)
