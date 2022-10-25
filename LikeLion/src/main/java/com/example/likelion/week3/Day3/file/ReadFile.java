package com.example.likelion.week3.Day3.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;


public class ReadFile {
    private String filename;

    public ReadFile(String filename) {
        this.filename = filename;
    }

    public char readByte() {
        try (BufferedReader br = Files.newBufferedReader(
                Paths.get(this.filename), StandardCharsets.UTF_8)) {
            return (char) br.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String readTwoByte() {
        try (BufferedReader br = Files.newBufferedReader(
                Paths.get(this.filename), StandardCharsets.UTF_8)) {
            String str = "";
            for (int i = 0; i < 2; i++) {
                str += (char) br.read();
            }
            return str;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String readString(int n) {
        try (BufferedReader br = Files.newBufferedReader(
                Paths.get(this.filename), StandardCharsets.UTF_8)) {
            String str = "";
            for (int i = 0; i < n; i++) {
                str += (char) br.read();
            }
            return str;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}