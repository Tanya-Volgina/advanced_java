package org.example.Readers;

import org.example.Common.Expression;

import java.util.InputMismatchException;

public interface IReader {
    Expression read() throws InputMismatchException;
}
