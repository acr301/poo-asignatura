package com.github.acr301.sesion3.models;

public class Student {
  private String name;
  private String career;
  private String id;

  public String getName() {
    return name;
  }
  public void setNameLowerCaseNoSpaces(String name) {
    this.name = name.toLowerCase().replaceAll("\\s", "");
  }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
      this.id = validateId(id);
    }
    public String validateId(String id) {
        if (id.length() != 8) {
            System.out.println("tiene que tener 8 dígitos!");
            return "";
        }
        return id;
    }

}

