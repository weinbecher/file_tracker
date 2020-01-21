package com.codeclan.example.fileTracker.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

    @Entity
    @Table(name = "users")
    public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "name")
        private String name;


        @JsonIgnoreProperties("users")
        @OneToMany
        @JoinColumn(name = "folder_id", nullable = false)
        private List<Folder> folders;


        public User(String name) {
            this.name = name;
            this.folders = new ArrayList<>();
        }

        public User() {
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Folder> getFolders() {
            return folders;
        }

        public void setFolders(List<Folder> folders) {
            this.folders = folders;
        }


        public void addFolder(Folder folder){
            this.folders.add(folder);
        }
    }


