package com.example.kz.maxim.project.repository;

import com.example.kz.maxim.project.RepoInterface;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class RepoC implements RepoInterface {
    public void functionC() {
        System.out.println("class (RepoC) method called");
    }

    @Override
    public void repoMethod() {
        System.out.println("class (RepoC) method");
    }
}
