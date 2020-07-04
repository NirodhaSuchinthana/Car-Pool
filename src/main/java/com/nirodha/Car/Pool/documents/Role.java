package com.nirodha.Car.Pool.documents;

import com.nirodha.Car.Pool.documents.enums.ERole;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "roles")
public class Role {

    @Id
    private String id;
    private ERole roleName;

    public Role(){

    }

    public Role(ERole roleName){
        this.roleName = roleName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ERole getRoleName() {
        return roleName;
    }

    public void setRoleName(ERole roleName) {
        this.roleName = roleName;
    }
}
